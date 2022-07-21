package com.example.mysis;

import android.content.Intent;
import android.os.Bundle;

import android.view.MenuItem;
import android.widget.GridView;

import androidx.appcompat.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;


public class MainActivity2 extends AppCompatActivity {
NavigationView navigationView;
DrawerLayout drawerLayout;
Toolbar toolbar;

    ArrayList<GridViewPojo> arrayList;
    GridView gridView;
    AdapterGridView adapterGridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //grid view
        gridView = findViewById(R.id.grid_list);
        gridItemShow();
        adapterGridView = new AdapterGridView(this, arrayList);
        gridView.setAdapter(adapterGridView);


// toolbar
        toolbar=(Toolbar) findViewById(R.id.toolbars);
        toolbar.setTitle("SMART IRRIGATION SYSTEM");
        setSupportActionBar(toolbar);

// navigation drawer
        drawerLayout=findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle actionBarDrawerToggle=new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        navigationView=findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(this::onNavigationItemSelected);
    }

    private void gridItemShow() {
        arrayList = new ArrayList<GridViewPojo>();

        arrayList.add(new  GridViewPojo(R.drawable.ic_baseline_eco_24, "Plant Monitor"));
        arrayList.add(new  GridViewPojo(R.drawable.ic_baseline_egg_24, "Irrigation"));
        arrayList.add(new  GridViewPojo(R.drawable.ic_baseline_bluetooth_24, "Bluetooth"));
        arrayList.add(new  GridViewPojo(R.drawable.ic_baseline_settings_applications_24, "Plant settings"));
        arrayList.add(new  GridViewPojo(R.drawable.ic_baseline_gradient_24, "Moisture levels"));
        arrayList.add(new  GridViewPojo(R.drawable.ic_rate_star, "Rate app"));
        arrayList.add(new  GridViewPojo(R.drawable.settings_ic, "App Settings"));
    }


    public boolean onNavigationItemSelected(@NonNull MenuItem item){

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
            case R.id.bluetooth:
                startActivity(new Intent(this, bluetooth.class));
                return true;
            case R.id.ratings:
                startActivity(new Intent(this, rateapp.class));
                return true;

        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}