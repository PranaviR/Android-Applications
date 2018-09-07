package com.example.prana.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void click(View view){
    EditText editText=(EditText)findViewById(R.id.currency);
    Double c = Double.parseDouble(editText.getText().toString()) * 0.75;
    Toast.makeText(this, String.format("%0.2f",c), Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

