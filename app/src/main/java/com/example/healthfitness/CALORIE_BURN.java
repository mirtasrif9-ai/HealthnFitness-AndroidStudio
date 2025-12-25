package com.example.healthfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class CALORIE_BURN extends AppCompatActivity {


    Spinner spbmr;
    EditText h;
    EditText a;
    Button button;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_burn);
        text = findViewById(R.id.textView3);
        h= findViewById(R.id.h);
        a= findViewById(R.id.a);
        button = findViewById(R.id.buttonbmr);
        spbmr = findViewById(R.id.spbmr);


        String[] gender = {"Male","Female"};
        ArrayAdapter ad = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, gender);
        spbmr.setAdapter(ad);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double y = Double.parseDouble(h.getText().toString());
                double z = Double.parseDouble(a.getText().toString());
                double IDEAL;
                if (spbmr.getSelectedItem().toString() == "Male") {
                    IDEAL =22*(y*0.0254)*(y*0.0254);
                    text.setText(String.format("YOUR IDEAL WEIGHT : %.1f KG",IDEAL ));
                }

                else if (spbmr.getSelectedItem().toString() == "Female") {
                    IDEAL =22*((y*0.0254)-0.1)*((y*0.0254)-0.1);
                    text.setText(String.format("YOUR IDEAL WEIGHT : %.1f KG",IDEAL ));
                }
            }
        });
    }
}