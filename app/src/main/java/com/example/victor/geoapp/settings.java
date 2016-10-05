package com.example.victor.geoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    //metod för att ta oss tillbaka till main
    public void actbacksettings (View view){
        // intent för att anropa aktivitet
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
