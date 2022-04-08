package Service;

import Model.DataStore;
import Model.Notizia;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.net.URIBuilder;
import org.json.JSONObject;
import org.json.XML;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.net.URI;
import java.util.HashMap;

public class SentAndReceive {


    public static void sentRequestAndReceiveEverything(HashMap<String,String> parameter){
        CloseableHttpClient client = HttpClients.createDefault();
        URIBuilder ubi;
        URI uri;
        HttpGet httpGet;
        try {
            ubi = new URIBuilder("https://newsapi.org/v2/everything");
            for(HashMap.Entry<String, String> entry : parameter.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                ubi.addParameter(key,value);
            }
            uri = ubi.build();
            httpGet = new HttpGet(uri);
            ClassicHttpResponse response = client.execute(httpGet);
            HttpEntity entity = response.getEntity();
            String str = EntityUtils.toString(entity);
            JSONObject json = new JSONObject(str);
            String xml = XML.toString(json,"notizie");
            JAXBContext context = JAXBContext.newInstance(Notizia.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Notizia notizia = (Notizia) unmarshaller.unmarshal(new StringReader(xml.replaceAll("<(/{0,1})@", "<$1__at__")));
            DataStore.setArticles(notizia.getArticles());
        } catch (Exception e) {
            System.out.println("Qualcosa non va !!!!");
        }

    }
}
