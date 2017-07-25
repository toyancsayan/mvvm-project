package com.example.generalmobile.mvvm_project.screens.screen13;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.generalmobile.mvvm_project.R;
import com.example.generalmobile.mvvm_project.databinding.ItemData13Binding;
import com.example.generalmobile.mvvm_project.model.BasketItem;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by MONSTER on 25.7.2017.
 */

public class Screen13Adapter extends RecyclerView.Adapter<Screen13Adapter.ViewHolder> {
    private List<BasketItem> basketItemList;

    private DataBindingComponent dataBindingComponent;

    public Screen13Adapter(List<BasketItem> basketItemList, DataBindingComponent dataBindingComponent) {
        this.basketItemList = basketItemList;
        this.dataBindingComponent = dataBindingComponent;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemData13Binding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.item_data13,
                parent,
                false,
                dataBindingComponent);

        binding.setModel(new Screen13ItemViewModel());

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final BasketItem currentItem = basketItemList.get(position);
        holder.binding.getModel().setBasketItem(currentItem);
        Picasso.with(holder.itemView.getContext())
                .load(currentItem.getProduct().getProductImageUrl())
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return basketItemList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private ItemData13Binding binding;
        private ImageView imageView;

        public ViewHolder(ItemData13Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
            imageView = (ImageView) binding.getRoot().findViewById(R.id.product_image13);
        }
    }
}
