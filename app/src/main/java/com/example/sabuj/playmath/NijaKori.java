package com.example.sabuj.playmath;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

/**
 * Created by SABUJ on 07/04/2016.
 */
public class NijaKori extends AppCompatActivity implements View.OnClickListener{
    Button ongkaLikhi;
    Typeface font;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nija_kori);

        initialization();
        settingListener();
        font =Typeface.createFromAsset(getAssets(),"S.TTF");
        ongkaLikhi.setTypeface(font);
    }

   private void initialization() {
       ongkaLikhi = (Button)findViewById(R.id.btn_tulona);
    }

    private void settingListener() {
        ongkaLikhi.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {


        switch (view.getId()){
            case R.id.btn_tulona:
                Intent intentTwentyTwo = new Intent(this,OngkaShikhiTwentyTwo.class);

                startActivity(intentTwentyTwo);
                break;
        }
    }
}
