package com.example.victor.geoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ProblemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem);
    }

    //metod för att ta oss tillbaka till main
    public void actback (View view){
        // intent för att anropa aktivitet
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }


}
