package Model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Oniichan
 * @data 20/04/2022
 * @project TPS_WebService
 */
@XmlRootElement(name = "source")
public class Source {
    private String name;
    private String id;

    public Source() {
    }

    public Source(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @XmlElement(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
