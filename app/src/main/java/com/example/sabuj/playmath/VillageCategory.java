package com.example.sabuj.playmath;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by SABUJ on 02/08/2016.
 */
public class VillageCategory extends AppCompatActivity{
String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.village_category);

        Bundle extras = getIntent().getExtras();
        value = extras.getString("value");
    }

    public  void Football(View view){
        switch (value){
            case "tulona":
                Intent intentTulona =new Intent(this,TulonaFootball.class);
                Bundle bundleTulona = new Bundle();
                bundleTulona.putInt("value",1);
                intentTulona.putExtras(bundleTulona);
                startActivity(intentTulona);
                break;
            case "jog":
                Intent intentJog =new Intent(this,JogFootbal.class);
                Bundle bundleJog = new Bundle();
                bundleJog.putInt("value",1);
                intentJog.putExtras(bundleJog);
                startActivity(intentJog);
                break;
        }

      }

    public  void Glass(View view){
        switch (value){
            case "tulona":
                Intent intent =new Intent(this,TulonaGlass.class);
                Bundle bundle = new Bundle();
                bundle.putInt("value",1);
                intent.putExtras(bundle);
                startActivity(intent);
                break;

            case "jog":
                Intent intentJog =new Intent(this,JogGlass.class);
                Bundle bundleJog = new Bundle();
                bundleJog.putInt("value",1);
                intentJog.putExtras(bundleJog);
                startActivity(intentJog);
                break;
        }

    }

    public  void Cat(View view){
        switch (value){
            case "tulona":
                Intent intent =new Intent(this,TulonaCat.class);
                Bundle bundle = new Bundle();
                bundle.putInt("value",1);
                intent.putExtras(bundle);
                startActivity(intent);
                break;

            case "jog":
                Intent intentJog =new Intent(this,JogCat.class);
                Bundle bundleJog = new Bundle();
                bundleJog.putInt("value",1);
                intentJog.putExtras(bundleJog);
                startActivity(intentJog);
                break;
        }

    }

    public  void Watch(View view){
        switch (value){
            case "tulona":
                Intent intent =new Intent(this,TulonaWatch.class);
                Bundle bundle = new Bundle();
                bundle.putInt("value",1);
                intent.putExtras(bundle);
                startActivity(intent);
                break;

            case "jog":
                Intent intentJog =new Intent(this,JogWatch.class);
                Bundle bundleJog = new Bundle();
                bundleJog.putInt("value",1);
                intentJog.putExtras(bundleJog);
                startActivity(intentJog);
                break;
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this,ChapterMenu.class);
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
