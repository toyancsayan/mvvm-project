package com.example.generalmobile.mvvm_project.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by btstajyer7 on 24.07.2017.
 */

@Entity
public class Category {
    @Expose
    @SerializedName("id")
    @PrimaryKey
    private Long categoryId;
    @Expose
    @SerializedName("name")
    private String categoryName;
    @Expose
    @SerializedName("productCount")
    private int productCount;
    @Expose
    @SerializedName("imageUrl")
    private String catgoryImageUrl;

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getProductCount() {
        return this.productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public String getCatgoryImageUrl() {
        return this.catgoryImageUrl;
    }

    public void setCatgoryImageUrl(String catgoryImageUrl) {
        this.catgoryImageUrl = catgoryImageUrl;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj != null && obj instanceof Category && this.categoryId.equals(((Category) obj).categoryId));
    }
}