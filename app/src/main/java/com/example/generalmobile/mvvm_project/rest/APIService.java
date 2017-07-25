package com.example.generalmobile.mvvm_project.rest;

import com.example.generalmobile.mvvm_project.model.Category;
import com.example.generalmobile.mvvm_project.model.Product;
import com.example.generalmobile.mvvm_project.model.Subcategory;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by btstajyer7 on 24.07.2017.
 */


public interface APIService {
    @GET("/Product")
    Call<List<Product>> getProductData();

    @GET("/Category")
    Call<List<Category>> getCategoryData();

    @GET("/SubCategory")
    Call<List<Subcategory>> getSubcategoryData();
}
