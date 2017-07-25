package com.example.generalmobile.mvvm_project.model;

/**
 * Created by btstajyer7 on 24.07.2017.
 */

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by btstajyer7 on 12.07.2017.
 */

@Entity
public class Subcategory {
    @Expose
    @PrimaryKey
    @SerializedName("id")
    private Long subCategoryId;
    @Expose
    @SerializedName("name")
    private String subCategoryName;
    @Expose
    @SerializedName("categoryId")
    private Long categoryId;

    public Long getSubCategoryId() {
        return this.subCategoryId;
    }

    public void setSubCategoryId(Long subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getSubCategoryName() {
        return this.subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj != null && obj instanceof Subcategory && this.subCategoryId.equals(((Subcategory) obj).subCategoryId));
    }
}
