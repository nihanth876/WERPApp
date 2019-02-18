package com.example.nihanth.werpapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
//import android.view.Menu;

public class SplashScreen extends AppCompatActivity {

    public final int DISPLAY_TIME = 1000;  //time for which splash screen is displayed

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Just a dummy splash screen which can be changed when XML design for finalized splash
        //screen is available. This screen appears for 1 second which can be changed

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(SplashScreen.this,LoginSigninActivity.class);
                SplashScreen.this.startActivity(mainIntent);
                SplashScreen.this.finish();
            }
        }, DISPLAY_TIME);
    }
}
