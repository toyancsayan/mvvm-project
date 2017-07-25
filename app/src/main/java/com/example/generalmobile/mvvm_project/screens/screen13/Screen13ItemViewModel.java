package com.example.generalmobile.mvvm_project.screens.screen13;

import android.databinding.ObservableField;

import com.example.generalmobile.mvvm_project.model.BasketItem;
import com.example.generalmobile.mvvm_project.model.Product;

/**
 * Created by MONSTER on 25.7.2017.
 */

public class Screen13ItemViewModel {
    private ObservableField<BasketItem> basketItem = new ObservableField<>();

    public ObservableField<BasketItem> getBasketItem() {
        return basketItem;
    }

    public void setBasketItem(BasketItem basketItem) {
        this.basketItem.set(basketItem);
    }
}
