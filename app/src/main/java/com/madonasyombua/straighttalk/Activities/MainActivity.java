package com.madonasyombua.straighttalk.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.madonasyombua.straighttalk.R;

public class MainActivity extends AppCompatActivity {
    private static final int SHOW_INTRO = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setup the onboarding activity
            startActivityForResult(new Intent(this, OnBoardingActivity.class), SHOW_INTRO);
        }


   /* @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == SHOW_INTRO) {
            if (resultCode == RESULT_OK) {

            }

        }
    }*/
}
