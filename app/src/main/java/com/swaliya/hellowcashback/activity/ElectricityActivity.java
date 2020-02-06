package com.swaliya.hellowcashback.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.swaliya.hellowcashback.R;
import com.swaliya.hellowcashback.model.electricity.ElectricityMain;
import com.swaliya.hellowcashback.model.mobile.MobileOperatorMain;
import com.swaliya.hellowcashback.model.mobile.RechargeDetails;
import com.swaliya.hellowcashback.util.AppHelp;

import org.json.JSONException;
import org.json.JSONObject;


public class ElectricityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electricity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((TextView) toolbar.findViewById(R.id.toolbar_tv)).setText("Electricity ");
        findViewById(R.id.btn_search).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadSpinner(AppHelp.forElectyricityBill);
            }
        });

    }

    private void loadSpinner(String response) {
        try {
            JSONObject jsonObject1 = new JSONObject(response);
            String str = jsonObject1.getString("message");
            Toast.makeText(this, str, Toast.LENGTH_SHORT).show();

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
