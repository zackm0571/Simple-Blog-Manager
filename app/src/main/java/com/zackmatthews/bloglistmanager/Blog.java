package com.zackmatthews.bloglistmanager;

public class Blog {
    private String title, description, link;

    public Blog(String title, String description, String link) {
        this.title = title;
        this.description = description;
        this.link = link;
    }
    public Blog(){

    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
