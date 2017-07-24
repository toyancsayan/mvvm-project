package com.example.generalmobile.mvvm_project.di;

import com.example.generalmobile.mvvm_project.rest.ProductService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by btstajyer7 on 24.07.2017.
 */
@Module
public class ServiceModule {
    @Singleton
    @Provides
    ProductService provideService() {
        return new Retrofit.Builder()
                .baseUrl("http://10.17.0.131:3000/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ProductService.class);
    }
}
