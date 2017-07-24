package com.example.generalmobile.mvvm_project.main;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import com.example.generalmobile.mvvm_project.MainApp;
import com.example.generalmobile.mvvm_project.db.Database;
import com.example.generalmobile.mvvm_project.entity.Product;
import com.example.generalmobile.mvvm_project.rest.ProductService;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by btstajyer7 on 24.07.2017.
 */

public class MainViewModel extends AndroidViewModel {
    private LiveData<List<Product>> productList;

    @Inject
    Database database;
    @Inject
    ProductService productService;

    public MainViewModel(Application application) {
        super(application);

        DaggerMainComponent.builder()
                .appComponent(((MainApp)getApplication()).getAppComponent())
                .build()
                .inject(this);
    }

    public LiveData<List<Product>> getProductList() {
        if (productList == null)
            productList = getProducts();

        return productList;
    }

    public LiveData<List<Product>> getProducts() {
        productService.getProductData().enqueue(new Callback<List<Product>>() {
            @Override
            public void onResponse(Call<List<Product>> call, final Response<List<Product>> response) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        database.productDao().insert(response.body());
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
