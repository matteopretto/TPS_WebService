package Model;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.*;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.net.URIBuilder;
import org.json.JSONObject;
import org.json.XML;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, ParseException {
        System.out.println("Ciao Pretto");
        CloseableHttpClient client = HttpClients.createDefault();
        URIBuilder ubi = new URIBuilder("https://newsapi.org/v2/everything");
        ubi.addParameter("q","tesla");
        ubi.addParameter("from","2022-03-01");
        ubi.addParameter("sortBy","publishedAt");
        ubi.addParameter("pageSize","10");
        ubi.addParameter("page","1");
        FileReader fileReader = new FileReader("TPS_WebService/config/app.properties");
        Properties properties = new Properties();
        properties.load(fileReader);
        ubi.addParameter("apiKey",properties.getProperty("key1"));
        URI uri = ubi.build();
        HttpGet get = new HttpGet(uri);
        ClassicHttpResponse response = client.execute(get);
        HttpEntity entity = response.getEntity();
        String str = EntityUtils.toString(entity);
        System.out.println(str);
        JSONObject json = new JSONObject(str);
        String xml = XML.toString(json,"notizie");
        System.out.println(xml);


        JAXBContext context = null;
        Unmarshaller unmarshaller = null;
        Notizia notizia = null;
        try {
            context = JAXBContext.newInstance(Notizia.class);
            unmarshaller = context.createUnmarshaller();
            notizia = (Notizia) unmarshaller.unmarshal(new StringReader(xml.replaceAll("<(/{0,1})@", "<$1__at__")));

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        System.out.println(notizia.getTotalResults() + " " +notizia.getStatus());
        ArrayList<Article> articoli = notizia.getArticles();
        for (Article a : articoli) {
            System.out.println(a);
        }

    }
}
