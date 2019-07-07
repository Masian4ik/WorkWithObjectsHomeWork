package com.mainacad.model;

public class Item {
    private String article;
    private String name;
    private String price;

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Item() {
    }

    public Item(String article, String name, String price) {
        this.article = article;
        this.name = name;
        this.price = price;


    }
}



