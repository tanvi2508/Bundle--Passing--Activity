package com.example.bundlepassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText username,mail,contact;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.name);
        mail=findViewById(R.id.email);
        contact=findViewById(R.id.mobile);
        save=findViewById(R.id.save);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=username.getText().toString();
                String Email=mail.getText().toString();
                String mobile=contact.getText().toString();

                // Creating the intent
                Intent intent=new Intent(MainActivity.this,FetchDataActivity.class);

                // set the data
                intent.putExtra("name",name);
                intent.putExtra("email",Email);
                intent.putExtra("mobile",mobile);

                //start the intent
                startActivity(intent);
            }
        });
    }
}