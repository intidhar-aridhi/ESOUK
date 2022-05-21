package com.example.e_souk.model;

public class ProductinCart {
    Integer id;
    Integer imageProductCurl;
    String nameProduct;
    String ProductPrice;

    public ProductinCart() {
    }

    public ProductinCart(Integer id, Integer imageProductCurl, String nameProduct, String productPrice) {
        this.id = id;
        this.imageProductCurl = imageProductCurl;
        this.nameProduct = nameProduct;
        ProductPrice = productPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImageProductCurl() {
        return imageProductCurl;
    }

    public void setImageProductCurl(Integer imageProductCurl) {
        this.imageProductCurl = imageProductCurl;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(String productPrice) {
        ProductPrice = productPrice;
    }
}
