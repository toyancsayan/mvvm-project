package com.example.generalmobile.mvvm_project.screens.screen14;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.generalmobile.mvvm_project.R;
import com.example.generalmobile.mvvm_project.databinding.ItemData14Binding;
import com.example.generalmobile.mvvm_project.databinding.ItemProductsBinding;
import com.example.generalmobile.mvvm_project.main.MainItemViewModel;
import com.example.generalmobile.mvvm_project.model.Category;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by btstajyer7 on 24.07.2017.
 */

public class Screen14Adapter extends RecyclerView.Adapter<Screen14Adapter.ViewHolder> {
    private List<Category> categories;
    private DataBindingComponent bindingComponent;

    public Screen14Adapter(List<Category> categories, DataBindingComponent bindingComponent) {
        this.categories = categories;
        this.bindingComponent = bindingComponent;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemData14Binding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.item_data14,
                parent,
                false,
                bindingComponent);

        binding.setModel(new Screen14ItemViewModel());

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.itemData14Binding.getModel().setCategory(categories.get(position));
        Picasso.with(holder.imageView.getContext())
                .load(categories.get(position)
                .getCatgoryImageUrl())
                .fit()
                .centerCrop()
                .into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private ItemData14Binding itemData14Binding;
        private ImageView imageView;

        public ViewHolder(ItemData14Binding itemData14Binding) {
            super(itemData14Binding.getRoot());
            this.itemData14Binding = itemData14Binding;
            imageView=(ImageView) itemData14Binding.getRoot().findViewById(R.id.item_image14);
        }
    }
}
