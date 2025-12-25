package com.example.healthfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMI extends AppCompatActivity {
    EditText w;
    EditText h;
    Button button;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        text = findViewById(R.id.textView3);
        w= findViewById(R.id.w);
        h= findViewById(R.id.h);
        button = findViewById(R.id.buttonbmi);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(w.getText().toString());
                double b = Double.parseDouble(h.getText().toString());
                double bmi = a/((b*0.0254)*(b*0.0254));
                if(bmi>=30)
                    text.setText(String.format("YOUR BMI : %.2f - OBESITY",bmi ));

                else if(bmi>=25)
                    text.setText(String.format("YOUR BMI : %.2f - OVERWEIGHT",bmi ));
                else if(bmi>=18.5)
                    text.setText(String.format("YOUR BMI : %.2f - HEALTHY WEIGHT",bmi ));
                else
                    text.setText(String.format("YOUR BMI : %.2f - UNDERWEIGHT",bmi ));
            }
        });



}}