package com.example.generalmobile.mvvm_project.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
public class Product {
    @PrimaryKey
    @SerializedName("id")
    @Expose
    private Integer productId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("subCategoryId")
    @Expose
    private Integer subCategoryId;
    @SerializedName("categoryId")
    @Expose
    private Integer categoryId;
    @SerializedName("rate")
    @Expose
    private Double rate;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("review")
    @Expose
    private Integer review;
    @SerializedName("typeVariant")
    @Expose
    private String typeVariant;
    @SerializedName("colorVariant")
    @Expose
    private String colorVariant;
    @SerializedName("imageUrl")
    @Expose
    private String productImageUrl;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(Integer subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getReview() {
        return review;
    }

    public void setReview(Integer review) {
        this.review = review;
    }

    public String getTypeVariant() {
        return typeVariant;
    }

    public void setTypeVariant(String typeVariant) {
        this.typeVariant = typeVariant;
    }

    public String getColorVariant() {
        return colorVariant;
    }

    public void setColorVariant(String colorVariant) {
        this.colorVariant = colorVariant;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && obj instanceof Product && this.productId.equals(((Product) obj).getProductId());
    }
}
