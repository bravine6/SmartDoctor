package com.example.smartdoctor;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PatientRegister extends AppCompatActivity {
    TextView patientLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_register);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        patientLogin=findViewById(R.id.patientLogin);
        patientLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent patientIntent=new Intent(getApplicationContext(),PatientLogin.class);
                startActivity(patientIntent);
            }
        });
    }
}