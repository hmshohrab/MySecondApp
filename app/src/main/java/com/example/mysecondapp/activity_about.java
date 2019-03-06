package com.example.mysecondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_about extends AppCompatActivity {
Button homebtn ;
Button reminderbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        homebtn = findViewById(R.id.btnhome);
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_about.this,MainActivity.class);
                startActivity(intent);
            }
        });
reminderbtn = findViewById(R.id.btnreminder);
        reminderbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(activity_about.this,activity_reminder.class);
                startActivity(intent1);
            }
        });

    }
}
