package com.swaliya.hellowcashback.activity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
import java.util.Calendar;


public class CabActivity extends AppCompatActivity {
    private TextView tvDepartDate;
    Spinner spinner, spinnerTWo;
    ArrayList<String> countryName;
    private String strToCity = "", strFromCity = "";
    DatePickerDialog dpDialog;
    Calendar cal;
    int iDay = 0, iMonth = 0, iYear = 0;
    private int strday, strmonth, stryear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cab);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((TextView) toolbar.findViewById(R.id.toolbar_tv)).setText("Car ");
        spinner = findViewById(R.id.spinner);
        spinnerTWo = findViewById(R.id.spinnerTWo);
        tvDepartDate = findViewById(R.id.tvDeapertDate);
        countryName = new ArrayList<String>();
        findViewById(R.id.btn_search).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), CarListActivity.class));
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                strToCity = spinner.getItemAtPosition(spinner.getSelectedItemPosition()).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinnerTWo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                strFromCity = spinnerTWo.getItemAtPosition(spinnerTWo.getSelectedItemPosition()).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        tvDepartDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                cal = Calendar.getInstance();
                strday = cal.get(Calendar.DAY_OF_MONTH);
                strmonth = cal.get(Calendar.MONTH);
                stryear = cal.get(Calendar.YEAR);

                DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        int nMonth = monthOfYear + 1;
                        iMonth = monthOfYear;
                        iDay = dayOfMonth;
                        iYear = year;
                        ((TextView) findViewById(R.id.tvDeapertDate)).setText(dayOfMonth + "/" + nMonth + "/" + year);
                    }
                };

                dpDialog = new DatePickerDialog(CabActivity.this, listener, stryear, strmonth, strday);
                dpDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
                dpDialog.show();
            }
        });
        loadSpinner(AppHelp.getFilightAirportName);
        Log.e("string", AppHelp.getFilightAirportName);
    }

    private void loadSpinner(String response) {
        try {

            JSONArray jsonArray = new JSONArray(response);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject1 = jsonArray.getJSONObject(i);

                countryName.add(jsonObject1.getString("fcity"));
                System.out.println(countryName);
            }
            spinner.setAdapter(new ArrayAdapter<String>(CabActivity.this, android.R.layout.simple_spinner_dropdown_item, countryName));
            spinnerTWo.setAdapter(new ArrayAdapter<String>(CabActivity.this, android.R.layout.simple_spinner_dropdown_item, countryName));

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
