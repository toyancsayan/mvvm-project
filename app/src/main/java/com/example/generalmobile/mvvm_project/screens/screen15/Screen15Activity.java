package com.example.generalmobile.mvvm_project.screens.screen15;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.generalmobile.mvvm_project.R;
import com.example.generalmobile.mvvm_project.base.BaseActivity;

/**
 * Created by btstajyer7 on 25.07.2017.
 */

public class Screen15Activity extends BaseActivity implements android.databinding.DataBindingComponent {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        DataBindingUtil.setContentView(this, R.layout.activity_screen15);
        super.onCreate(savedInstanceState);
    }
}
