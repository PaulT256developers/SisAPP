package com.example.mysis;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;

public class PlantMonitor extends AppCompatActivity implements NumberPicker.OnValueChangeListener{
    private TextView tv;
    private TextView week2;
    private TextView wk3;
    private TextView wk4;
    private TextView wk5;
    static Dialog d ;
    static Dialog d2 ;
    Button bvibrate;
    Vibrator vibrator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_monitor);
        //vibration
        bvibrate = findViewById(R.id.savebtn);
        bvibrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibrator =(Vibrator) getSystemService(VIBRATOR_SERVICE);
                if (Build.VERSION.SDK_INT >= 26){
                    vibrator.vibrate(VibrationEffect.createOneShot(300, VibrationEffect.DEFAULT_AMPLITUDE));

                }else {
                    vibrator.vibrate(300);
                }
            }
        });

        tv = (TextView) findViewById(R.id.textView1);
        tv.setOnClickListener(new View.OnClickListener()  // on click of button display the dialog
        {
            @Override
            public void onClick(View v) {
                show();
            }
        });

        //number picker of week 2
        week2 =(TextView) findViewById(R.id.week);
        week2.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                show2();
            }
        });
        //number picker of week 3
        wk3 =(TextView) findViewById(R.id.week3);
        wk3.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                show3();
            }
        });

        //number picker of week 4
        wk4 =(TextView) findViewById(R.id.week4);
        wk4.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                show4();
            }
        });

        //number picker of week 5
        wk5 =(TextView) findViewById(R.id.week5);
        wk5.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                show5();
            }
        });
    }

    @Override
    public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
        Log.i("value is",""+newVal);
    }
    public void show()
    {

        final Dialog d = new Dialog(PlantMonitor.this);
        d.setTitle("Moisture Percentage");
        d.setContentView(R.layout.dialog);
        Button b1 = (Button) d.findViewById(R.id.button1);
        Button b2 = (Button) d.findViewById(R.id.button2);
        final NumberPicker np = (NumberPicker) d.findViewById(R.id.numberPicker1);
        np.setMaxValue(100); // max value 100
        np.setMinValue(30);   // min value 0
        np.setWrapSelectorWheel(false);
        np.setOnValueChangedListener(this);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                tv.setText(String.valueOf(np.getValue())+"%"); //set the value to textview
                d.dismiss();
            }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                d.dismiss(); // dismiss the dialog
            }
        });
        d.show();


    }

    public void show2()
    {
        final Dialog d2 = new Dialog(PlantMonitor.this);
        d2.setTitle("Moisture Percentage");
        d2.setContentView(R.layout.dialog2);
        Button b3 = (Button) d2.findViewById(R.id.button3);
        Button b4 = (Button) d2.findViewById(R.id.button4);
        final NumberPicker np2 = (NumberPicker) d2.findViewById(R.id.numberPicker2);
        np2.setMaxValue(100); // max value 100
        np2.setMinValue(30);   // min value 30
        np2.setWrapSelectorWheel(false);
        np2.setOnValueChangedListener(this);
        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                week2.setText(String.valueOf(np2.getValue())+"%"); //set the value to textview
                d2.dismiss();
            }
        });
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                d2.dismiss(); // dismiss the dialog
            }
        });
        d2.show();
    }

    public void show3()
    {
        final Dialog d2 = new Dialog(PlantMonitor.this);
        d2.setTitle("Moisture Percentage");
        d2.setContentView(R.layout.dialog2);
        Button b3 = (Button) d2.findViewById(R.id.button3);
        Button b4 = (Button) d2.findViewById(R.id.button4);
        final NumberPicker np2 = (NumberPicker) d2.findViewById(R.id.numberPicker2);
        np2.setMaxValue(100); // max value 100
        np2.setMinValue(30);   // min value 30
        np2.setWrapSelectorWheel(false);
        np2.setOnValueChangedListener(this);
        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                wk3.setText(String.valueOf(np2.getValue())+"%"); //set the value to textview
                d2.dismiss();
            }
        });
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                d2.dismiss(); // dismiss the dialog
            }
        });
        d2.show();
    }

    public void show4()
    {
        final Dialog d2 = new Dialog(PlantMonitor.this);
        d2.setTitle("Moisture Percentage");
        d2.setContentView(R.layout.dialog2);
        Button b3 = (Button) d2.findViewById(R.id.button3);
        Button b4 = (Button) d2.findViewById(R.id.button4);
        final NumberPicker np2 = (NumberPicker) d2.findViewById(R.id.numberPicker2);
        np2.setMaxValue(100); // max value 100
        np2.setMinValue(30);   // min value 30
        np2.setWrapSelectorWheel(false);
        np2.setOnValueChangedListener(this);
        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                wk4.setText(String.valueOf(np2.getValue())+"%"); //set the value to textview
                d2.dismiss();
            }
        });
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                d2.dismiss(); // dismiss the dialog
            }
        });
        d2.show();
    }
    public void show5()
    {
        final Dialog d2 = new Dialog(PlantMonitor.this);
        d2.setTitle("Moisture Percentage");
        d2.setContentView(R.layout.dialog2);
        Button b3 = (Button) d2.findViewById(R.id.button3);
        Button b4 = (Button) d2.findViewById(R.id.button4);
        final NumberPicker np2 = (NumberPicker) d2.findViewById(R.id.numberPicker2);
        np2.setMaxValue(100); // max value 100
        np2.setMinValue(30);   // min value 30
        np2.setWrapSelectorWheel(false);
        np2.setOnValueChangedListener(this);
        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                wk5.setText(String.valueOf(np2.getValue())+"%"); //set the value to textview
                d2.dismiss();
            }
        });
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                d2.dismiss(); // dismiss the dialog
            }
        });
        d2.show();
    }
}