package com.example.generalmobile.mvvm_project.screens.screen14;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import com.example.generalmobile.mvvm_project.MainApp;
import com.example.generalmobile.mvvm_project.db.Database;
import com.example.generalmobile.mvvm_project.main.DaggerMainComponent;
import com.example.generalmobile.mvvm_project.model.Category;
import com.example.generalmobile.mvvm_project.model.Product;
import com.example.generalmobile.mvvm_project.rest.APIService;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by btstajyer7 on 24.07.2017.
 */

public class Screen14ViewModel extends AndroidViewModel {
    private LiveData<List<Category>> categoryList;

    @Inject
    Database database;
    @Inject
    APIService service;

    public Screen14ViewModel(Application application) {
        super(application);

        DaggerMainComponent.builder()
                .appComponent(((MainApp)getApplication()).getAppComponent())
                .build()
                .inject14(this);
    }
    public LiveData<List<Category>> getCategoryList() {
        if (categoryList == null)
            categoryList = getCategories();

        return categoryList;
    }

    private LiveData<List<Category>> getCategories() {
        service.getCategoryData().enqueue(new Callback<List<Category>>() {
            @Override
            public void onResponse(Call<List<Category>> call, final Response<List<Category>> response) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        database.categoryDao().insertCategory(response.body());
                    }
                }).start();
            }

            @Override
            public void onFailure(Call<List<Category>> call, Throwable t) {
                t.printStackTrace();
            }
        });

        return database.categoryDao().getCategories();
    }

    }

