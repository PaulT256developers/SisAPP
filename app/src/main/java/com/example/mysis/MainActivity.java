package com.example.mysis;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button homebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homebtn =(Button) findViewById(R.id.homebtn);
        homebtn.setOnClickListener(MainActivity2);
    }
    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.my_menu, menu);
        return true;
    }
    View.OnClickListener MainActivity2 = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);


        }
    };



    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()){
            case R.id.measure:
                startActivity(new Intent(this, moisture.class));
                return true;
            case R.id.plantset:
             startActivity(new Intent(this, Plant_settings.class));
                return true;
            case R.id.plant:
               startActivity(new Intent(this, PlantMonitor.class));
                return true;
            case R.id.irrigate:
                startActivity(new Intent(this, Irrigation.class));
                return true;
            case R.id.appset:
                startActivity(new Intent(this, AppSettings.class));
                return true;

        }
        return true;
    }
}