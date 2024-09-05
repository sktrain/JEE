package sk.train;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {

    private int id = 1;
    private String name = "Karrer";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
