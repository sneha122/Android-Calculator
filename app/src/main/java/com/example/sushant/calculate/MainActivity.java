package com.example.sushant.calculate;

import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)

    String number_on_button;
    public void getNumber(View view) {
        view.setId(R.id.common);
        Button num = (Button)findViewById(R.id.common);
        TextView displayNum = (TextView)findViewById(R.id.show);
        number_on_button =(String) displayNum.getText() + (String)num.getText();
        displayNum.setText(number_on_button);
        view.setId(R.id.alternate);
    }

    public void delNumber(View view) {
        TextView displayNum = (TextView)findViewById(R.id.show);
        displayNum.setText("");
    }


    public void displaySum(View view) {
        int num1,num2,result;
        TextView displayNum = (TextView)findViewById(R.id.show);
        String numbers[] = new String[2];
        if(number_on_button.contains("+"))
        {
            numbers = number_on_button.split("\\+",2);
            num1 = Integer.parseInt(numbers[0]);
            num2 = Integer.parseInt(numbers[1]);
            displayNum.setText(Integer.toString(num1+num2));
        }
        else if(number_on_button.contains("-"))
        {
            numbers = number_on_button.split("-",2);
            num1 = Integer.parseInt(numbers[0]);
            num2 = Integer.parseInt(numbers[1]);
            displayNum.setText(Integer.toString(num1-num2));
        }
        else if(number_on_button.contains("/"))
        {
            numbers = number_on_button.split("/",2);
            num1 = Integer.parseInt(numbers[0]);
            num2 = Integer.parseInt(numbers[1]);
            displayNum.setText(Float.toString((float)num1/num2));
        }
        else if(number_on_button.contains("*"))
        {
            numbers = number_on_button.split("\\*",2);
            num1 = Integer.parseInt(numbers[0]);
            num2 = Integer.parseInt(numbers[1]);
            displayNum.setText(Integer.toString(num1*num2));
        }
    }
}
