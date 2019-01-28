package com.example.binarycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private String number = "";
    private String placeholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view){
        if (view.getId()==R.id.One_Button){
            placeholder = "1";
            number = number + placeholder;
        } else if (view.getId()==R.id.Zero_Button){
            placeholder = "0";
            number = number + placeholder;
        } else if (view.getId()==R.id.Reset_Button){
            number = "0";
        } else {
            throw new RuntimeException("Unknown Input");
        }

        updateView();

    }

    private void updateView(){

       int decimal = Integer.parseInt(number,2);


        TextView display = findViewById(R.id.display);
        display.setText(""+decimal);
    }


}
