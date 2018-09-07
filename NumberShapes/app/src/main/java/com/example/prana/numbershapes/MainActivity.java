package com.example.prana.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
class Number {
    int number;

    public boolean isTriangular() {
        int curr = 0;
        int n = 0;
        while (curr < number) {
            curr += n;
            n++;
        }
        if (curr != number) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isSquare() {
        double sq;
        sq = Math.sqrt(number);
        if (sq == Math.floor(sq))
            return true;
        else
            return false;
    }
}

    public void clickFunction(View view) {
        EditText editText = (EditText) findViewById(R.id.in);
        Number myNum = new Number();
        String message="";
        if(editText.getText().toString().isEmpty())
            message="Enter a number,please!";
         else {
            myNum.number = Integer.parseInt(editText.getText().toString());
            if (myNum.isTriangular()) {
                if (myNum.isSquare())
                    message = myNum.number + " is triangular as well as square";
                else
                    message = myNum.number + " is triangular but not square";
            } else {
                if (myNum.isSquare())
                    message = myNum.number + " is square but not triangular";
                else
                    message = myNum.number + " is neither square not triangular";
            }
        }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
