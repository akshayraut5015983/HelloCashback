package com.swaliya.hellowcashback.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.swaliya.hellowcashback.R;


public class CashbackActivity extends AppCompatActivity {
    private boolean isDomestic = true;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cashback);
        linearLayout = findViewById(R.id.domaaastic);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((TextView) toolbar.findViewById(R.id.toolbar_tv)).setText("Cashback  ");

        AlertDialog.Builder builder2 = new AlertDialog.Builder(this,  R.style.AlertDialogStyle);
        builder2.setMessage("What do you want search...?");
        builder2.setCancelable(false);
        builder2.setPositiveButton("Domestic", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                isDomestic = true;
                dialog.cancel();

            }
        });
        builder2.setNegativeButton("International", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                isDomestic = false;
                dialog.cancel();

                linearLayout.setVisibility(View.GONE);

            }
        });
        builder2.show();

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                overridePendingTransition(R.anim.hold, R.anim.slide_down);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
