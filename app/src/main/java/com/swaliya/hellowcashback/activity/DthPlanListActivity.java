package com.swaliya.hellowcashback.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.swaliya.hellowcashback.R;
import com.swaliya.hellowcashback.adapter.DthPlanAdapter;
import com.swaliya.hellowcashback.adapter.HotelAdapter;
import com.swaliya.hellowcashback.model.dth.DthPlanList;
import com.swaliya.hellowcashback.model.hotel.AvailableHotel;
import com.swaliya.hellowcashback.model.hotel.HotelImage;
import com.swaliya.hellowcashback.util.AppHelp;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class DthPlanListActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ProgressDialog loading;
    private List<DthPlanList> listSuperHeroes;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dthplan_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((TextView) toolbar.findViewById(R.id.toolbar_tv)).setText("Plan List ");

        listSuperHeroes = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler);
      /*  LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);*/


        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
       // gridLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL); // set Horizontal Orientation
        recyclerView.setLayoutManager(gridLayoutManager); // set LayoutManager to RecyclerView

        parseData(AppHelp.forDthPlanList);

    }

    private void parseData(String array) {
        try {
            List<HotelImage> hotelImages = new ArrayList<>();
            //  JSONObject jsonObject = new JSONObject(array);

            JSONArray jsonArray = new JSONArray(array);

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

        adapter = new DthPlanAdapter(listSuperHeroes, DthPlanListActivity.this);
        Log.d("tag", String.valueOf(adapter.getItemCount()));
        recyclerView.setAdapter(adapter);

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
