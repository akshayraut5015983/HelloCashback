package com.swaliya.hellowcashback.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.swaliya.hellowcashback.R;
import com.swaliya.hellowcashback.adapter.DthPlanAdapter;
import com.swaliya.hellowcashback.model.dth.DthPlanList;
import com.swaliya.hellowcashback.model.hotel.HotelImage;
import com.swaliya.hellowcashback.model.mobile.MobileOperatorMain;
import com.swaliya.hellowcashback.model.mobile.RechargeDetails;
import com.swaliya.hellowcashback.util.AppHelp;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class DthRechargeActivity extends AppCompatActivity {
   public static EditText edDthNumber, edAmount;
  public  static TextView tvViewPaln, tvValidity, tvDetails;
    String strAmount = "", strValidity = "", strDetals = "";
 static public    LinearLayout linearLayout;
    private List<DthPlanList> listSuperHeroes;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dth_recharge);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        listSuperHeroes = new ArrayList<>();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((TextView) toolbar.findViewById(R.id.toolbar_tv)).setText("Dth Recharge");
        edDthNumber = findViewById(R.id.edDthNumber);
        edAmount = findViewById(R.id.edAmount);
        tvViewPaln = findViewById(R.id.tvViewPaln);
        tvValidity = findViewById(R.id.tvValidity);
        tvDetails = findViewById(R.id.tvDeatils);
        linearLayout = findViewById(R.id.layout);

        edDthNumber.addTextChangedListener(new TextWatcher() {
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
                if (s.length() == 7) {
                    //   Toast.makeText(DthRechargeActivity.this, "Searching operator", Toast.LENGTH_SHORT).show();
                    loadSpinner(AppHelp.forDthOperatore);
                    Log.d("dthNumber", AppHelp.forMobileOpratore);

                }
            }
        });
        /*Bundle extras = getIntent().getExtras();
        if (extras != null) {
            linearLayout.setVisibility(View.VISIBLE);
            strAmount = extras.getString("Amount");
            strDetals = extras.getString("Details");
            strValidity = extras.getString("Validity");
            System.out.println(strAmount + strValidity + strDetals);
            tvDetails.setText(strDetals);
            edAmount.setText(strAmount);
            tvValidity.setText(strValidity);

        }*/
        tvViewPaln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(getApplicationContext(), DthPlanListActivity.class);
                startActivityForResult(ii, 200);
//               showAlertBox();
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 200) {
            if (data != null)
                Toast.makeText(this, "work  " + data.getStringExtra("Amount"), Toast.LENGTH_SHORT).show();
        }
    }

    private void loadSpinner(String response) {
        try {


            JSONObject jsonObject1 = new JSONObject(response);
            edAmount.setText(jsonObject1.getString("operator_code"));
            Toast.makeText(this, "Operator set", Toast.LENGTH_SHORT).show();

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

    private void showAlertBox() {

        final AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this, android.R.style.ThemeOverlay);
        LayoutInflater inflater = this.getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.activity_dthplan_list, null);
        dialogBuilder.setView(dialogView);
        dialogBuilder.setCancelable(false);
        RecyclerView recyclerView = dialogView.findViewById(R.id.recycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        try {

            //  JSONObject jsonObject = new JSONObject(array);

            JSONArray jsonArray = new JSONArray(AppHelp.forDthPlanList);

            for (int i = 0; i < jsonArray.length(); i++) {

                DthPlanList superHero = new DthPlanList();

                JSONObject json = null;
                try {
                    json = jsonArray.getJSONObject(i);

                    superHero.setDetail(json.getString("Detail"));
                    superHero.setAmount(json.getString("Amount"));
                    superHero.setValidity(json.getString("Validity"));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                listSuperHeroes.add(superHero);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        adapter = new DthPlanAdapter(listSuperHeroes, DthRechargeActivity.this);
        Log.d("tag", String.valueOf(adapter.getItemCount()));
        recyclerView.setAdapter(adapter);
        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DthRechargeActivity.this, "ss", Toast.LENGTH_SHORT).show();
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
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
    }
}
