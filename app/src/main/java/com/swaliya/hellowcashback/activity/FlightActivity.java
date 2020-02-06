package com.swaliya.hellowcashback.activity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.swaliya.hellowcashback.R;
import com.swaliya.hellowcashback.util.AppHelp;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class FlightActivity extends AppCompatActivity {
    private String numberAdult = "", numberChild = "", numberInfund = "", valueCaotch = "", strRadioVAlu = "", strradioRoundBottom = "";
    private TextView tvForAlertBox, tvDepartDate, tvReturnDate;
    private String strDepDate = "", strReturnDate = "", strToCity = "", strFromCity = "", strTravler = "";
    Toast toast;
    private int strday, strmonth, stryear;
    DatePickerDialog dpDialog;
    Calendar cal;
    int iDay = 0, iMonth = 0, iYear = 0;
    LinearLayout oneTwo, oneThree;
    Spinner spinner, spinnerTWo;
    ArrayList<String> countryName;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((TextView) toolbar.findViewById(R.id.toolbar_tv)).setText("Flight Booking ");
        tvForAlertBox = findViewById(R.id.textForAlert);
        tvDepartDate = findViewById(R.id.tvDeapertDate);
        tvReturnDate = findViewById(R.id.tvReturnDate);
        oneTwo = findViewById(R.id.oneTwo);
        oneThree = findViewById(R.id.oneThree);
        spinner = findViewById(R.id.spinner);
        spinnerTWo = findViewById(R.id.spinnerTWo);

        countryName = new ArrayList<String>();
        ((TextView) findViewById(R.id.textForAlert)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertBox();
            }
        });
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
        ((Button) findViewById(R.id.btn_search)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                strRadioVAlu = ((RadioButton) findViewById(((RadioGroup) findViewById(R.id.rgrp)).getCheckedRadioButtonId())).getText().toString();
                strradioRoundBottom = ((RadioButton) findViewById(((RadioGroup) findViewById(R.id.rgrpround)).getCheckedRadioButtonId())).getText().toString();
                strDepDate = tvDepartDate.getText().toString();
                strReturnDate = tvReturnDate.getText().toString();
                strTravler = tvForAlertBox.getText().toString();
                // strTocity and str fromCity
                if (strDepDate.equals("") || strTravler.equals("")) {
                    Toast.makeText(FlightActivity.this, "Select Date and traveler", Toast.LENGTH_SHORT).show();
                } else {
                    if (strRadioVAlu.equals("Round Trip")) {
                        if (strReturnDate.equals("")) {
                            Toast.makeText(FlightActivity.this, "Select Return Date", Toast.LENGTH_SHORT).show();
                        } else {
                            try {
                                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                                String str1 = tvDepartDate.getText().toString();
                                Date date1 = null;
                                date1 = formatter.parse(str1);
                                String str2 = tvReturnDate.getText().toString();
                                Date date2 = null;
                                date2 = formatter.parse(str2);
                                if (date1.compareTo(date2) < 0) {
                                    System.out.println("date2 is Greater than my date1");

                                    startActivity(new Intent(getApplicationContext(), FlightListActivity.class));
                                    overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
                                    Toast.makeText(FlightActivity.this, strDepDate + "" + strReturnDate + "" + strTravler + "" + strRadioVAlu + "" + strradioRoundBottom, Toast.LENGTH_LONG).show();

                                } else {
                                    Toast.makeText(FlightActivity.this, "Check date details", Toast.LENGTH_LONG).show();
                                }

                            } catch (ParseException e1) {
                                e1.printStackTrace();
                            }
                        }
                    } else if (strRadioVAlu.equals("Multi City")) {


                    } else {
                        // one way
                        startActivity(new Intent(getApplicationContext(), FlightListActivity.class));
                        overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
                        Toast.makeText(FlightActivity.this, strDepDate + "" + strTravler + "" + strRadioVAlu, Toast.LENGTH_LONG).show();

                    }
                }

            }
        });


        tvDepartDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                strRadioVAlu = ((RadioButton) findViewById(((RadioGroup) findViewById(R.id.rgrp)).getCheckedRadioButtonId())).getText().toString();

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

                dpDialog = new DatePickerDialog(FlightActivity.this, listener, stryear, strmonth, strday);
                dpDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
                dpDialog.show();
            }
        });

        tvReturnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strRadioVAlu = ((RadioButton) findViewById(((RadioGroup) findViewById(R.id.rgrp)).getCheckedRadioButtonId())).getText().toString();
                if (strRadioVAlu.equals("One Way")) {
                    toast = Toast.makeText(FlightActivity.this, "You selected One Way", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                } else {
                    // Toast.makeText(FlightActivity.this, strRadioVAlu, Toast.LENGTH_SHORT).show();
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
                            ((TextView) findViewById(R.id.tvReturnDate)).setText(dayOfMonth + "/" + nMonth + "/" + year);
                        }
                    };
                    DatePickerDialog dpDialogg = new DatePickerDialog(FlightActivity.this, listener, year, month, day);
                    if (!tvDepartDate.equals("")) {
                        Calendar currentDate = Calendar.getInstance();
                        currentDate.set(iYear, iMonth, iDay);
                        dpDialogg.getDatePicker().setMinDate(currentDate.getTimeInMillis());
                    }
                    dpDialogg.getDatePicker().setMinDate(System.currentTimeMillis());
                    // Toast.makeText(FlightActivity.this, String.valueOf(System.currentTimeMillis()), Toast.LENGTH_LONG).show();
                    dpDialogg.show();
                }
            }
        });
        // loadSpinnerData("http://dblcapp.com/api/customer.aspx?msg=GetBaner");
        loadSpinner(AppHelp.getFilightAirportName);
        Log.e("string", AppHelp.getFilightAirportName);
    }

    private void loadSpinner(String response) {
        try {

            JSONArray jsonArray = new JSONArray(response);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject1 = jsonArray.getJSONObject(i);
                // String country = jsonObject1.getString("BanerImage");
                countryName.add(jsonObject1.getString("fcity"));
                System.out.println(countryName);
            }
            spinner.setAdapter(new ArrayAdapter<String>(FlightActivity.this, android.R.layout.simple_spinner_dropdown_item, countryName));
            spinnerTWo.setAdapter(new ArrayAdapter<String>(FlightActivity.this, android.R.layout.simple_spinner_dropdown_item, countryName));

        } catch (JSONException e) {
            e.printStackTrace();
            Log.e("catch", e.getMessage());
        }
    }

    private void loadSpinnerData(String url) {

        RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {

                    JSONArray jsonArray = new JSONArray(response);
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject jsonObject1 = jsonArray.getJSONObject(i);
                        // String country = jsonObject1.getString("BanerImage");
                        countryName.add(jsonObject1.getString("BanerImage"));
                    }
                    spinner.setAdapter(new ArrayAdapter<String>(FlightActivity.this, android.R.layout.simple_spinner_dropdown_item, countryName));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
       /* int socketTimeout = 30000;
        RetryPolicy policy = new DefaultRetryPolicy(socketTimeout, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(policy);*/
        requestQueue.add(stringRequest);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.oneway:
                if (checked)
                    oneThree.setVisibility(View.GONE);
                oneTwo.setVisibility(View.VISIBLE);
                ((LinearLayout) findViewById(R.id.layout_radio)).setVisibility(View.GONE);

                break;
            case R.id.round:
                if (checked)
                    oneThree.setVisibility(View.GONE);
                oneTwo.setVisibility(View.VISIBLE);

                ((LinearLayout) findViewById(R.id.layout_radio)).setVisibility(View.VISIBLE);
                break;
            case R.id.multicity:
                if (checked)
                    oneThree.setVisibility(View.VISIBLE);
                oneTwo.setVisibility(View.GONE);
                ((LinearLayout) findViewById(R.id.layout_radio)).setVisibility(View.GONE);

                break;
            case R.id.normal:
                if (checked)
                    //    Toast.makeText(getApplicationContext(), " normal", Toast.LENGTH_LONG).show();
                    break;
            case R.id.speciallcc:
                if (checked)

                    //     Toast.makeText(getApplicationContext(), " splc llc", Toast.LENGTH_LONG).show();
                    break;
            case R.id.specialgds:
                if (checked)

                    //  Toast.makeText(getApplicationContext(), " spe lgds", Toast.LENGTH_LONG).show();
                    break;
        }
    }

    private void showAlertBox() {

        final AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this, R.style.AlertDialogStyle);
        LayoutInflater inflater = this.getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.flight_alert_layout, null);
        dialogBuilder.setView(dialogView);
        dialogBuilder.setCancelable(false);
        final NumberPicker numberPickerAdult = (NumberPicker) dialogView.findViewById(R.id.numberAdult);
        final NumberPicker numberPickerchild = (NumberPicker) dialogView.findViewById(R.id.numberChild);
        final NumberPicker numberPickerInfund = (NumberPicker) dialogView.findViewById(R.id.numberInfant);
        final NumberPicker numberPickerCoatch = (NumberPicker) dialogView.findViewById(R.id.numberCoatch);
        final String[] values = {"Economy", "Business", "Premium Economy", "First"};
        // textView.setTextColor(Color.parseColor("#FF2C834F"));
        numberPickerAdult.setMinValue(0);
        numberPickerAdult.setMaxValue(9);
        numberPickerAdult.setWrapSelectorWheel(true);
        numberPickerAdult.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                //Display the newly selected value from picker
                //textView.setText("Selected value : " + newVal);
                numberAdult = String.valueOf(newVal);
            }
        });
        numberPickerchild.setMinValue(0);
        numberPickerchild.setMaxValue(9);
        numberPickerchild.setWrapSelectorWheel(true);
        numberPickerchild.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                numberChild = String.valueOf(newVal);
            }
        });
        numberPickerInfund.setMinValue(0);
        numberPickerInfund.setMaxValue(9);
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
        finish();
        overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
    }
}
