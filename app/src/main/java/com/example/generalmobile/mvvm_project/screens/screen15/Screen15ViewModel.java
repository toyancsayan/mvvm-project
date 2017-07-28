package com.example.generalmobile.mvvm_project.screens.screen15;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.content.Context;
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
import com.example.generalmobile.mvvm_project.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Observable;

/**
 * Created by btstajyer7 on 25.07.2017.
 */

@InverseBindingMethods({
        @InverseBindingMethod(type = Spinner.class, attribute = "android:selectedItemPosition"),
})


public class Screen15ViewModel extends BaseObservable {
    private ArrayList<String> options = new ArrayList<String>();
    private String option;
    Context context;
    private int position;
    private boolean checked;


    public ObservableField<String> editText1 = new ObservableField<>("");
    public ObservableField<String> editText2 = new ObservableField<>("");

    public void b1Clicked() {
        options.add(editText1.get().toString());
        editText1.set("");


    }


    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public Screen15ViewModel(Context context) {
        this.context = context;
        options.addAll(Arrays.asList(context.getResources().getStringArray(R.array.options_array)));
    }


    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Bindable
    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> countries) {
        this.options = countries;

    }

    @Bindable
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;

        if (position != 0)
            setOption(options.get(position));
    }

    @Bindable
    public String getOption() {
        return option;
    }


    public void setOption(String option) {
        this.option = option;

        if (checked) {
            Toast.makeText(context, option + " is selected", Toast.LENGTH_SHORT).show();
            //  messenger.makeToast(country);

        } else
            Toast.makeText(context, option + " is NOT selected", Toast.LENGTH_SHORT).show();

    }

    public int getPosition(Spinner spinner) {
        return spinner.getSelectedItemPosition();
    }





}

