package com.example.semocapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Programmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_programacao);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.bottom_programacao);


//fazer pergunta pro professor do por que  que esse cara so funciona usando o android.nonFinalResIds=false no gradle properties
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.bottom_programacao:
                    return true;
                case R.id.assigment:
                    startActivity(new Intent(getApplicationContext(), Assigments.class));

                    finish();
                    return true;
                case R.id.profile:
                    startActivity(new Intent(getApplicationContext(), Profile.class));

                    finish();
                    return true;
            }
            return false;
        });

    }
}