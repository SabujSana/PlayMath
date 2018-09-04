package com.example.sabuj.playmath;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by SABUJ on 08/04/2016.
 */
public class TulonaLombaKhato extends AppCompatActivity{
    ImageButton buttonLeft,buttonRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tulona_lomba_khato);
        buttonLeft =(ImageButton)findViewById(R.id.imBtn_left);
        buttonRight =(ImageButton)findViewById(R.id.imBtn_right);
    }

    public  void Left(View view){
        //Toast.makeText(getApplicationContext(),"Wrong Answer",Toast.LENGTH_SHORT).show();
wrong();
    }

    private void wrong() {
        LayoutInflater inflater = getLayoutInflater();
        View viewGroup = inflater.inflate(R.layout.custom_layout_wrong, (ViewGroup) findViewById(R.id.layout_custom));


        Toast toast = new Toast(TulonaLombaKhato.this);

        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setView(viewGroup);
        toast.show();
    }

    public  void Right(View view){
       // Toast.makeText(getApplicationContext(),"Right Answer",Toast.LENGTH_SHORT).show();
right();
    }

    private void right() {
        LayoutInflater inflater = getLayoutInflater();
        View viewGroup = inflater.inflate(R.layout.custom_layout_right, (ViewGroup) findViewById(R.id.layout_custom));


        Toast toast = new Toast(TulonaLombaKhato.this);

        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setView(viewGroup);
        toast.show();
    }
}
