package com.example.catchtheelephant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void start(View view){

        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }
}