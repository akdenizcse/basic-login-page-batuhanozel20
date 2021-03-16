package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button but;
    AlertDialog.Builder builder;
    public void login(){
        Intent i= new Intent(this,MainActivity2.class);
        startActivity(i);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        builder = new AlertDialog.Builder(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but=(Button) findViewById(R.id.button3);
        but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                EditText username = (EditText)findViewById(R.id.editTextTextPersonName5);
                EditText password = (EditText)findViewById(R.id.editTextTextPersonName6);
                if(username.getText().toString().equals("bhaN") && password.getText().toString().equals("123")){

                    login();
                }else{
                    AlertDialog alert = builder.create();
                    alert.setTitle("Wrong Username or Password");
                    alert.show();
                }

            }
        });
    }

}