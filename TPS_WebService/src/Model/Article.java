package Model;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="articles")
@XmlType(propOrder = {"publishedAt","author","urlImage","description","source","title","url"})
public class Article {
    private String publishedAt;
    private String author;
    private String urlImage;
    private String description;
    private String source;
    private String title;
    private String url;
    public Article(){

    }

    public Article(String publishedAt, String author, String urlImage, String description, String source, String title, String url, String content) {
        this.publishedAt = publishedAt;
        this.author = author;
        this.urlImage = urlImage;
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

    @XmlElement(name="urlImage")
    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    @XmlElement(name="description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElement(name="source")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
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
