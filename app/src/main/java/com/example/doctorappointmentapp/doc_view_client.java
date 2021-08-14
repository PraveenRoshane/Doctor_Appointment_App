package com.example.doctorappointmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class doc_view_client extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_view_client);
    }
    //get the spinner from the xml.
    Spinner dropdown = findViewById(R.id.spinner4);
    //create a list of items for the spinner.
    String[] items = new String[]{"Cardiologist", "Gynaecologist", "three"};
    //create an adapter to describe how the items are displayed, adapters are used in several places in android.
    //There are multiple variations of this, but this is the basic variant.
    ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
    //set the spinners adapter to the previously created one.
    //dropdown.setAdapter(adapter);

}