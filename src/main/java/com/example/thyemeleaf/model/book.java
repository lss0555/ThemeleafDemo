package com.example.thyemeleaf.model;

public class book {
    private int id;
    private String name;
    private String htmlText;
    private String type;

    public book(int id,String name, String htmlText, String type) {
        this.id= id;
        this.name = name;
        this.htmlText = htmlText;
        this.type = type;
    }

    public book() {
    }

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

    public String getHtmlText() {
        return htmlText;
    }

    public void setHtmlText(String htmlText) {
        this.htmlText = htmlText;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
