package com.example.smartdoctor;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DoctorRegister extends AppCompatActivity {
    TextView doctorLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_register);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        doctorLogin=findViewById(R.id.doctorLogin);
        doctorLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doctorIntent=new Intent(getApplicationContext(),DoctorLogin.class);
                startActivity(doctorIntent);
            }
        });
    }
}