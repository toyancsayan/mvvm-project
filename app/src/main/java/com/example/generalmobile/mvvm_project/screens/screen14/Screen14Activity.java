package com.example.generalmobile.mvvm_project.screens.screen14;

import android.arch.lifecycle.LifecycleActivity;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;


import com.example.generalmobile.mvvm_project.R;
import com.example.generalmobile.mvvm_project.base.BaseActivity;
import com.example.generalmobile.mvvm_project.model.Category;

import java.util.List;

/**
 * Created by btstajyer7 on 24.07.2017.
 */

public class Screen14Activity extends BaseActivity implements android.databinding.DataBindingComponent {

    DrawerLayout drawerLayout;

    RecyclerView recyclerView;
    Toolbar toolbar;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        DataBindingUtil.setContentView(this, R.layout.activity_screen14);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view14);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        createMenu(toolbar, drawerLayout);
        super.onCreate(savedInstanceState);
        Screen14ViewModel viewModel = ViewModelProviders.of(this).get(Screen14ViewModel.class);
        viewModel.getCategoryList().observe(this, new Observer<List<Category>>() {
            @Override
            public void onChanged(@Nullable List<Category> categories) {
                if (categories == null)
                    return;
                fillRecycler(categories);
            }
        });

    }

    private void fillRecycler(List<Category> categories) {
        Screen14Adapter adapter = new Screen14Adapter(categories, this);
        recyclerView.setAdapter(adapter);
    }

}
