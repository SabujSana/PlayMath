package com.example.sabuj.playmath;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by SHOHAG on 7/6/2016.
 */
public class JogFive extends AppCompatActivity implements View.OnClickListener{
    ImageButton leftBtn,cntrBtn,rghtBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jog_five);

        leftBtn = (ImageButton)findViewById(R.id.ib_left);
        cntrBtn = (ImageButton)findViewById(R.id.ib_center);
        rghtBtn = (ImageButton)findViewById(R.id.ib_right);

        leftBtn.setOnClickListener(this);
        cntrBtn.setOnClickListener(this);
        rghtBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ib_left:
                Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
                break;

            case R.id.ib_center:
                Toast.makeText(getApplicationContext(),"Right Answer",Toast.LENGTH_SHORT).show();
                break;

            case R.id.ib_right:

                Toast.makeText(getApplicationContext(),"Wrong Answer",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
