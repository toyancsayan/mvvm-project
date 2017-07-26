package com.example.generalmobile.mvvm_project.screens.screen8;

import com.example.generalmobile.mvvm_project.di.ActivityScope;
import com.example.generalmobile.mvvm_project.di.AppComponent;

import dagger.Component;

/**
 * Created by zeynepsaracbasi on 25/07/2017.
 */

@ActivityScope
@Component(dependencies = {AppComponent.class})
public interface Screen8Component {
    void inject(Screen8ViewModel viewModel);
}