package com.example.e_souk.model;

public class Product {

    Integer id;
    Integer imageProducturl;

    public Product(Integer id, Integer imageurl) {
        this.id = id;
        this.imageProducturl = imageurl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImageurl() {
        return imageProducturl;
    }

    public void setImageurl(Integer imageurl) {
        this.imageProducturl = imageurl;
    }
}
