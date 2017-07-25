package com.example.generalmobile.mvvm_project.di;

import android.arch.persistence.room.Room;
import android.content.Context;

import com.example.generalmobile.mvvm_project.db.Database;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by btstajyer7 on 24.07.2017.
 */

@Module
public class DatabaseModule {
    @Singleton
    @Provides
    Database provideDb(Context context) {
        return Room.databaseBuilder(context, Database.class, "productDb").build();
    }
}
