package com.example.semocapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ImageView imageView1 = findViewById(R.id.image_view_mesa_redonda);
        ImageView imageView2 = findViewById(R.id.image_view_seminarios);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MesaRedonda.class));
                finish();


            }
        });


        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Seminarios.class));
                finish();


            }
        });


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
                case R.id.informations:
                    startActivity(new Intent(getApplicationContext(), Information.class));

                    finish();
                    return true;
            }
            return false;
        });

    }
}