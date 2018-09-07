package com.example.prana.myjavaapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void ClickFunction(View view)
    {
        EditText myUsername=(EditText) findViewById(R.id.Username);
        Toast.makeText(this, myUsername.getText().toString(), Toast.LENGTH_SHORT).show();
        EditText myPassword=(EditText) findViewById(R.id.Password);
        Toast.makeText(this, myPassword.getText().toString(), Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
