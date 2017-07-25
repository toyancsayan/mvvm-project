package com.example.generalmobile.mvvm_project.db.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.example.generalmobile.mvvm_project.model.BasketItem;

import java.util.List;


/**
 * Created by MONSTER on 25.7.2017.
 */

@Dao
public interface BasketItemDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertBasketItem(BasketItem basketItem);

    @Query("select * from basketitem")
    LiveData<List<BasketItem>> getBasket();
}
