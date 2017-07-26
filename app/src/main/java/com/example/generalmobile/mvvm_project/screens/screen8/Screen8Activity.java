package com.example.generalmobile.mvvm_project.screens.screen8;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.generalmobile.mvvm_project.R;
import com.example.generalmobile.mvvm_project.base.BaseActivity;
import com.example.generalmobile.mvvm_project.model.Category;
import com.example.generalmobile.mvvm_project.model.Product;
import com.example.generalmobile.mvvm_project.screens.screen8.Screen8Adapter;
import com.example.generalmobile.mvvm_project.screens.screen8.Screen8ViewModel;


import java.util.List;

/**
 * Created by zeynepsaracbasi on 25/07/2017.
 */

public class Screen8Activity extends BaseActivity implements android.databinding.DataBindingComponent{
    DrawerLayout drawerLayout;
    RecyclerView recyclerView;
    Toolbar toolbar;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        DataBindingUtil.setContentView(this, R.layout.activity_screen8);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer8);
        recyclerView = (RecyclerView) findViewById(R.id.rw8);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        createMenu(toolbar, drawerLayout);
        Screen8ViewModel viewModel = ViewModelProviders.of(this).get(Screen8ViewModel.class);
        super.onCreate(savedInstanceState);

        viewModel.getProductList().observe(this, new Observer<List<Product>>() {
            @Override
            public void onChanged(@Nullable List<Product> products) {
                if (products == null)
                    return;
                fillRecycler(products);
            }
        });

    }

    private void fillRecycler(List<Product> products) {
        Screen8Adapter adapter = new Screen8Adapter(products, this);
        recyclerView.setAdapter(adapter);
    }

}