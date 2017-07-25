package com.example.generalmobile.mvvm_project.db.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.example.generalmobile.mvvm_project.model.Category;

import java.util.List;

/**
 * Created by btstajyer7 on 24.07.2017.
 */

@Dao
public interface CategoryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertCategory(List<Category> category);

    @Query("select * from category")
    LiveData<List<Category>> getCategories();
}
