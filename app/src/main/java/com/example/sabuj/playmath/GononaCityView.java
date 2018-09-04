package com.example.sabuj.playmath;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by SHOHAG on 7/4/2016.
 */
public class GononaCityView extends AppCompatActivity{

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
            imageView.setImageResource(R.drawable.gononacityone);
                break;
            case "two":
                imageView.setImageResource(R.drawable.gononacitytwo);
                break;
            case "three":
                imageView.setImageResource(R.drawable.gononacitythree);
                break;
            case "four":
                imageView.setImageResource(R.drawable.gononacityfour);
                break;
            case "five":
                imageView.setImageResource(R.drawable.gononacityfive);
                break;
            case "six":
                imageView.setImageResource(R.drawable.gononacitysix);
                break;
            case "seven":
                imageView.setImageResource(R.drawable.gononacityseven);
                break;
            case "eight":
                imageView.setImageResource(R.drawable.gononacityeight);
                break;
            case "nine":
                imageView.setImageResource(R.drawable.gononacitynine);
                break;
            case "ten":
                imageView.setImageResource(R.drawable.gononacityten);
                break;
        }

    }
}
