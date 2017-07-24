package com.example.generalmobile.mvvm_project.db;

import android.arch.persistence.room.RoomDatabase;

import com.example.generalmobile.mvvm_project.db.dao.ProductDao;
import com.example.generalmobile.mvvm_project.entity.Product;

/**
 * Created by btstajyer7 on 24.07.2017.
 */
@android.arch.persistence.room.Database(entities = {Product.class}, version = 1)
public abstract class Database extends RoomDatabase {
    public abstract ProductDao productDao();
}
