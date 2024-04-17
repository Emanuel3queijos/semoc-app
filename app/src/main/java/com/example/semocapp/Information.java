package com.example.semocapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_informacoes);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.information);


//fazer pergunta pro professor do por que  que esse cara so funciona usando o android.nonFinalResIds=false no gradle properties
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.information:
                    return true;
                case R.id.bottom_calendar:
                    startActivity(new Intent(getApplicationContext(), Programmation.class));
                    overridePendingTransition(R.anim.right, R.anim.left);

                    finish();
                    return true;
                case R.id.assigment:
                    startActivity(new Intent(getApplicationContext(), Inscriptions.class));
                    overridePendingTransition(R.anim.right, R.anim.left);
                    finish();
                    return true;
                case R.id.bottom_programacao:
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    overridePendingTransition(R.anim.right, R.anim.left);

                    finish();
                    return true;
            }
            return false;
        });

    }
}