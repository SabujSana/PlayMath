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
public class TulonaGlass extends AppCompatActivity {

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
                textView.setText("কোনটা খাটো ?");
                imgLeft.setBackgroundResource(R.drawable.glasssmall);
                imgRight.setBackgroundResource(R.drawable.glasslarge);
                // mediaPlayer = MediaPlayer.create(this, R.raw.khato);
                // mediaPlayer.start();
                break;

            case 2:
                textView.setText("কোনটাতে কম ?");
                imgLeft.setBackgroundResource(R.drawable.glassfive);
                imgRight.setBackgroundResource(R.drawable.glasseight);
                // mediaPlayer = MediaPlayer.create(this, R.raw.kom);
                // mediaPlayer.start();
                break;

            case 3:
                textView.setText("কোনটাতে লম্বা ?");
                imgLeft.setBackgroundResource(R.drawable.glasssmall);
                imgRight.setBackgroundResource(R.drawable.glasslarge);
                //  mediaPlayer = MediaPlayer.create(this, R.raw.lomba);
                // mediaPlayer.start();
                break;

            case 4:
                textView.setText("কোনটাতে  বেশি ?");
                imgLeft.setBackgroundResource(R.drawable.glassseven);
                imgRight.setBackgroundResource(R.drawable.glassfive);
                // mediaPlayer = MediaPlayer.create(this, R.raw.basi);
                // mediaPlayer.start();
                break;

            case 5:
                textView.setText("কোনটাতে কম ?");
                imgLeft.setBackgroundResource(R.drawable.glasssix);
                imgRight.setBackgroundResource(R.drawable.glasseight);
                //mediaPlayer = MediaPlayer.create(this, R.raw.kom);
                //  mediaPlayer.start();
                break;

        }

    }

    public void Left(View view) {


        if (value == 1) {
            right();
            // Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_SHORT).show();
            question1 = 10;
        } else if (value == 2) {
            right();
            // Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_SHORT).show();
            question2 = 10;
        } else if (value == 3) {
            wrong();
            //Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
            question3 = 0;
        } else if (value == 4) {
            right();
            // Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_SHORT).show();
            question4 = 10;
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
            Intent intent = new Intent(this, TulonaGlass.class);
            Bundle bundle = new Bundle();
            bundle.putInt("value", (value + 1));
            intent.putExtras(bundle);
            startActivity(intent);
        }

    }


    public void Right(View view) {
        if (value == 1) {
            wrong();
            //  Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
            question1 = 0;
        } else if (value == 2) {
            wrong();
            // Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
            question2 = 0;
        } else if (value == 3) {
            right();
            // Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_SHORT).show();
            question3 = 10;
        } else if (value == 4) {
            wrong();
            // Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
            question4 = 0;
        } else if (value == 5) {
            //Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
            wrong();
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
        }
        if (value != 5) {

//            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer) {
//                    mediaPlayer.reset();
//
//                }
//            });
            Intent intent = new Intent(this, TulonaGlass.class);
            Bundle bundle = new Bundle();
            bundle.putInt("value", (value + 1));
            intent.putExtras(bundle);
            startActivity(intent);
        }

    }

    public void right() {

        LayoutInflater inflater = getLayoutInflater();
        View viewGroup = inflater.inflate(R.layout.custom_layout_right, (ViewGroup) findViewById(R.id.layout_custom));


        Toast toast = new Toast(TulonaGlass.this);

        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setView(viewGroup);
        toast.show();
    }

    public void wrong() {

        LayoutInflater inflater = getLayoutInflater();
        View viewGroup = inflater.inflate(R.layout.custom_layout_wrong, (ViewGroup) findViewById(R.id.layout_custom));


        Toast toast = new Toast(TulonaGlass.this);

        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setView(viewGroup);
        toast.show();
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, ChapterMenu.class);
        startActivity(intent);


    }

}

