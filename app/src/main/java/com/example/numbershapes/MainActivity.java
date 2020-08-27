package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    public void testNumber(View view) {

        EditText numberToTest = findViewById(R.id.numberToTest);
        String sR = numberToTest.getText().toString();
        String message ="";

        if(sR.isEmpty())

        {
            message += "please write the number" ;
        }

        else{
        SquareOrTriangular squareOrTriangular = new SquareOrTriangular();
        int srInInteger =Integer.parseInt(sR);
        squareOrTriangular.number=srInInteger;

        if (squareOrTriangular.isItTriangular() && squareOrTriangular.isItSquare())

        {
            message += "Number is Triangular and square" ;
        }

        else if (squareOrTriangular.isItTriangular())

        {
            message += "Number is Triangular";

        }

        else if (squareOrTriangular.isItSquare())

        {
            message += "Number is Square" ;

        }

        }

        Toast.makeText(getApplicationContext(), message ,Toast.LENGTH_LONG).show();
        hideKeyboard();
    }

    void hideKeyboard(){

        ConstraintLayout mainLayout;
        mainLayout = (ConstraintLayout)findViewById(R.id.myConstraintLayout);
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(mainLayout.getWindowToken(), 0);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}