package com.example.mysecondapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_reminder extends Activity {
Button homebtn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);

        homebtn1 = findViewById(R.id.btnhome1);
        homebtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_reminder.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
