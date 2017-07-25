package com.example.generalmobile.mvvm_project.screens.screen13;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import com.example.generalmobile.mvvm_project.MainApp;
import com.example.generalmobile.mvvm_project.db.Database;
import com.example.generalmobile.mvvm_project.main.MainActivity;
import com.example.generalmobile.mvvm_project.model.BasketItem;
import com.example.generalmobile.mvvm_project.model.Product;
import com.example.generalmobile.mvvm_project.rest.APIService;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by MONSTER on 25.7.2017.
 */

public class Screen13ViewModel extends AndroidViewModel {
    private LiveData<List<BasketItem>> basketItems;

    @Inject
    Database database;


    public Screen13ViewModel(Application application) {
        super(application);

        DaggerScreen13Component.builder()
                .appComponent(((MainApp)getApplication()).getAppComponent())
                .build()
                .inject(this);
    }

    public LiveData<List<BasketItem>> getBasketItems() {
        if (basketItems == null) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 1; i < 2; i++) {
                        Product p = new Product();
                        p.setProductId(i);
                        p.setName(String.format("item%d", i));
                        p.setPrice(i * 100);
                        p.setSubCategoryId(100 + i);
                        p.setCategoryId(1);
                        p.setRate(Math.random() * 5);
                        p.setContent("asdasd");
                        p.setReview(400);
                        p.setTypeVariant("A");
                        p.setColorVariant("3");
                        p.setProductImageUrl("https://i.hizliresim.com/6XJM5W.jpg");
                        database.basketItemDao().insertBasketItem(new BasketItem(p));
                    }
                }
            }).start();

        }

        return basketItems;
    }
}
