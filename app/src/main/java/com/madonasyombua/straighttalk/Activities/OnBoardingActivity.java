package com.madonasyombua.straighttalk.Activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.codemybrainsout.onboarder.AhoyOnboarderActivity;
import com.codemybrainsout.onboarder.AhoyOnboarderCard;
import com.madonasyombua.straighttalk.R;

import java.util.ArrayList;
import java.util.List;

public class OnBoardingActivity extends AhoyOnboarderActivity {
    private static final String TAG = OnBoardingActivity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Creating the cards for the intro
        AhoyOnboarderCard card1 = new AhoyOnboarderCard("Straight Talk Foundation", "Youth-centred adolescent sexuality and reproductive health program that incorporates a newspaper, a network of clubs, a radio/ TV show, and training programs. ",R.drawable.logoa);
        card1.setBackgroundColor(R.color.black_transparent);
        card1.setTitleColor(R.color.white);
        card1.setDescriptionColor(R.color.white);



        AhoyOnboarderCard card2 = new AhoyOnboarderCard("Our mission", "We endeavor to provide Kenyan adolescents with a forum for open dialogue on sexuality and reproductive rights related to HIV AIDS, girls’ rights and more.", R.drawable.logo);
        card2.setBackgroundColor(R.color.black_transparent);
        card2.setTitleColor(R.color.white);
        card2.setDescriptionColor(R.color.white);

        AhoyOnboarderCard card3 = new AhoyOnboarderCard("What We Do", "The Straight Talk project facilitates collaborative partnerships with adolescents with the aim of developing coping strategies and behavioural life skills that will help young people remain in control of their behaviour.", R.drawable.logob);
        card3.setBackgroundColor(R.color.black_transparent);
        card3.setTitleColor(R.color.white);
        card3.setDescriptionColor(R.color.white);

        List<AhoyOnboarderCard> pages = new ArrayList<>();
        pages.add(card1);
        pages.add(card2);
        pages.add(card3);

        setOnboardPages(pages);
        setGradientBackground();
        setFinishButtonTitle("Click To Proceed");
        showNavigationControls(true);

        Log.i(TAG, "onCreate: Setting up the cards");
    }

    @Override
    public void onFinishButtonPressed() {
        Intent finishIntent = new Intent();
        setResult(Activity.RESULT_OK, finishIntent);
        Log.i(TAG, "onFinishButtonPressed: Closing the onboarding activity");
        finish();
    }

    }
