package com.swaliya.hellowcashback.activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.swaliya.hellowcashback.R;
import com.swaliya.hellowcashback.adapter.BusAdapter;
import com.swaliya.hellowcashback.adapter.HotelAdapter;
import com.swaliya.hellowcashback.model.bus.ApiAvailableBus;
import com.swaliya.hellowcashback.model.bus.BusBookingMain;
import com.swaliya.hellowcashback.model.hotel.AvailableHotel;
import com.swaliya.hellowcashback.model.hotel.HotelImage;
import com.swaliya.hellowcashback.util.AppHelp;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class BuslListActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ProgressDialog loading;
    private List<ApiAvailableBus> listSuperHeroes;
    private RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((TextView) toolbar.findViewById(R.id.toolbar_tv)).setText("Bus List ");

        listSuperHeroes = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        AppHelp appHelp = new AppHelp(getApplicationContext());
        loading = ProgressDialog.show(BuslListActivity.this, "Loading Data", "Please Wait...", false, false);

        parseData(appHelp.forBusList);


    }


    private void parseData(String array) {
        try {

            JSONObject jsonObject = new JSONObject(array);

            JSONArray jsonArray = jsonObject.getJSONArray("apiAvailableBuses");

            for (int i = 0; i < jsonArray.length(); i++) {
                ApiAvailableBus superHero = new ApiAvailableBus();
                JSONObject json = null;

                try {
                    json = jsonArray.getJSONObject(i);
                    superHero.setArrivalTime(json.getString("arrivalTime"));

                    superHero.setOperatorName(json.getString("operatorName"));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                listSuperHeroes.add(superHero);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        adapter = new BusAdapter(listSuperHeroes, BuslListActivity.this);
        Log.d("tag", String.valueOf(adapter.getItemCount()));
        recyclerView.setAdapter(adapter);
        loading.dismiss();
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
