package com.example.generalmobile.mvvm_project.base;

import android.arch.lifecycle.LifecycleRegistry;
import android.support.v7.app.AppCompatActivity;
import android.arch.lifecycle.LifecycleRegistryOwner;

/**
 * Created by btstajyer7 on 25.07.2017.
 */

public class AppCompatLifeCycleActivity extends AppCompatActivity implements LifecycleRegistryOwner {

    private final LifecycleRegistry mRegistry=new LifecycleRegistry(this);

    @Override
    public LifecycleRegistry getLifecycle() {
        return mRegistry;
    }
}
