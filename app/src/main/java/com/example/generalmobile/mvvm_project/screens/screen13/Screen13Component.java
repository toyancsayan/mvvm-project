package com.example.generalmobile.mvvm_project.screens.screen13;

import com.example.generalmobile.mvvm_project.di.ActivityScope;
import com.example.generalmobile.mvvm_project.di.AppComponent;

import dagger.Component;

/**
 * Created by MONSTER on 25.7.2017.
 */

@ActivityScope
@Component(dependencies = {AppComponent.class})
public interface Screen13Component {
    void inject(Screen13ViewModel viewModel);
}
