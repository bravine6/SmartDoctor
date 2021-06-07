package com.example.smartdoctor;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DoctorLogin extends AppCompatActivity {
    TextView DoctorRegister;
    Button LoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_login);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        DoctorRegister=findViewById(R.id.doctorRegister);
        LoginButton=findViewById(R.id.loginDoctor);
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doctorIntent=new Intent(getApplicationContext(),DoctorHome.class);
                startActivity(doctorIntent);
            }
        });

        DoctorRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doctorRegister= new Intent(getApplicationContext(), com.example.smartdoctor.DoctorRegister.class);
                startActivity(doctorRegister);
            }
        });


    }
}