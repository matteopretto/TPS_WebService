package Model;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.*;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.net.URIBuilder;
import org.json.JSONObject;
import org.json.XML;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;


public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, ParseException {
        System.out.println("Ciao Pretto");
        CloseableHttpClient client = HttpClients.createDefault();
        URIBuilder ubi = new URIBuilder("https://www.googleapis.com/books/v1/volumes");
        ubi.addParameter("q","pride+prejudice");
        ubi.addParameter("download","epub");
        FileReader fileReader = new FileReader("TPS_WebService/config/app.properties");
        Properties properties = new Properties();
        properties.load(fileReader);
        ubi.addParameter("key",properties.getProperty("key"));
        URI uri = ubi.build();
        HttpGet get = new HttpGet(uri);
        ClassicHttpResponse response = client.execute(get);
        HttpEntity entity = response.getEntity();
        String str = EntityUtils.toString(entity);
        System.out.println(str);
        JSONObject json = new JSONObject(str);
        String xml = XML.toString(json);
        System.out.println(xml);



    }
}
