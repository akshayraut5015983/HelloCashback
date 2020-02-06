package com.swaliya.hellowcashback.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.swaliya.hellowcashback.R;
import com.swaliya.hellowcashback.util.AppHelp;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class BusActivity extends AppCompatActivity {
    Spinner spinner, spinnerTWo;
    ArrayList<String> countryName;
    String strToCity = "", strFromCity = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // toolbar.setNavigationIcon(R.drawable.ic_hotel_black_24dp);
        ((TextView) toolbar.findViewById(R.id.toolbar_tv)).setText("Bus ");
        ((Button) findViewById(R.id.btn_search)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), BuslListActivity.class));
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });
        spinner = findViewById(R.id.spinner);
        spinnerTWo = findViewById(R.id.spinnerTWo);
        countryName = new ArrayList<String>();
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                strToCity = spinner.getItemAtPosition(spinner.getSelectedItemPosition()).toString();
                //   Toast.makeText(getApplicationContext(), country, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinnerTWo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                strFromCity = spinnerTWo.getItemAtPosition(spinnerTWo.getSelectedItemPosition()).toString();
                //   Toast.makeText(getApplicationContext(), country, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        loadSpinner(AppHelp.getBusCityList);
        Log.e("string", AppHelp.getBusCityList);
    }

    private void loadSpinner(String response) {
        try {

            JSONArray jsonArray = new JSONArray(response);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject1 = jsonArray.getJSONObject(i);
                // String country = jsonObject1.getString("BanerImage");
                countryName.add(jsonObject1.getString("stationName"));
                System.out.println(countryName);
            }
            spinner.setAdapter(new ArrayAdapter<String>(BusActivity.this, android.R.layout.simple_spinner_dropdown_item, countryName));
            spinnerTWo.setAdapter(new ArrayAdapter<String>(BusActivity.this, android.R.layout.simple_spinner_dropdown_item, countryName));

        } catch (JSONException e) {
            e.printStackTrace();
            Log.e("catch", e.getMessage());
        }
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();

                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
    }
}
