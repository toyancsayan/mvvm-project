package com.example.generalmobile.mvvm_project.screens.screen14;

import android.databinding.ObservableField;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.generalmobile.mvvm_project.model.Category;
import com.squareup.picasso.Picasso;

/**
 * Created by btstajyer7 on 24.07.2017.
 */

public class Screen14ItemViewModel {
    private ObservableField<Category> category = new ObservableField<>();

    public ObservableField<Category> getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category.set(category);
    }

    public void click(View view) {
        Toast.makeText(view.getContext(), category.get().getCategoryName(), Toast.LENGTH_SHORT).show();
    }
    public void loadImage(ImageView view, String imageUrl){

    }
}
