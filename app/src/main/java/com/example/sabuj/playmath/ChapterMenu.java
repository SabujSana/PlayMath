package com.example.sabuj.playmath;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by SABUJ on 07/04/2016.
 */
public class ChapterMenu extends AppCompatActivity implements View.OnClickListener{
    Button tulona,nijaKori,gonona,jog,note;
    Typeface font;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chapter_menu);

        initialization();
        settingListener();
        font =Typeface.createFromAsset(getAssets(),"S.TTF");
        tulona.setTypeface(font);
        nijaKori.setTypeface(font);
        gonona.setTypeface(font);
        jog.setTypeface(font);
        note.setTypeface(font);

    }

   private void initialization() {
        tulona = (Button)findViewById(R.id.btn_tulona);
       nijaKori = (Button)findViewById(R.id.btn_nijaKori);
       gonona = (Button)findViewById(R.id.btn_gonona);
       jog = (Button)findViewById(R.id.btn_jog);
       note = (Button)findViewById(R.id.btn_notePoriciti);



    }

    private void settingListener() {
        tulona.setOnClickListener(this);
        nijaKori.setOnClickListener(this);
        gonona.setOnClickListener(this);
        jog.setOnClickListener(this);
        note.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
       // final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.scale_animation);

        switch (view.getId()){
            case R.id.btn_tulona:
                Intent intentTulona = new Intent(this,LocationSelection.class);
               //view.startAnimation(animScale);
                Bundle bundleTulona = new Bundle();
                bundleTulona.putString("value","tulona");
                intentTulona.putExtras(bundleTulona);
                startActivity(intentTulona);
                break;

            case R.id.btn_nijaKori:
                Intent intentNijaKori = new Intent(this,OngkaShikhiTwentyTwo.class);
               // view.startAnimation(animScale);
                startActivity(intentNijaKori);
                break;

            case R.id.btn_gonona:
                Intent intentGonona = new Intent(this,LocationSelection.class);
                Bundle bundleGonona = new Bundle();
                bundleGonona.putString("value","gonona");
                intentGonona.putExtras(bundleGonona);
                startActivity(intentGonona);
                break;

            case R.id.btn_jog:
                Intent intentJog = new Intent(this,LocationSelection.class);
                Bundle bundleJog = new Bundle();
                bundleJog.putString("value","jog");
                intentJog.putExtras(bundleJog);
                startActivity(intentJog);
                break;

            case R.id.btn_notePoriciti:
                Intent intentNote= new Intent(this,BdCoinNote.class);

                startActivity(intentNote);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
