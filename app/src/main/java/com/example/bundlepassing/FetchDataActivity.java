package com.example.bundlepassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FetchDataActivity extends AppCompatActivity {
    TextView textInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetch_data);
        textInfo=findViewById(R.id.textview);

        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        String email=intent.getStringExtra("email");
        String phone=intent.getStringExtra("mobile");



        textInfo.setText("The student name is :" +name +"\n\n"+"The email id is :"+ email+"\n\n"+"The phone number :"+phone);

    }
}