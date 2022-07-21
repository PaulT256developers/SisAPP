package com.example.mysis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import java.text.DateFormat;

import java.util.Calendar;

public class Plant_settings extends AppCompatActivity implements AdapterView.OnItemSelectedListener, DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener  {
    String[] list ={"BEANS", "RICE", "PEAS"};

    EditText editText1;
    EditText editText2;
    DatePickerDialog datePickerDialog;
    DatePickerDialog.OnDateSetListener onDateSetListener;
    TimePickerDialog timePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_settings);

        //spinner
        Spinner spinner = (Spinner) findViewById(R.id.plantspinner);
        spinner.setOnItemSelectedListener(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


/*
        // timepicker

        editText2= (EditText) findViewById(R.id.timepickerdialog1);
        editText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar= Calendar.getInstance();
                int hour = calendar.get(Calendar.HOUR_OF_DAY);
                int min = calendar.get(Calendar.MINUTE);

                timePickerDialog = new TimePickerDialog(getApplicationContext(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker View, int hourDay, int minute) {
                        editText2.setText(hourDay+":"+minute);
                    }
                },hour, min, true);
                timePickerDialog.setTitle("IRRIGATION TIME");
                timePickerDialog.show();
            }
        });*/


        editText1 = findViewById(R.id.datepickerdialog1);
        editText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.example.mysis.DatePicker mDatePickerDialogFragment;
                mDatePickerDialogFragment = new com.example.mysis.DatePicker();
                mDatePickerDialogFragment.show(getSupportFragmentManager(), "DATE PICK");
            }
        });

        editText2= (EditText) findViewById(R.id.timepickerdialog1);
        editText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment timePickerDialog =new com.example.mysis.TimePickerFragment();
                timePickerDialog.show(getSupportFragmentManager(),"time picker");
            }
        });


    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(),list[position], Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {

    }

    @Override
    public void onDateSet(DatePicker  view, int year, int month, int dayOfMonth) {
        Calendar mCalendar = Calendar.getInstance();
        mCalendar.set(Calendar.YEAR, year);
        mCalendar.set(Calendar.MONTH, month);
        mCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        String selectedDate = DateFormat.getDateInstance(DateFormat.FULL).format(mCalendar.getTime());
        editText1.setText(selectedDate);
    }

    @Override
    public void onTimeSet(TimePicker timePicker, int intHourOfDay, int intMinute) {

        TextView textViewPicked=(TextView) findViewById(R.id.timepickerdialog1);
        textViewPicked.setText(("Time set= " + intHourOfDay + ":" + intMinute ));
    }
}