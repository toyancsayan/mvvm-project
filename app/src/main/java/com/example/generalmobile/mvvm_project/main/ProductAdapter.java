package com.example.generalmobile.mvvm_project.main;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.generalmobile.mvvm_project.R;
import com.example.generalmobile.mvvm_project.databinding.ItemProductsBinding;
import com.example.generalmobile.mvvm_project.model.Product;

import java.util.List;

/**
 * Created by btstajyer7 on 24.07.2017.
 */

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {
    private List<Product> productList;
    private DataBindingComponent bindingComponent;

    public ProductAdapter(List<Product> productList, DataBindingComponent bindingComponent) {
        this.productList = productList;
        this.bindingComponent = bindingComponent;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemProductsBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.item_products,
                parent,
                false,
                bindingComponent);

        binding.setModel(new MainItemViewModel());

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        bind(holder, productList.get(position));
    }

    private void bind(ViewHolder viewHolder, Product product) {
        viewHolder.binding.getModel().setProduct(product);
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        public ItemProductsBinding binding;

        public ViewHolder(ItemProductsBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
