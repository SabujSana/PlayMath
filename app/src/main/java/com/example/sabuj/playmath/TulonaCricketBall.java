package com.example.sabuj.playmath;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by SABUJ on 02/08/2016.
 */
public class TulonaCricketBall extends AppCompatActivity {

    TextView textView;
    ImageButton imgRight, imgLeft;
    public static int value, question1, question2, question3, question4, question5, intResult;
    String result;
   // private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tulona);

        textView = (TextView) findViewById(R.id.textView);
        imgRight = (ImageButton) findViewById(R.id.imBtn_right);
        imgLeft = (ImageButton) findViewById(R.id.imBtn_left);


        Bundle extras = getIntent().getExtras();
        value = extras.getInt("value");


        switch (value) {
            case 1:
                textView.setText("কোনটা বড় ?");
                imgLeft.setBackgroundResource(R.drawable.cricketballsmall);
                imgRight.setBackgroundResource(R.drawable.cricketballlarge);
                /// mediaPlayer = MediaPlayer.create(this, R.raw.boro);
                //  mediaPlayer.start();
                break;

            case 2:
                textView.setText("কোনটাতে বেশি ?");
                imgLeft.setBackgroundResource(R.drawable.cricketballnine);
                imgRight.setBackgroundResource(R.drawable.cricketballsix);
                // mediaPlayer = MediaPlayer.create(this, R.raw.basi);
                //  mediaPlayer.start();
                break;

            case 3:
                textView.setText("কোনটাতে কম ?");
                imgLeft.setBackgroundResource(R.drawable.cricketballfive);
                imgRight.setBackgroundResource(R.drawable.cricketballseven);
                // mediaPlayer = MediaPlayer.create(this, R.raw.kom);
                //    mediaPlayer.start();
                break;

            case 4:
                textView.setText("কোনটা  ছোট?");
                imgLeft.setBackgroundResource(R.drawable.cricketballlarge);
                imgRight.setBackgroundResource(R.drawable.cricketballsmall);
                // mediaPlayer = MediaPlayer.create(this, R.raw.coto);
                //  mediaPlayer.start();
                break;

            case 5:
                textView.setText("কোনটাতে বেশি ?");
                imgLeft.setBackgroundResource(R.drawable.cricketballnine);
                imgRight.setBackgroundResource(R.drawable.cricketballseven);
                //  mediaPlayer = MediaPlayer.create(this, R.raw.basi);
                //  mediaPlayer.start();
                break;

        }

    }

    public void Left(View view) {


        if (value == 1) {
            wrong();
            //  Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
            question1 = 0;
            // mediaPlayer.stop();
            // mediaPlayer = MediaPlayer.create(this,R.raw.two);
            // mediaPlayer.startttt();
        } else if (value == 2) {
            right();
            // Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_SHORT).show();
            question2 = 10;
        } else if (value == 3) {
            right();
            // Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_SHORT).show();
            question3 = 10;
        } else if (value == 4) {
            wrong();
            // Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
            question4 = 0;
        } else if (value == 5) {
            right();
            //Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_SHORT).show();
            question5 = 10;
            intResult = question1 + question2 + question3 + question4 + question5;
            switch (intResult) {
                case 0:
                    result="০";
                    break;
                case 10:
                    result = "১০";
                    break;
                case 20:
                    result = "২০";
                    break;
                case 30:
                    result = "৩০";
                    break;
                case 40:
                    result = "৪০";
                    break;
                case 50:
                    result = "৫০";
                    break;

            }

            AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
            alertDialog.setMessage("তুমি  " + result + " নম্বর পেয়েছ ।")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            //dialogInterface.dismiss();
                            Intent intent = new Intent(getBaseContext(), ChapterMenu.class);
                            startActivity(intent);
                        }
                    }).create();
            alertDialog.show();

        }

        if (value != 5) {
//            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer) {
//                    mediaPlayer.reset();
//
//                }
//            });
            Intent intent = new Intent(getBaseContext(), TulonaCricketBall.class);
            Bundle bundle = new Bundle();
            bundle.putInt("value", (value + 1));
            intent.putExtras(bundle);
            startActivity(intent);
        }

    }


    public void Right(View view) {
        if (value == 1) {
            right();
            // Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_SHORT).show();
            question1 = 10;
            //mediaPlayer.stop();
            //mediaPlayer.reset();
            // mediaPlayer = MediaPlayer.create(this,R.raw.two);
            // mediaPlayer.startttt();
        } else if (value == 2) {
            wrong();
            // Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
            question2 = 0;
        } else if (value == 3) {
            wrong();
            //  Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
            question3 = 0;
        } else if (value == 4) {
            right();
            //  Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_SHORT).show();
            question4 = 10;
        } else if (value == 5) {
            wrong();
            // Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
            question5 = 0;
            intResult = question1 + question2 + question3 + question4 + question5;
            switch (intResult) {
                case 0:
                    result="০";
                    break;
                case 10:
                    result = "১০";
                    break;
                case 20:
                    result = "২০";
                    break;
                case 30:
                    result = "৩০";
                    break;
                case 40:
                    result = "৪০";
                    break;
                case 50:
                    result = "৫০";
                    break;

            }

            AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
            alertDialog.setMessage("তুমি  " + result + " নম্বর পেয়েছ ।")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            // dialogInterface.dismiss();

                            Intent intent = new Intent(getBaseContext(), ChapterMenu.class);
                            startActivity(intent);
                        }
                    }).create();
            alertDialog.show();

            //Intent intent =new Intent(this,TulonaVillageCategory.class);
            //startActivity(intent);
        }
        if (value != 5) {

//            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer) {
//                    mediaPlayer.reset();
//
//                }
//            });

            Intent intent = new Intent(getBaseContext(), TulonaCricketBall.class);
            Bundle bundle = new Bundle();
            bundle.putInt("value", (value + 1));
            intent.putExtras(bundle);
            startActivity(intent);
        }

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, ChapterMenu.class);
        startActivity(intent);

    }

    public void right() {

        LayoutInflater inflater = getLayoutInflater();
        View viewGroup = inflater.inflate(R.layout.custom_layout_right, (ViewGroup) findViewById(R.id.layout_custom));


        Toast toast = new Toast(TulonaCricketBall.this);

        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setView(viewGroup);
        toast.show();
    }

    public void wrong() {

        LayoutInflater inflater = getLayoutInflater();
        View viewGroup = inflater.inflate(R.layout.custom_layout_wrong, (ViewGroup) findViewById(R.id.layout_custom));


        Toast toast = new Toast(TulonaCricketBall.this);

        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setView(viewGroup);
        toast.show();
    }


    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

}

