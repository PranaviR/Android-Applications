package com.example.prana.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View


class MainActivity : AppCompatActivity() {

    public void clickFunction(View view){
    Log.i("Info:","Pressed");
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
