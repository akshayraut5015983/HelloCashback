package com.swaliya.hellowcashback.activity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.NumberPicker;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.swaliya.hellowcashback.R;
import com.swaliya.hellowcashback.util.AppHelp;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Calendar;


public class HotelActivity extends AppCompatActivity {
    private String numberAdult = "", numberChild = "", numberInfund = "", valueCaotch = "", strRadioVAlu = "";
    private TextView tvForAlertBox, tvCheckIn, tvCheckOut;
    private int strday, strmonth, stryear;
    DatePickerDialog dpDialog;
    Calendar cal;
    int iDay = 0, iMonth = 0, iYear = 0;
    Spinner spinner;
    String strCity = "";
    ArrayList<String> countryName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((TextView) toolbar.findViewById(R.id.toolbar_tv)).setText("Hotel Booking ");
        countryName =   new ArrayList<String>();
        tvForAlertBox = findViewById(R.id.textForAlert);
        tvCheckIn = findViewById(R.id.tvChekintDate);
        tvCheckOut = findViewById(R.id.tvCheckoutDate);
        spinner = findViewById(R.id.spinner);
        tvForAlertBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertBox();
            }
        });
        ((Button) findViewById(R.id.btn_search)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), HotelListActivity.class));
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                strCity = spinner.getItemAtPosition(spinner.getSelectedItemPosition()).toString();
                //   Toast.makeText(getApplicationContext(), country, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        tvCheckIn.setOnClickListener(new View.OnClickListener() {
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
                        ((TextView) findViewById(R.id.tvChekintDate)).setText(dayOfMonth + "/" + nMonth + "/" + year);
                    }
                };

                dpDialog = new DatePickerDialog(HotelActivity.this, listener, stryear, strmonth, strday);
                dpDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);

                dpDialog.show();
            }
        });
        tvCheckOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Calendar call = Calendar.getInstance();
                call.set(stryear, strmonth, strday);

                int day, month, year;
                day = call.get(Calendar.DAY_OF_MONTH);
                month = call.get(Calendar.MONTH);
                year = call.get(Calendar.YEAR);

                DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        int nMonth = monthOfYear + 1;
                        ((TextView) findViewById(R.id.tvCheckoutDate)).setText(dayOfMonth + "/" + nMonth + "/" + year);
                    }
                };

                DatePickerDialog dpDialogg = new DatePickerDialog(HotelActivity.this, listener, year, month, day);
                if (!tvCheckIn.equals("")) {
                    Calendar currentDate = Calendar.getInstance();
                    currentDate.set(iYear, iMonth, iDay);
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(Calendar.DAY_OF_MONTH, iDay + 60);
                    dpDialogg.getDatePicker().setMinDate(currentDate.getTimeInMillis());
                    dpDialogg.getDatePicker().setMaxDate(calendar.getTimeInMillis());
                }
                dpDialogg.getDatePicker().setMinDate(System.currentTimeMillis());
             /*   long maxDate = call.getTime().getTime(); // Twice!
                dpDialogg.getDatePicker().setMaxDate(System.currentTimeMillis() + 20);*/
                dpDialogg.show();
            }
        });
        loadSpinner(AppHelp.getHotelCityList);
        Log.e("string", AppHelp.getHotelCityList);
    }

    private void loadSpinner(String response) {
        try {

            JSONArray jsonArray = new JSONArray(response);
            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject jsonObject1 = jsonArray.getJSONObject(i);
                // String country = jsonObject1.getString("BanerImage");
                countryName.add(jsonObject1.getString("hcity"));
                System.out.println(countryName);
            }
            spinner.setAdapter(new ArrayAdapter<String>(HotelActivity.this, android.R.layout.simple_spinner_dropdown_item, countryName));


        } catch (JSONException e) {
            e.printStackTrace();
            Log.e("catch", e.getMessage());
        }
    }


    private void showAlertBox() {

        final AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this, R.style.AlertDialogStyle);
        LayoutInflater inflater = this.getLayoutInflater();

        final View dialogView = inflater.inflate(R.layout.flight_alert_layout, null);
        dialogBuilder.setView(dialogView);

        final NumberPicker numberPickerAdult = (NumberPicker) dialogView.findViewById(R.id.numberAdult);
        final NumberPicker numberPickerchild = (NumberPicker) dialogView.findViewById(R.id.numberChild);
        final NumberPicker numberPickerInfund = (NumberPicker) dialogView.findViewById(R.id.numberInfant);
        final NumberPicker numberPickerCoatch = (NumberPicker) dialogView.findViewById(R.id.numberCoatch);
        final String[] values = {"Economy", "Business", "First"};

        numberPickerAdult.setMinValue(0);
        numberPickerAdult.setMaxValue(5);
        numberPickerAdult.setWrapSelectorWheel(true);
        numberPickerAdult.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                numberAdult = String.valueOf(newVal);
            }
        });
        numberPickerchild.setMinValue(0);
        numberPickerchild.setMaxValue(5);
        numberPickerchild.setWrapSelectorWheel(true);
        numberPickerchild.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                numberChild = String.valueOf(newVal);
            }
        });
        numberPickerInfund.setMinValue(0);
        numberPickerInfund.setMaxValue(4);
        numberPickerInfund.setWrapSelectorWheel(true);
        numberPickerInfund.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                numberInfund = String.valueOf(newVal);
            }
        });
        numberPickerCoatch.setMaxValue(values.length - 1);
        numberPickerCoatch.setDisplayedValues(values);
        numberPickerCoatch.setWrapSelectorWheel(true);
        numberPickerCoatch.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {

                int pos = picker.getValue();
                String selecPicker = values[pos];
                valueCaotch = selecPicker;
            }
        });


        dialogBuilder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                tvForAlertBox.setText(numberAdult + " " + numberChild + " " + numberInfund + " " + valueCaotch);
                // Toast.makeText(FlightActivity.this, numberAdult + numberChild + numberInfund + valueCaotch, Toast.LENGTH_SHORT).show();
            }
        });

        dialogBuilder.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        dialogBuilder.create().show();
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
