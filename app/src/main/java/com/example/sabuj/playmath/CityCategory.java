package com.example.sabuj.playmath;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by SABUJ on 02/08/2016.
 */
public class CityCategory extends AppCompatActivity {
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.city_category);

        Bundle extras = getIntent().getExtras();
        value = extras.getString("value");
    }

    public void Apple(View view) {
        switch (value) {
            case "tulona":
                Intent intentTulona = new Intent(this, TulonaApple.class);
                Bundle bundleTulona = new Bundle();
                bundleTulona.putInt("value", 1);
                intentTulona.putExtras(bundleTulona);
                startActivity(intentTulona);
                break;

            case "jog":
                Intent intentJog = new Intent(this, JogApple.class);
                Bundle bundleJog = new Bundle();
                bundleJog.putInt("value", 1);
                intentJog.putExtras(bundleJog);
                startActivity(intentJog);
                break;
        }

    }

    public void ConeIceCream(View view) {
        switch (value) {
            case "tulona":
                Intent intentTulona = new Intent(this, TulonaConeIceCream.class);
                Bundle bundleTulona = new Bundle();
                bundleTulona.putInt("value", 1);
                intentTulona.putExtras(bundleTulona);
                startActivity(intentTulona);
                break;

            case "jog":
                Intent intentJog = new Intent(this, JogCone.class);
                Bundle bundleJog = new Bundle();
                bundleJog.putInt("value", 1);
                intentJog.putExtras(bundleJog);
                startActivity(intentJog);
                break;
        }

    }

    public void CricketBall(View view) {
        switch (value) {
            case "tulona":
                Intent intentTulona = new Intent(this, TulonaCricketBall.class);
                Bundle bundleTulona = new Bundle();
                bundleTulona.putInt("value", 1);
                intentTulona.putExtras(bundleTulona);
                startActivity(intentTulona);
                break;

            case "jog":
                Intent intentJog = new Intent(this, JogCricketball.class);
                Bundle bundleJog = new Bundle();
                bundleJog.putInt("value", 1);
                intentJog.putExtras(bundleJog);
                startActivity(intentJog);
                break;
        }


    }

    public void Car(View view) {
        switch (value) {
            case "tulona":
                Intent intentTulona = new Intent(this, TulonaWatch.class);
                Bundle bundleTulona = new Bundle();
                bundleTulona.putInt("value", 1);
                intentTulona.putExtras(bundleTulona);
                startActivity(intentTulona);
                break;

            case "jog":
                Intent intentJog = new Intent(this, JogCar.class);
                Bundle bundleJog = new Bundle();
                bundleJog.putInt("value", 1);
                intentJog.putExtras(bundleJog);
                startActivity(intentJog);
                break;
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, ChapterMenu.class);
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
