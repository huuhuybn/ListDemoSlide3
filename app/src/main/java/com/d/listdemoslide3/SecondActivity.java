package com.d.listdemoslide3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private AutoCompleteTextView tvSearch;
    private Spinner spListFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        tvSearch = findViewById(R.id.tvSearch);


        final String[] hints = {"Apple", "Vocano", "Vovinam", "Grape", "WaterMelon", "Coconut", "Bean", "Tofu", "" +
                "Meat", "Bef", "Chicken", "Vegetable", "Cherry", "Kiwi", "Tofu Noodle", "Hao Hao"};

        ArrayAdapter<String> hintsAdapter = new
                ArrayAdapter<>(SecondActivity.this, android.R.layout.select_dialog_item, hints);

        tvSearch.setAdapter(hintsAdapter);


        spListFood = findViewById(R.id.spListFood);

        spListFood.setAdapter(hintsAdapter);

        spListFood.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SecondActivity.this, hints[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}
