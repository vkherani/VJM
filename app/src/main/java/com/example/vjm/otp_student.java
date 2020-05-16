package com.example.vjm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class otp_student extends AppCompatActivity {

    Button verifyOtpBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_student);
        verifyOtpBtn = findViewById(R.id.verifyOtpBtn);
        verifyOtpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getApplicationContext(),student_pass.class);
                startActivity(i);
                finish();
            }
        });

    }
}
