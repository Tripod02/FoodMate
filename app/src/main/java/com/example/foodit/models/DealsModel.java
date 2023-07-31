package com.example.foodit.models;

public class DealsModel {
    int image;
    String name,discount,type,description;

    public DealsModel(int image, String name, String discount, String type, String description) {
        this.image = image;
        this.name = name;
        this.discount = discount;
        this.type = type;
        this.description = description;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
