package com.example.generalmobile.mvvm_project;

import android.app.Application;

import com.example.generalmobile.mvvm_project.di.AppComponent;
import com.example.generalmobile.mvvm_project.di.AppModule;
import com.example.generalmobile.mvvm_project.di.DaggerAppComponent;
import com.example.generalmobile.mvvm_project.di.DatabaseModule;
import com.example.generalmobile.mvvm_project.di.ServiceModule;

/**
 * Created by btstajyer7 on 24.07.2017.
 */

public class MainApp extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .databaseModule(new DatabaseModule())
                .serviceModule(new ServiceModule())
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
