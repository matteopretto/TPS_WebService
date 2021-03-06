package Model;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="articles")
@XmlType(propOrder = {"publishedAt","author","urlToImage","description","source","title","url"})
public class Article {
    private String publishedAt;
    private String author;
    private String urlToImage;
    private String description;
    private Source source;
    private String title;
    private String url;
    public Article(){

    }

    public Article(String publishedAt, String author, String urlToImage, String description, Source source, String title, String url, String content) {
        this.publishedAt = publishedAt;
        this.author = author;
        this.urlToImage = urlToImage;
        this.description = description;
        this.source = source;
        this.title = title;
        this.url = url;
    }

    @XmlElement(name="publishedAt")
    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    @XmlElement(name="author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @XmlElement(name="urlToImage")
    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    @XmlElement(name="description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElement(name="source")
    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    @XmlElement(name="title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @XmlElement(name="url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public String toString(){
        return "autore : " + author
                +"\ntitle : "+ title
                +"\ndescrizione : "+ description;
    }
}
