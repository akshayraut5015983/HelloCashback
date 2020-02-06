package com.swaliya.hellowcashback.activity;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Html;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.shape.CornerFamily;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.swaliya.hellowcashback.R;
import com.swaliya.hellowcashback.util.AlertApp;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import de.hdodenhof.circleimageview.CircleImageView;


public class MainActivity extends AppCompatActivity {

    int gallery_grid_Images[] = {R.drawable.bannerimgeone, R.drawable.new_logo, R.drawable.bannerimagetwo, R.drawable.bannerimagethree};
    ViewFlipper viewFlipper;
    CircleImageView img;
    String deviceToken;
    ViewPager mViewPager;
    NavigationView navigationView;
    DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*  getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/
        mViewPager = (ViewPager) findViewById(R.id.pager);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        mDrawerLayout = findViewById(R.id.drower);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drower);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        /*ActionBarDrawerToggle mDrawerToggle =
                new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.navigation_drawer_open,
                        R.string.navigation_drawer_close) {
                    @Override
                    public void onDrawerSlide(View drawerView, float slideOffset) {
                        float width = drawerView.findViewById(R.id.main_head_rl).getWidth();
                        final int movement = (int) (width * slideOffset);
                        findViewById(R.id.main_content_rl).setX(movement);
                        super.onDrawerSlide(drawerView, slideOffset);
                    }
                };

        mDrawerLayout.setDrawerListener(mDrawerToggle);
        // toolbar.setNavigationIcon(R.drawable.ic_flight_takeoff_black_24dp);
        mDrawerToggle.syncState();
        mDrawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));*/


        img = findViewById(R.id.img_circlr);
        ((CircleImageView) findViewById(R.id.img_circlr)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
            }
        });
        ((ImageView) findViewById(R.id.img_notifi)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), NotificationActivity.class));
            }
        });
        ((ImageView) findViewById(R.id.img_logout)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        ((LinearLayout) findViewById(R.id.lay_foterapps)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                Uri uri = Uri.parse("https://hellocashback.in/"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        ((LinearLayout) findViewById(R.id.lay_foterprofile)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
            }
        });
        ((LinearLayout) findViewById(R.id.lay_foterhistory)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), TransactionHistoryActivity.class));
            }
        });

        ((LinearLayout) findViewById(R.id.lay_acpaymnet)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AcceptPaymentActivity.class));
                overridePendingTransition(R.anim.slide_up, R.anim.hold);
            }
        });
        ((LinearLayout) findViewById(R.id.lay_pay)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PayActivity.class));
                overridePendingTransition(R.anim.slide_up, R.anim.hold);
            }
        });
        ((LinearLayout) findViewById(R.id.lay_addmony)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AddMoneyActivity.class));
                overridePendingTransition(R.anim.slide_up, R.anim.hold);
            }
        });
        ((LinearLayout) findViewById(R.id.lay_pasbook)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PassbokActivity.class));
                overridePendingTransition(R.anim.slide_up, R.anim.hold);
            }
        });
        ((TextView) findViewById(R.id.tv_seeall)).setText(Html.fromHtml("<U><B>See All</B/</U>"));
        (findViewById(R.id.tv_seeall)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "See all", Toast.LENGTH_SHORT).show();
            }
        });


        ((LinearLayout) findViewById(R.id.lay_cashback)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), CashbackActivity.class));
                overridePendingTransition(R.anim.enter, R.anim.exit);
            }
        });
        ((LinearLayout) findViewById(R.id.lay_Latestoffer)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), LatestOfferActivity.class));
                overridePendingTransition(R.anim.enter, R.anim.hold);
            }
        });
        ((LinearLayout) findViewById(R.id.lay_buyoffer)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), BuyActivity.class));
                overridePendingTransition(R.anim.enter, R.anim.hold);
            }
        });
        ((LinearLayout) findViewById(R.id.lay_moreoffers)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AllItemActivity.class));
                overridePendingTransition(R.anim.enter, R.anim.hold);
            }
        });


        ((LinearLayout) findViewById(R.id.lay_flight)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), FlightActivity.class));
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });
        ((LinearLayout) findViewById(R.id.lay_bus)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), BusActivity.class));
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });
        ((LinearLayout) findViewById(R.id.lay_hotel)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), HotelActivity.class));
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });
        ((LinearLayout) findViewById(R.id.lay_car)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), CabActivity.class));
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });
        ((LinearLayout) findViewById(R.id.layout_mobile)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MobileRechargeActivity.class));
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });
        ((LinearLayout) findViewById(R.id.layout_dth)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DthRechargeActivity.class));
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });
        ((LinearLayout) findViewById(R.id.layout_electricity)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ElectricityActivity.class));
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });
        ((LinearLayout) findViewById(R.id.layout_gas)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), GasActivity.class));
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });
        ((LinearLayout) findViewById(R.id.layout_water)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), WaterActivity.class));
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        ((LinearLayout) findViewById(R.id.layout_landline)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), LandLineActivity.class));
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });
        ((LinearLayout) findViewById(R.id.layout_insurence)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), InsuranceActivity.class));
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });
        ((LinearLayout) findViewById(R.id.layout_spa)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SpaActivity.class));
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });
        ((LinearLayout) findViewById(R.id.layout_datacard)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DataCardActivity.class));
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });


        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);
        /*for (int i = 0; i < gallery_grid_Images.length; i++) {
            //  This will create dynamic image view and add them to ViewFlipper
            setFlipperImage(gallery_grid_Images[i]);
        }*/
        onCreateMethod();
    }

    private void onCreateMethod() {

       /* SharedPreferences prefs = getSharedPreferences("Akshay", MODE_PRIVATE);
        deviceToken = prefs.getString("img", null);
        if (deviceToken != null) {
            img.setImageURI(Uri.parse(deviceToken));
        }*/

        ((LinearLayout) findViewById(R.id.nav_home)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDrawerLayout.closeDrawer(GravityCompat.START);
            }
        });
        ((LinearLayout) findViewById(R.id.nav_two)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDrawerLayout.closeDrawer(GravityCompat.START);
                startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                overridePendingTransition(R.anim.enter, R.anim.hold);
            }
        });
        ((LinearLayout) findViewById(R.id.nav_logout)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDrawerLayout.closeDrawer(GravityCompat.START);
                forLogout();
            }
        });

        ((LinearLayout) findViewById(R.id.nav_aboutus)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDrawerLayout.closeDrawer(GravityCompat.START);

                AlertApp alertApp = new AlertApp(MainActivity.this);
                alertApp.forAboutUs();
            }
        });
        ((LinearLayout) findViewById(R.id.nav_contactus)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDrawerLayout.closeDrawer(GravityCompat.START);
                AlertApp alertApp = new AlertApp(MainActivity.this);
                alertApp.forContactUs();
            }
        });
        ((LinearLayout) findViewById(R.id.nav_termscondition)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDrawerLayout.closeDrawer(GravityCompat.START);
                AlertApp alertApp = new AlertApp(MainActivity.this);
                alertApp.forTermesansCondition();
            }
        });
        ((LinearLayout) findViewById(R.id.nav_help)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDrawerLayout.closeDrawer(GravityCompat.START);
                AlertApp alertApp = new AlertApp(MainActivity.this);
                alertApp.forHelpCenter();
            }
        });



    }


    private void setFlipperImage(int res) {
        Log.i("Set Filpper Called", res + "");
        ImageView image = new ImageView(getApplicationContext());
        image.setBackgroundResource(res);
        viewFlipper.addView(image);
    }

    @Override
    public void onBackPressed() {

        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.START);

        } else {
            forLogout();
        }
    }


    private void forLogout() {
        AlertDialog.Builder builder2 = new AlertDialog.Builder(MainActivity.this, R.style.AlertDialogStyle);
        builder2.setTitle("Logout");
        builder2.setMessage("Do you want to close...?");

        builder2.setNeutralButton("Logout", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });
        builder2.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder2.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                overridePendingTransition(R.anim.hold, R.anim.blink);
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });
        // builder2.getWindow().getAttributes().windowAnimations = R.style.CustomDialogAnimation;
        builder2.show();
    }

    private String encodeImage(String path) {
        File imagefile = new File(path);
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(imagefile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Bitmap bm = BitmapFactory.decodeStream(fis);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bm.compress(Bitmap.CompressFormat.JPEG, 100, baos);
        byte[] b = baos.toByteArray();
        String encImage = Base64.encodeToString(b, Base64.DEFAULT);
        //Base64.de
        return encImage;
    }


}
