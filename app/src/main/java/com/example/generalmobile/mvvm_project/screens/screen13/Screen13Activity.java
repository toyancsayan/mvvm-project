package com.example.generalmobile.mvvm_project.screens.screen13;

import android.app.usage.NetworkStats;
import android.arch.lifecycle.LifecycleActivity;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.generalmobile.mvvm_project.R;
import com.example.generalmobile.mvvm_project.model.BasketItem;
import com.example.generalmobile.mvvm_project.screens.screen13.Screen13ViewModel;

import java.util.List;

/**
 * Created by MONSTER on 25.7.2017.
 */

public class Screen13Activity extends LifecycleActivity implements DataBindingComponent {
    private RecyclerView recyclerView;

    private Screen13ViewModel viewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DataBindingUtil.setContentView(this, R.layout.activity_screen13);
        viewModel = ViewModelProviders.of(this).get(Screen13ViewModel.class);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view13);

        recyclerView.setLayoutManager(new LinearLayoutManager(this) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        });

        viewModel.getBasketItems().observe(this, new Observer<List<BasketItem>>() {
            @Override
            public void onChanged(@Nullable List<BasketItem> basketItemList) {
                fillAdapter(basketItemList);
            }
        });
    }

    private void fillAdapter(List<BasketItem> basketItemList) {
        Screen13Adapter adapter = new Screen13Adapter(basketItemList, this);
        recyclerView.setAdapter(adapter);
    }
}
