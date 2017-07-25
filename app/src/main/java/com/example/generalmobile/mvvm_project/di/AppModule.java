package com.example.generalmobile.mvvm_project.di;

import android.app.Application;
import android.content.Context;

import com.example.generalmobile.mvvm_project.MainApp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by btstajyer7 on 24.07.2017.
 */

@Module
public class AppModule {
    private MainApp mainApp;

    public AppModule(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    @Singleton
    @Provides
    Application provideApp() {
        return mainApp;
    }

    @Singleton
    @Provides
    Context provideContext() {
        return mainApp.getApplicationContext();
    }
}
