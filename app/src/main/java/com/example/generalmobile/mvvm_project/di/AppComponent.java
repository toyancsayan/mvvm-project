package com.example.generalmobile.mvvm_project.di;

import android.arch.persistence.room.Dao;
import android.content.Context;

import com.example.generalmobile.mvvm_project.db.Database;
import com.example.generalmobile.mvvm_project.rest.APIService;


import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by btstajyer7 on 24.07.2017.
 */

@Singleton
@Component(modules = {AppModule.class, DatabaseModule.class, ServiceModule.class})
public interface AppComponent {
    Context context();

    Database database();

    APIService apiservice();
}
