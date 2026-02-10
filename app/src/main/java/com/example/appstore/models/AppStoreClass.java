package com.example.appstore.models;

public class AppStoreClass {
    private int id;
    private int image;
    private String name;
    private String category;
    private String rate;
    private String size;
    private boolean status;

    public AppStoreClass(int id, int image, String name, String category, String rate, String size, boolean status) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.category = category;
        this.rate = rate;
        this.size = size;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
