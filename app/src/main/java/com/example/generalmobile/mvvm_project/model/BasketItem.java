package com.example.generalmobile.mvvm_project.model;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by MONSTER on 25.7.2017.
 */

@Entity
public class BasketItem {
    @PrimaryKey
    private int orderId;

    @Embedded
    private Product product;

    private int quantity = 1;


    public BasketItem(Product product) {
        this.product = product;
    }

    @Ignore
    public BasketItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void decrementQuantity() {
        if (quantity > 0)
            quantity--;
    }

    public void incrementQuantity() {
        quantity++;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj != null && obj instanceof BasketItem && this.orderId == ((BasketItem) obj).orderId);
    }
}
