package com.example.prana.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int num;
    public void clickMe(View view){
        EditText editText=(EditText)findViewById(R.id.Guess);
        int guess=Integer.parseInt(editText.getText().toString());
        if(guess>num)
            Toast.makeText(this, "Lower!", Toast.LENGTH_SHORT).show();
        else if(guess<num)
            Toast.makeText(this, "Higher!", Toast.LENGTH_SHORT).show();
        else if(guess==num) {
            Toast.makeText(this, "That's right", Toast.LENGTH_SHORT).show();
            Random random = new Random();
            num = random.nextInt(20) + 1;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random=new Random();
        num=random.nextInt(20)+1;
    }
}
