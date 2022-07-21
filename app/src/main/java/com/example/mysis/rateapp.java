package com.example.mysis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class rateapp extends AppCompatActivity {
RatingBar ratingBar;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rateapp);


        ratingBar=(RatingBar) findViewById(R.id.rating);
        button=(Button) findViewById(R.id.ratingbar_submit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Rating value: "+ ratingBar.getRating(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}