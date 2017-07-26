package com.example.generalmobile.mvvm_project.screens.screen8;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.generalmobile.mvvm_project.R;

import com.example.generalmobile.mvvm_project.databinding.ItemData8Binding;
import com.example.generalmobile.mvvm_project.model.Product;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by zeynepsaracbasi on 26/07/2017.
 */

public class Screen8Adapter extends RecyclerView.Adapter<Screen8Adapter.ViewHolder>{
     private List<Product> products;
    private android.databinding.DataBindingComponent bindingComponent;

    public Screen8Adapter(List<Product> products, DataBindingComponent bindingComponent) {
        this.products = products;
        this.bindingComponent = bindingComponent;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemData8Binding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.item_data8,
                parent,
                false,
                bindingComponent);

        binding.setModel(new Screen8ItemViewModel());

        return new ViewHolder(binding);
    }



    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.itemData8Binding.getModel().setProduct(products.get(position));
        Picasso.with(holder.imageView.getContext())
                .load(products.get(position)
                .getImageUrl())
                .fit()
                .centerCrop()
                .into(holder.imageView);
        holder.itemData8Binding.getModel().setProduct(products.get(position));
        Picasso.with(holder.imageView2.getContext())
                .load(products.get(position)
                        .getImageUrl())
                .fit()
                .centerCrop()
                .into(holder.imageView2);
    }



    @Override
    public int getItemCount() {
        return products.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private ItemData8Binding itemData8Binding;
        private ImageView imageView;
        private ImageView imageView2;

        public ViewHolder(ItemData8Binding itemData8Binding) {
            super(itemData8Binding.getRoot());
            this.itemData8Binding = itemData8Binding;
            imageView=(ImageView) itemData8Binding.getRoot().findViewById(R.id.imageView1);
            imageView2=(ImageView) itemData8Binding.getRoot().findViewById(R.id.imageView3);
        }
    }
}
