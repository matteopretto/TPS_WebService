package Model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;

@XmlRootElement(name="notizie")
public class Notizia {
    private String totalResults;
    private String status;
    private ArrayList<Article> articles;

    public Notizia(){

    }


    public Notizia(String totalResults, String status, ArrayList<Article> articleArrayList) {
        this.totalResults = totalResults;
        this.status = status;
        this.articles = articleArrayList;

    }

    @XmlElement(name="totalResults")
    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    @XmlElement(name="status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @XmlElement(name="articles")
    public ArrayList<Article> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Article> articleArrayList) {
        this.articles = articleArrayList;
    }
}
