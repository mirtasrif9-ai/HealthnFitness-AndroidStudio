package com.example.healthfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class BMR extends AppCompatActivity {

    Spinner spbmr;
    EditText w;
    EditText h;
    EditText a;
    Button button;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmr);

        text = findViewById(R.id.textView3);
        w= findViewById(R.id.w);
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
                double x = Double.parseDouble(w.getText().toString());
                double y = Double.parseDouble(h.getText().toString());
                double z = Double.parseDouble(a.getText().toString());
                double bmr;
                if (spbmr.getSelectedItem().toString() == "Male") {
                    bmr = 10*x+6.25*y*2.54-5*z+5;
                    text.setText(String.format("YOUR BMR : %.2f Calories/day",bmr ));
                }

                else if (spbmr.getSelectedItem().toString() == "Female") {
                    bmr =  10*x+6.25*y*2.54-5*z-161;
                    text.setText(String.format("YOUR BMR : %.2f Calories/day",bmr ));
                }
            }
        });
    }
}