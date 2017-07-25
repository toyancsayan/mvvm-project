package com.example.generalmobile.mvvm_project.db.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.example.generalmobile.mvvm_project.model.Subcategory;

import java.util.List;

/**
 * Created by btstajyer7 on 24.07.2017.
 */

@Dao
public interface SubcategoryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertSubcategory(List<Subcategory> subcategories);

    @Query("select * from subcategory")
    LiveData<List<Subcategory>> getSubcategories();
}
