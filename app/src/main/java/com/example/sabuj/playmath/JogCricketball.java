package com.example.sabuj.playmath;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by SABUJ on 02/08/2016.
 */
public class JogCricketball extends AppCompatActivity {

    ImageView imageView1, imageView2, imageView3, imageView4, imageView5,
            imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12, imageView13, imageView14,
            imageView15, imageView16, imageView17, imageView18, imageView19, imageView20, ivLeftNumber, ivRightNumber, ivsign, ivEqual;
    ImageButton ibRight, ibLeft, ibCenter;
    public static int value, question1, question2, question3, question4, question5, intResult;
    String result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jog_activity);

        initialization();


        Bundle extras = getIntent().getExtras();
        value = extras.getInt("value");


        switch (value) {
            case 1:
                imageView1.setBackgroundResource(R.drawable.blank);
                imageView2.setBackgroundResource(R.drawable.blank);
                imageView3.setBackgroundResource(R.drawable.blank);
                imageView4.setBackgroundResource(R.drawable.blank);
                imageView5.setBackgroundResource(R.drawable.blank);
                imageView6.setBackgroundResource(R.drawable.blank);
                imageView7.setBackgroundResource(R.drawable.jogcricketball);
                imageView8.setBackgroundResource(R.drawable.jogcricketball);
                imageView9.setBackgroundResource(R.drawable.jogcricketball);
                imageView10.setBackgroundResource(R.drawable.jogcricketball);
                imageView11.setBackgroundResource(R.drawable.jogcricketball);
                imageView12.setBackgroundResource(R.drawable.jogcricketball);
                imageView13.setBackgroundResource(R.drawable.jogcricketball);
                imageView14.setBackgroundResource(R.drawable.jogcricketball);
                imageView15.setBackgroundResource(R.drawable.jogcricketball);

                imageView16.setBackgroundResource(R.drawable.jogcricketball);
                imageView17.setBackgroundResource(R.drawable.jogcricketball);
                imageView18.setBackgroundResource(R.drawable.jogcricketball);
                imageView19.setBackgroundResource(R.drawable.jogcricketball);
                imageView20.setBackgroundResource(R.drawable.jogcricketball);

                ivLeftNumber.setBackgroundResource(R.drawable.circlefive);
                ivRightNumber.setBackgroundResource(R.drawable.circlenine);

                ivsign.setBackgroundResource(R.drawable.circleplas);
                ivEqual.setBackgroundResource(R.drawable.circleequal);

                ibLeft.setBackgroundResource(R.drawable.taro);
                ibCenter.setBackgroundResource(R.drawable.coddo);
                ibRight.setBackgroundResource(R.drawable.ponero);

                break;

            case 2:
                imageView1.setBackgroundResource(R.drawable.blank);
                imageView2.setBackgroundResource(R.drawable.blank);
                imageView3.setBackgroundResource(R.drawable.blank);
                imageView4.setBackgroundResource(R.drawable.blank);
                imageView5.setBackgroundResource(R.drawable.blank);
                imageView6.setBackgroundResource(R.drawable.blank);
                imageView7.setBackgroundResource(R.drawable.blank);
                imageView8.setBackgroundResource(R.drawable.jogcricketball);
                imageView9.setBackgroundResource(R.drawable.jogcricketball);
                imageView10.setBackgroundResource(R.drawable.jogcricketball);
                imageView11.setBackgroundResource(R.drawable.blank);
                imageView12.setBackgroundResource(R.drawable.jogcricketball);
                imageView13.setBackgroundResource(R.drawable.jogcricketball);
                imageView14.setBackgroundResource(R.drawable.jogcricketball);
                imageView15.setBackgroundResource(R.drawable.blank);

                imageView16.setBackgroundResource(R.drawable.jogcricketball);
                imageView17.setBackgroundResource(R.drawable.jogcricketball);
                imageView18.setBackgroundResource(R.drawable.jogcricketball);
                imageView19.setBackgroundResource(R.drawable.jogcricketball);
                imageView20.setBackgroundResource(R.drawable.jogcricketball);

                ivLeftNumber.setBackgroundResource(R.drawable.circlethree);
                ivRightNumber.setBackgroundResource(R.drawable.circleeight);

                ivsign.setBackgroundResource(R.drawable.circleplas);
                ivEqual.setBackgroundResource(R.drawable.circleequal);

                ibLeft.setBackgroundResource(R.drawable.doss);
                ibCenter.setBackgroundResource(R.drawable.baro);
                ibRight.setBackgroundResource(R.drawable.agaro);
                break;

            case 3:

                imageView1.setBackgroundResource(R.drawable.jogcricketball);
                imageView2.setBackgroundResource(R.drawable.jogcricketball);
                imageView3.setBackgroundResource(R.drawable.jogcricketball);
                imageView4.setBackgroundResource(R.drawable.jogcricketball);
                imageView5.setBackgroundResource(R.drawable.blank);
                imageView6.setBackgroundResource(R.drawable.blank);
                imageView7.setBackgroundResource(R.drawable.blank);
                imageView8.setBackgroundResource(R.drawable.jogcricketball);
                imageView9.setBackgroundResource(R.drawable.jogcricketball);
                imageView10.setBackgroundResource(R.drawable.jogcricketball);
                imageView11.setBackgroundResource(R.drawable.jogcricketball);
                imageView12.setBackgroundResource(R.drawable.jogcricketball);
                imageView13.setBackgroundResource(R.drawable.jogcricketball);
                imageView14.setBackgroundResource(R.drawable.jogcricketball);
                imageView15.setBackgroundResource(R.drawable.jogcricketball);

                imageView16.setBackgroundResource(R.drawable.jogcricketball);
                imageView17.setBackgroundResource(R.drawable.jogcricketball);
                imageView18.setBackgroundResource(R.drawable.jogcricketball);
                imageView19.setBackgroundResource(R.drawable.jogcricketball);
                imageView20.setBackgroundResource(R.drawable.jogcricketball);

                ivLeftNumber.setBackgroundResource(R.drawable.circlenine);
                ivRightNumber.setBackgroundResource(R.drawable.circleeight);

                ivsign.setBackgroundResource(R.drawable.circleplas);
                ivEqual.setBackgroundResource(R.drawable.circleequal);

                ibLeft.setBackgroundResource(R.drawable.atharo);
                ibCenter.setBackgroundResource(R.drawable.sotaro);
                ibRight.setBackgroundResource(R.drawable.unis);
                break;

            case 4:

                imageView1.setBackgroundResource(R.drawable.blank);
                imageView2.setBackgroundResource(R.drawable.blank);
                imageView3.setBackgroundResource(R.drawable.blank);
                imageView4.setBackgroundResource(R.drawable.blank);
                imageView5.setBackgroundResource(R.drawable.blank);
                imageView6.setBackgroundResource(R.drawable.blank);
                imageView7.setBackgroundResource(R.drawable.blank);
                imageView8.setBackgroundResource(R.drawable.blank);
                imageView9.setBackgroundResource(R.drawable.blank);
                imageView10.setBackgroundResource(R.drawable.blank);
                imageView11.setBackgroundResource(R.drawable.jogcricketball);
                imageView12.setBackgroundResource(R.drawable.jogcricketball);
                imageView13.setBackgroundResource(R.drawable.jogcricketball);
                imageView14.setBackgroundResource(R.drawable.jogcricketball);
                imageView15.setBackgroundResource(R.drawable.blank);

                imageView16.setBackgroundResource(R.drawable.jogcricketball);
                imageView17.setBackgroundResource(R.drawable.jogcricketball);
                imageView18.setBackgroundResource(R.drawable.jogcricketball);
                imageView19.setBackgroundResource(R.drawable.jogcricketball);
                imageView20.setBackgroundResource(R.drawable.jogcricketball);

                ivLeftNumber.setBackgroundResource(R.drawable.circlefour);
                ivRightNumber.setBackgroundResource(R.drawable.circlefive);

                ivsign.setBackgroundResource(R.drawable.circleplas);
                ivEqual.setBackgroundResource(R.drawable.circleequal);

                ibLeft.setBackgroundResource(R.drawable.noi);
                ibCenter.setBackgroundResource(R.drawable.doss);
                ibRight.setBackgroundResource(R.drawable.att);
                break;


            case 5:

                imageView1.setBackgroundResource(R.drawable.jogcricketball);
                imageView2.setBackgroundResource(R.drawable.blank);
                imageView3.setBackgroundResource(R.drawable.blank);
                imageView4.setBackgroundResource(R.drawable.blank);
                imageView5.setBackgroundResource(R.drawable.blank);
                imageView6.setBackgroundResource(R.drawable.blank);
                imageView7.setBackgroundResource(R.drawable.blank);
                imageView8.setBackgroundResource(R.drawable.blank);
                imageView9.setBackgroundResource(R.drawable.blank);
                imageView10.setBackgroundResource(R.drawable.blank);
                imageView11.setBackgroundResource(R.drawable.jogcricketball);
                imageView12.setBackgroundResource(R.drawable.jogcricketball);
                imageView13.setBackgroundResource(R.drawable.jogcricketball);
                imageView14.setBackgroundResource(R.drawable.jogcricketball);
                imageView15.setBackgroundResource(R.drawable.jogcricketball);

                imageView16.setBackgroundResource(R.drawable.blank);
                imageView17.setBackgroundResource(R.drawable.blank);
                imageView18.setBackgroundResource(R.drawable.blank);
                imageView19.setBackgroundResource(R.drawable.jogcricketball);
                imageView20.setBackgroundResource(R.drawable.jogcricketball);

                ivLeftNumber.setBackgroundResource(R.drawable.circlesix);
                ivRightNumber.setBackgroundResource(R.drawable.circletwo);

                ivsign.setBackgroundResource(R.drawable.circleplas);
                ivEqual.setBackgroundResource(R.drawable.circleequal);

                ibLeft.setBackgroundResource(R.drawable.noi);
                ibCenter.setBackgroundResource(R.drawable.att);
                ibRight.setBackgroundResource(R.drawable.doss);
                break;

        }

    }

    private void initialization() {
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView7 = (ImageView) findViewById(R.id.imageView7);
        imageView8 = (ImageView) findViewById(R.id.imageView8);
        imageView9 = (ImageView) findViewById(R.id.imageView9);
        imageView10 = (ImageView) findViewById(R.id.imageView10);
        imageView11 = (ImageView) findViewById(R.id.imageView11);
        imageView12 = (ImageView) findViewById(R.id.imageView12);
        imageView13 = (ImageView) findViewById(R.id.imageView13);
        imageView14 = (ImageView) findViewById(R.id.imageView14);
        imageView15 = (ImageView) findViewById(R.id.imageView15);
        imageView16 = (ImageView) findViewById(R.id.imageView16);
        imageView17 = (ImageView) findViewById(R.id.imageView17);
        imageView18 = (ImageView) findViewById(R.id.imageView18);
        imageView19 = (ImageView) findViewById(R.id.imageView19);
        imageView20 = (ImageView) findViewById(R.id.imageView20);
        ivLeftNumber = (ImageView) findViewById(R.id.iv_left_number);
        ivRightNumber = (ImageView) findViewById(R.id.iv_right_number);
        ivsign = (ImageView) findViewById(R.id.iv_sign);
        ivEqual = (ImageView) findViewById(R.id.iv_equal);

        ibLeft = (ImageButton) findViewById(R.id.ib_left);
        ibCenter = (ImageButton) findViewById(R.id.ib_center);
        ibRight = (ImageButton) findViewById(R.id.ib_right);
    }

    public void Left(View view) {


        if (value == 1) {
            Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
            question1 = 0;
            // mediaPlayer.stop();
            // mediaPlayer = MediaPlayer.create(this,R.raw.two);
            // mediaPlayer.startttt();
        } else if (value == 2) {
            Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
            question2 = 0;
        } else if (value == 3) {
            Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
            question3 = 0;
        } else if (value == 4) {
            Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_SHORT).show();
            question4 = 10;
        } else if (value == 5) {
            //Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
            question5 = 0;
            intResult = question1 + question2 + question3 + question4 + question5;
            switch (intResult){
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
                    result ="৪০";
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

            Intent intent = new Intent(getBaseContext(), JogCricketball.class);
            Bundle bundle = new Bundle();
            bundle.putInt("value", (value + 1));
            intent.putExtras(bundle);
            startActivity(intent);
        }

    }

    public void Center(View view) {


        if (value == 1) {
            Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_SHORT).show();
            question1 = 10;
            // mediaPlayer.stop();
            // mediaPlayer = MediaPlayer.create(this,R.raw.two);
            // mediaPlayer.startttt();
        } else if (value == 2) {
            Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
            question2 = 0;
        } else if (value == 3) {
            Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_SHORT).show();
            question3 = 10;
        } else if (value == 4) {
            Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
            question4 = 0;
        } else if (value == 5) {
            //Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_SHORT).show();
            question5 = 10;
            intResult = question1 + question2 + question3 + question4 + question5;
            switch (intResult){
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
                    result ="৪০";
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

            Intent intent = new Intent(getBaseContext(), JogCricketball.class);
            Bundle bundle = new Bundle();
            bundle.putInt("value", (value + 1));
            intent.putExtras(bundle);
            startActivity(intent);
        }

    }

    public void Right(View view) {
        if (value == 1) {
            Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
            question1 = 0;
            //mediaPlayer.stop();
            //mediaPlayer.reset();
            // mediaPlayer = MediaPlayer.create(this,R.raw.two);
            // mediaPlayer.startttt();
        } else if (value == 2) {
            Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_SHORT).show();
            question2 = 10;
        } else if (value == 3) {
            Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
            question3 = 0;
        } else if (value == 4) {
            Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
            question4 = 0;
        } else if (value == 5) {
            // Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
            question5 = 0;
            intResult = question1 + question2 + question3 + question4 + question5;
            switch (intResult){
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
                    result ="৪০";
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


            Intent intent = new Intent(getBaseContext(), JogCricketball.class);
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

