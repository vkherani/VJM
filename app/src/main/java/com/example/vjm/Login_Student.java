package com.example.vjm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login_Student extends AppCompatActivity {

    Button signupStudentBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__student);

        signupStudentBtn = findViewById(R.id.signupStudentBtn);
        signupStudentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),SignUp_student.class);
                startActivity(i);
            }
        });

    }
}
