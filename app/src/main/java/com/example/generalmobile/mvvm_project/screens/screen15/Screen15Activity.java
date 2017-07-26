package com.example.generalmobile.mvvm_project.screens.screen15;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.generalmobile.mvvm_project.R;
import com.example.generalmobile.mvvm_project.base.BaseActivity;
import com.example.generalmobile.mvvm_project.databinding.ActivityScreen15Binding;

/**
 * Created by btstajyer7 on 25.07.2017.
 */

public class Screen15Activity extends BaseActivity implements android.databinding.DataBindingComponent {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        DataBindingUtil.setContentView(this, R.layout.activity_screen15);
        super.onCreate(savedInstanceState);
        ActivityScreen15Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_screen15);
        Screen15ViewModel model = new Screen15ViewModel();
        binding.setModel(model);

        // setAdapter();
    }

    public void makeToast(String option) {
        Toast.makeText(this, option, Toast.LENGTH_SHORT).show();
    }

    private void setAdapter() {
        Spinner spinner1 = (Spinner) findViewById(R.id.spinnerState1);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinnerState2);
        Spinner spinner3 = (Spinner) findViewById(R.id.spinnerState3);
// Create an ArrayAdapter using the string array and a default spinner layout

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.options_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        spinner3.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                Toast.makeText(Screen15Activity.this, selectedItem + " is selected", Toast.LENGTH_SHORT).show();
            } // to close the onItemSelected

            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }


}
