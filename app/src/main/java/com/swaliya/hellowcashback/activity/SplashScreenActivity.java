package com.swaliya.hellowcashback.activity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.swaliya.hellowcashback.R;

public class SplashScreenActivity extends AppCompatActivity {

    ImageView imageView;
    TextView progressBar;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        relativeLayout = findViewById(R.id.lin_lay);
        imageView = findViewById(R.id.img);
        progressBar = findViewById(R.id.progressBar);

      /*  Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha);
        imageView.startAnimation(animation);*/

          progressBar.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink));

      /*  ValueAnimator anim = ValueAnimator.ofFloat(0, 1);
        anim.setDuration(3000);

        final float[] hsv;
        final int[] runColor = {R.color.lightyeloe,R.color.colora,R.color.white};

        hsv = new float[3]; // Transition color
        hsv[1] = 1;
        hsv[2] = 1;
        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            @Override
            public void onAnimationUpdate(ValueAnimator animation) {

                hsv[0] = 360 * animation.getAnimatedFraction();
                runColor[0] = Color.HSVToColor(hsv);
                relativeLayout.setBackgroundColor(runColor[0]);
            }
        });
        //  anim.setRepeatCount(Animation.ABSOLUTE);
        anim.start();*/

        int cyanColorBg = ContextCompat.getColor(this,R.color.colorc);
        int redColorBg = ContextCompat.getColor(this,R.color.fentgreenc);
        int purpleColorBg = ContextCompat.getColor(this,R.color.white);

        ValueAnimator valueAnimator = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            valueAnimator = ValueAnimator.ofArgb(cyanColorBg,redColorBg,purpleColorBg);
        }
        valueAnimator.setDuration(5000);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                relativeLayout.setBackgroundColor((Integer)valueAnimator.getAnimatedValue());
            }
        });

        valueAnimator.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
              //  relativeLayout.setBackgroundResource(R.color.white);
                Intent mainIntent = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(mainIntent);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
                finish();
            }
        }, 5000);

        new CountDownTimer(5000, 1000) {

            public void onTick(long millisUntilFinished) {
                progressBar.setText("Wait  " + millisUntilFinished / 1000+"  Seconds....");
            }
            public void onFinish() {
                progressBar.setText("Completed...!!!");
            }
        }.start();
    }
}

