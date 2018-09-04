package com.example.sabuj.playmath;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by SHOHAG on 7/4/2016.
 */
public class GononaVillageView extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gonona_view);

        ImageView imageView =(ImageView)findViewById(R.id.imageView);

        String value = "";
        Bundle extras = getIntent().getExtras();
        value = extras.getString("value");
        switch (value){
            case "one":
            imageView.setImageResource(R.drawable.gononagramone);
                break;
            case "two":
                imageView.setImageResource(R.drawable.gononagramtwo);
                break;
            case "three":
                imageView.setImageResource(R.drawable.gononagramthree);
                break;
            case "four":
                imageView.setImageResource(R.drawable.gononagramfour);
                break;
            case "five":
                imageView.setImageResource(R.drawable.gononagramfive);
                break;
            case "six":
                imageView.setImageResource(R.drawable.gononagramsix);
                break;
            case "seven":
                imageView.setImageResource(R.drawable.gononagramseven);
                break;
            case "eight":
                imageView.setImageResource(R.drawable.gononagrameight);
                break;
            case "nine":
                imageView.setImageResource(R.drawable.gononagramnine);
                break;
            case "ten":
                imageView.setImageResource(R.drawable.gononagramten);
                break;
        }

    }
}
