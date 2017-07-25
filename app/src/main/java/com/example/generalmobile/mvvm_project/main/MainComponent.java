package com.example.generalmobile.mvvm_project.main;

import com.example.generalmobile.mvvm_project.di.ActivityScope;
import com.example.generalmobile.mvvm_project.di.AppComponent;
import com.example.generalmobile.mvvm_project.screens.screen14.Screen14ViewModel;

import dagger.Component;

/**
 * Created by btstajyer7 on 24.07.2017.
 */

@ActivityScope
@Component(dependencies = {AppComponent.class})
public interface MainComponent {
    void inject(MainViewModel mainViewModel);
    void inject14(Screen14ViewModel screen14ViewModel);
}
