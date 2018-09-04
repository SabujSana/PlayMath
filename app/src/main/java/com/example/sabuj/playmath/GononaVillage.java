package com.example.sabuj.playmath;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by SHOHAG on 7/4/2016.
 */
public class GononaVillage extends AppCompatActivity implements View.OnClickListener{
ImageButton ibOne,ibTwo,ibThree,ibFour,ibFive,ibSix,ibseven,ibEight,ibNine,ibTen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gonona_activity);
        initialize();

        ibOne.setOnClickListener(this);
        ibTwo.setOnClickListener(this);
        ibThree.setOnClickListener(this);
        ibFour.setOnClickListener(this);
        ibFive.setOnClickListener(this);
        ibSix.setOnClickListener(this);
        ibseven.setOnClickListener(this);
        ibEight.setOnClickListener(this);
        ibNine.setOnClickListener(this);
        ibTen.setOnClickListener(this);

    }

    private void initialize() {

        ibOne = (ImageButton)findViewById(R.id.oneLeft);
        ibTwo = (ImageButton)findViewById(R.id.oneCenter);
        ibThree = (ImageButton)findViewById(R.id.oneRight);
        ibFour = (ImageButton)findViewById(R.id.twoLeft);
        ibFive = (ImageButton)findViewById(R.id.twoCenter);
        ibSix = (ImageButton)findViewById(R.id.twoRight);
        ibseven = (ImageButton)findViewById(R.id.threeLeft);
        ibEight = (ImageButton)findViewById(R.id.threeCenter);
        ibNine = (ImageButton)findViewById(R.id.threeRight);
        ibTen = (ImageButton)findViewById(R.id.fourCenter);
    }


    @Override
    public void onClick(View view) {

switch (view.getId()){


    case R.id.oneLeft:
        Intent intentOne = new Intent(this,GononaVillageView.class);
        Bundle one = new Bundle();
        one.putString("value","one");
        intentOne.putExtras(one);
        startActivity(intentOne);
        break;

    case R.id.oneCenter:
        Intent intentTwo = new Intent(this,GononaVillageView.class);
        Bundle two = new Bundle();
        two.putString("value","two");
        intentTwo.putExtras(two);
        startActivity(intentTwo);
        break;

    case R.id.oneRight:
        Intent intentThree = new Intent(this,GononaVillageView.class);
        Bundle three = new Bundle();
        three.putString("value","three");
        intentThree.putExtras(three);
        startActivity(intentThree);
        break;

    case R.id.twoLeft:
        Intent intentFour= new Intent(this,GononaVillageView.class);
        Bundle four = new Bundle();
        four.putString("value","four");
        intentFour.putExtras(four);
        startActivity(intentFour);
        break;

    case R.id.twoCenter:
        Intent intentFive = new Intent(this,GononaVillageView.class);
        Bundle five = new Bundle();
        five.putString("value","five");
        intentFive.putExtras(five);
        startActivity(intentFive);
        break;

    case R.id.twoRight:
        Intent intentSix = new Intent(this,GononaVillageView.class);
        Bundle six = new Bundle();
        six.putString("value","six");
        intentSix.putExtras(six);
        startActivity(intentSix);
        break;

    case R.id.threeLeft:
        Intent intentSeven= new Intent(this,GononaVillageView.class);
        Bundle seven = new Bundle();
        seven.putString("value","seven");
        intentSeven.putExtras(seven);
        startActivity(intentSeven);
        break;

    case R.id.threeCenter:
        Intent intentEight = new Intent(this,GononaVillageView.class);
        Bundle eight = new Bundle();
        eight.putString("value","eight");
        intentEight.putExtras(eight);
        startActivity(intentEight);
        break;

    case R.id.threeRight:
        Intent intentNine = new Intent(this,GononaVillageView.class);
        Bundle nine = new Bundle();
        nine.putString("value","nine");
        intentNine.putExtras(nine);
        startActivity(intentNine);
        break;

    case R.id.fourCenter:
        Intent intentTen = new Intent(this,GononaVillageView.class);
        Bundle ten = new Bundle();
        ten.putString("value","ten");
        intentTen.putExtras(ten);
        startActivity(intentTen);
        break;
}
    }
}
