package com.example.generalmobile.mvvm_project.screens.screen8;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import com.example.generalmobile.mvvm_project.MainApp;
import com.example.generalmobile.mvvm_project.db.Database;
import com.example.generalmobile.mvvm_project.main.DaggerMainComponent;
import com.example.generalmobile.mvvm_project.model.Product;
import com.example.generalmobile.mvvm_project.rest.APIService;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by zeynepsaracbasi on 25/07/2017.
 */


public class Screen8ViewModel extends AndroidViewModel {
    private LiveData<List<Product>> productList;

    @Inject
    Database database;
    @Inject
    APIService service;

    public Screen8ViewModel(Application application) {
        super(application);

        DaggerMainComponent.builder()
                .appComponent(((MainApp)getApplication()).getAppComponent())
                .build()
                .inject8(this);
    }
    public LiveData<List<Product>> getProductList() {
        if (productList == null)
            productList = getProducts();

        return productList;
    }

    private LiveData<List<Product>> getProducts() {
        service.getProductData().enqueue(new Callback<List<Product>>() {
            @Override
            public void onResponse(Call<List<Product>> call, final Response<List<Product>> response) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        database.productDao().insertProduct(response.body());
                    }
                }).start();
            }

            @Override
            public void onFailure(Call<List<Product>> call, Throwable t) {
                t.printStackTrace();
            }
        });

        return database.productDao().getProducts();
    }
}
