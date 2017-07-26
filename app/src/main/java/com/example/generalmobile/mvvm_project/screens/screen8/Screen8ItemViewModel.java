package com.example.generalmobile.mvvm_project.screens.screen8;

import android.databinding.ObservableField;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.generalmobile.mvvm_project.model.Category;
import com.example.generalmobile.mvvm_project.model.Product;

/**
 * Created by zeynepsaracbasi on 26/07/2017.
 */

public class Screen8ItemViewModel {
    private ObservableField<Product> product = new ObservableField<>();

    public ObservableField<Product> getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product.set(product);
    }

    public void click(View view) {
        Toast.makeText(view.getContext(), product.get().getName(), Toast.LENGTH_SHORT).show();
    }
    public void loadImage(ImageView view, String imageUrl){

    }
}
