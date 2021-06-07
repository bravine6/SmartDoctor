package com.example.smartdoctor;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PatientLogin extends AppCompatActivity {
   TextView PatientRegister;
   Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_login);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        PatientRegister=findViewById(R.id.patientRegister);
        Login=findViewById(R.id.loginPatient);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent patientIntent=new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(patientIntent);
            }
        });
        PatientRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent patientRegister=new Intent(getApplicationContext(), com.example.smartdoctor.PatientRegister.class);
                startActivity(patientRegister);
            }
        });
    }
}