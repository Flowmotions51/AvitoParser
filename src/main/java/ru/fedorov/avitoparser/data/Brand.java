package ru.fedorov.avitoparser.data;

public class Brand {
    private String name;
    private String brandModelsLink;

    public Brand(String name, String brandModelsLink) {
        this.name = name;
        this.brandModelsLink = brandModelsLink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandModelsLink() {
        return brandModelsLink;
    }

    public void setBrandModelsLink(String brandModelsLink) {
        this.brandModelsLink = brandModelsLink;
    }
}


