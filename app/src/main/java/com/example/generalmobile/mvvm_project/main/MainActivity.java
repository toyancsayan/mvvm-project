package com.example.generalmobile.mvvm_project.main;

import android.arch.lifecycle.LifecycleActivity;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;

import com.example.generalmobile.mvvm_project.R;
import com.example.generalmobile.mvvm_project.model.Product;

import java.util.List;

public class MainActivity extends LifecycleActivity implements android.databinding.DataBindingComponent {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainViewModel viewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        viewModel.getProductList().observe(this, new Observer<List<Product>>() {
            @Override
            public void onChanged(@Nullable List<Product> products) {
                fillRecycler(products);
            }
        });

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
    }

    private void fillRecycler(List<Product> products) {
        ProductAdapter adapter = new ProductAdapter(products, this);
        recyclerView.setAdapter(adapter);
    }
}
