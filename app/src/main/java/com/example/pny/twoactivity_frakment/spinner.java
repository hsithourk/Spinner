package com.example.pny.twoactivity_frakment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class spinner extends AppCompatActivity {
    private Spinner spinner2;
    private Spinner spinner3;
    private Spinner spinner4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        spinner4 = findViewById(R.id.spinner4);
        String ls[] = {"Hello","Sithourk","Spinner"};

        CustomerSpinnerAdapter customerSpinnerAdapter = new CustomerSpinnerAdapter(this, ls);
        spinner4.setAdapter(customerSpinnerAdapter);

        spinner2 = findViewById(R.id.spinner2);
        String option[] = getResources().getStringArray(R.array.County);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,option);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter);
        adapterItemOnspinner3();
    }

    public void adapterItemOnspinner3(){
        spinner3 = (Spinner) findViewById(R.id.spinner3);

        final List<String> list = new ArrayList<String>();
        list.add("Yahoo");
        list.add("Microsoft");
        list.add("YouTue");
        list.add("Amazon");
        list.add("Bing");
        list.add("Apple");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter);

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(spinner.this, list.get(position) + " - "+ String.valueOf(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
