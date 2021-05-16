package com.example.buoi_5;

public class Tin_tuc {
    String id;
    String title;
    String des;
    String pubDate;
    String link;
    String img_Path;

    public Tin_tuc() {
    }

    public Tin_tuc(String id, String title, String des, String pubDate, String link, String img_Path) {
        this.id = id;
        this.title = title;
        this.des = des;
        this.pubDate = pubDate;
        this.link = link;
        this.img_Path = img_Path;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImg_Path() {
        return img_Path;
    }

    public void setImg_Path(String img_Path) {
        this.img_Path = img_Path;
    }
}
