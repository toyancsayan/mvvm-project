package com.example.generalmobile.mvvm_project.main;

import android.databinding.ObservableField;
import android.view.View;
import android.widget.Toast;

import com.example.generalmobile.mvvm_project.model.Product;

/**
 * Created by btstajyer7 on 24.07.2017.
 */

public class MainItemViewModel {

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
}
