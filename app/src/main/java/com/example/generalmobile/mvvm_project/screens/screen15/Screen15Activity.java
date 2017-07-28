package com.example.generalmobile.mvvm_project.screens.screen15;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.generalmobile.mvvm_project.R;
import com.example.generalmobile.mvvm_project.base.BaseActivity;
import com.example.generalmobile.mvvm_project.databinding.ActivityScreen15Binding;

/**
 * Created by btstajyer7 on 25.07.2017.
 */

public class Screen15Activity extends BaseActivity implements android.databinding.DataBindingComponent {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        DataBindingUtil.setContentView(this, R.layout.activity_screen15);
        super.onCreate(savedInstanceState);
        ActivityScreen15Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_screen15);
        Screen15ViewModel model = new Screen15ViewModel(this);
        binding.setModel(model);
        Screen15ViewModel screen15Viewmodel = new Screen15ViewModel(this);


    }



}
