package com.example.generalmobile.mvvm_project.screens.screen14;

import com.example.generalmobile.mvvm_project.di.ActivityScope;
import com.example.generalmobile.mvvm_project.di.AppComponent;
import com.example.generalmobile.mvvm_project.main.MainViewModel;

import dagger.Component;

/**
 * Created by btstajyer7 on 24.07.2017.
 */

@ActivityScope
@Component(dependencies = {AppComponent.class})
public interface Screen14Component {
    void inject(Screen14ViewModel viewModel);
}

