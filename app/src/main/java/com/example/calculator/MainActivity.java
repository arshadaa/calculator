package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
     Button b1,b2,b3,b4;
     TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Now we assign a memory for those.
        //We have editText in java to EditText in xml
        et1 = (EditText)findViewById(R.id.n1);
        et2 = (EditText) findViewById(R.id.n2);
        b1 = (Button) findViewById(R.id.btnAdd);
        b2 = (Button) findViewById(R.id.btnMultiplication);
        b3 = (Button) findViewById(R.id.btnDivison);
        b4 = (Button) findViewById(R.id.btSubstraction);
        tv = (TextView) findViewById(R.id.tvAns);

        // OnClickListener is an interface so, that we have to create an object for this.
    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int i = Integer.parseInt(et1.getText().toString());
            int j = Integer.parseInt(et2.getText().toString());

            int k = i + j;
            tv.setText("Ans is : " + k);


        }
    }) ;
    b2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int i = Integer.parseInt(et1.getText().toString());
            int j = Integer.parseInt(et2.getText().toString());
            int k = i * j ;
            tv.setText("Ans is : "+ k);
        }
    });

    b3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            float i = Float.parseFloat(et1.getText().toString());
            float j = Float.parseFloat(et2.getText().toString());

            if( (i > 0 || i < 0) & j == 0)
            {
                tv.setText("Can not divide by zero");
            }
            else
            {
                float k = i / j;
                tv.setText("Ans is : "+ k);
            }


        }
    });

    b4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int i = Integer.parseInt(et1.getText().toString());
            int j = Integer.parseInt(et2.getText().toString());
            int k = i - j ;
            tv.setText("Ans is : "+ k);
        }
    });
    }

    /* public void add(View v)
    {
        int i = Integer.parseInt(et1.getText().toString());
        int j = Integer.parseInt(et2.getText().toString());

        int k = i + j;
        tv.setText("Ans is : " + k);


    }*/
}
