package com.example.sabuj.playmath;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by SABUJ on 21/10/2016.
 */
public class BdCoinNote extends AppCompatActivity {
    ViewPager viewPager;
    ViewpagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bd_coin_note);
        viewPager = (ViewPager)findViewById(R.id.view_pager);
        adapter = new ViewpagerAdapter(this);
        viewPager.setAdapter(adapter);
    }
}
