package ru.fedorov.avitoparser.data;

public class Model {
    private String name;
    private String link;

    public Model(String name, String link) {
        this.name = name;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }
}
