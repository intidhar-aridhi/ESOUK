package com.example.e_souk.model;

public class discountedProducts {
    Integer id;
    Integer imageurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImageurl() {
        return imageurl;
    }

    public void setImageurl(Integer imageurl) {
        this.imageurl = imageurl;
    }

    public discountedProducts(Integer id, int imageurl) {
        this.id = id;
        this.imageurl = imageurl;

    }
}
