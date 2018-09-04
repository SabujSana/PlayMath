package com.example.sabuj.playmath;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by SABUJ on 01/08/2016.
 */
public class LocationSelection extends AppCompatActivity {

    ImageButton village, city;
   // MediaPlayer mediaPlayer;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_selection);

        village = (ImageButton) findViewById(R.id.village);
        city = (ImageButton) findViewById(R.id.city);

        Bundle extras = getIntent().getExtras();
        value = extras.getString("value");

//        mediaPlayer = MediaPlayer.create(this, R.raw.tomerbari);
//        mediaPlayer.start();
//        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mediaPlayer) {
//                mediaPlayer.reset();
//            }
//        });
    }


    public void Village(View view) {
//        mediaPlayer = MediaPlayer.create(this, R.raw.gram);
//        mediaPlayer.start();
        switch (value) {
            case "tulona":
                Intent intentTulona = new Intent(this, VillageCategory.class);
                Bundle bundleTulona = new Bundle();
                bundleTulona.putString("value", "tulona");
                intentTulona.putExtras(bundleTulona);
                startActivity(intentTulona);
                break;

            case "jog":
                Intent intentJog = new Intent(this, VillageCategory.class);
                Bundle bundleJog = new Bundle();
                bundleJog.putString("value", "jog");
                intentJog.putExtras(bundleJog);
                startActivity(intentJog);
                break;

            case "gonona":
                Intent intentGonona = new Intent(this, GononaVillage.class);
                startActivity(intentGonona);
                break;
        }


    }


    public void City(View view) {

        switch (value) {
            case "tulona":
                Intent intentTulona = new Intent(this, CityCategory.class);
                Bundle bundleTulona = new Bundle();
                bundleTulona.putString("value", "tulona");
                intentTulona.putExtras(bundleTulona);
                startActivity(intentTulona);
                break;

            case "jog":
                Intent intentJog = new Intent(this, CityCategory.class);
                Bundle bundleJog = new Bundle();
                bundleJog.putString("value", "jog");
                intentJog.putExtras(bundleJog);
                startActivity(intentJog);
                break;

            case "gonona":
                Intent intentGonona = new Intent(this, GononaCity.class);
                startActivity(intentGonona);
                break;
        }


    }
}
