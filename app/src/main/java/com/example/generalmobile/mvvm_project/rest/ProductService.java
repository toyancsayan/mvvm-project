package com.example.generalmobile.mvvm_project.rest;

import com.example.generalmobile.mvvm_project.entity.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by btstajyer7 on 24.07.2017.
 */


public interface ProductService {
    @GET("/Product")
    Call<List<Product>> getProductData();
}
