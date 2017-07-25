package com.example.generalmobile.mvvm_project.db.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.example.generalmobile.mvvm_project.model.Category;
import com.example.generalmobile.mvvm_project.model.Product;

import java.util.List;

/**
 * Created by btstajyer7 on 24.07.2017.
 */

@Dao
public interface ProductDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertProduct(List<Product> product);

    @Query("select * from product")
    LiveData<List<Product>> getProducts();
}
