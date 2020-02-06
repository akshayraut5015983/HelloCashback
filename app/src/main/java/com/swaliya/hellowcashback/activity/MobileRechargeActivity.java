package com.swaliya.hellowcashback.activity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.swaliya.hellowcashback.R;
import com.swaliya.hellowcashback.model.mobile.MobileOperatorMain;
import com.swaliya.hellowcashback.model.mobile.RechargeDetails;
import com.swaliya.hellowcashback.util.AppHelp;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class MobileRechargeActivity extends AppCompatActivity {
    EditText editTextStop;
    TextView tvOperatore, tvState;
    String strOperator = "", strCity = "";
    ArrayList<String> countryName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_recharge);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tvOperatore = findViewById(R.id.tvOpertator);
        tvState = findViewById(R.id.tvState);
        ((TextView) toolbar.findViewById(R.id.toolbar_tv)).setText("Mobile Recharge ");
        editTextStop = (EditText) findViewById(R.id.edMobile);
        countryName = new ArrayList<String>();
        editTextStop.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {

            }

            @Override
            public void onTextChanged(final CharSequence s, int start, int before,
                                      int count) {

            }

            @Override
            public void afterTextChanged(final Editable s) {
                //avoid triggering event when text is too short
                if (s.length() == 10) {
                    Toast.makeText(MobileRechargeActivity.this, "Searching operator", Toast.LENGTH_SHORT).show();
                    loadSpinner(AppHelp.forMobileOpratore);
                    Log.d("mobile", AppHelp.forMobileOpratore);

                }
            }
        });


    }

    private void loadSpinner(String response) {
        try {

            MobileOperatorMain mobileOperatorMain = new MobileOperatorMain();

            RechargeDetails rechargeDetails = new RechargeDetails();
            JSONObject jsonObject1 = new JSONObject(response);

            tvOperatore.setText(jsonObject1.getJSONObject("paid_plans").getString("provider_name"));
            tvState.setText(jsonObject1.getJSONObject("paid_plans").getString("state"));
            Toast.makeText(this, "Operator set", Toast.LENGTH_SHORT).show();
            System.out.println("error " + tvState.getText().toString() + tvOperatore.getText().toString());

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
