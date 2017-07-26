package com.example.generalmobile.mvvm_project.screens.screen15;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.databinding.InverseBindingAdapter;
import android.databinding.InverseBindingListener;
import android.databinding.InverseBindingMethod;
import android.databinding.InverseBindingMethods;
import android.databinding.ObservableField;
import android.support.v7.widget.AppCompatSpinner;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import com.example.generalmobile.mvvm_project.BR;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by btstajyer7 on 25.07.2017.
 */

@InverseBindingMethods({
        @InverseBindingMethod(type = Spinner.class, attribute = "android:selectedItemPosition"),
})


public class Screen15ViewModel extends BaseObservable {

    private String[] options = new String[]{"Option1", "Option2", "Option3", "Option4", "Option5", "Option6", "Option7"};
    private String option;
    private int position;
    Screen15Activity activity = new Screen15Activity();


    @Bindable
    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] countries) {
        this.options = countries;

    }

    @Bindable
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;

        if (position != 0)
            setOption(options[position]);
    }

    @Bindable
    public String getOption() {
        return option;
    }


    public void setOption(String country) {
        this.option = country;
        activity.makeToast(country);
    }

    public int getPosition(Spinner spinner) {
        return spinner.getSelectedItemPosition();
    }





}

