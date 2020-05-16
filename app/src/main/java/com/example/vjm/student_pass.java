package com.example.vjm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class student_pass extends AppCompatActivity {

    Button signupFinal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_pass);


        signupFinal = findViewById(R.id.signupFinal);

        signupFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), homepage_student.class);
                startActivity(i);
                finish();
            }
        });
    }
}
