package com.example.generalmobile.mvvm_project.db;

import android.arch.persistence.room.RoomDatabase;

import com.example.generalmobile.mvvm_project.db.dao.BasketItemDao;
import com.example.generalmobile.mvvm_project.db.dao.CategoryDao;
import com.example.generalmobile.mvvm_project.db.dao.ProductDao;
import com.example.generalmobile.mvvm_project.db.dao.SubcategoryDao;
import com.example.generalmobile.mvvm_project.model.BasketItem;
import com.example.generalmobile.mvvm_project.model.Category;
import com.example.generalmobile.mvvm_project.model.Product;
import com.example.generalmobile.mvvm_project.model.Subcategory;

/**
 * Created by btstajyer7 on 24.07.2017.
 */
@android.arch.persistence.room.Database(entities = {
        Product.class,
        Category.class,
        Subcategory.class,
        BasketItem.class}, version = 3)
public abstract class Database extends RoomDatabase {
    public abstract ProductDao productDao();

    public abstract CategoryDao categoryDao();

    public abstract SubcategoryDao subcategoryDao();

    public abstract BasketItemDao basketItemDao();
}
