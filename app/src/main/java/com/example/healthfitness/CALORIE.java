package com.example.healthfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class CALORIE extends AppCompatActivity {

    Spinner spbmr, sp2;
    EditText w;
    EditText h;
    EditText a;
    Button button;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie);
        text = findViewById(R.id.textView3);
        w= findViewById(R.id.w);
        h= findViewById(R.id.h);
        a= findViewById(R.id.a);
        button = findViewById(R.id.buttoncal);
        spbmr = findViewById(R.id.spbmr);
        sp2 = findViewById(R.id.sp2);

        String[] gender = {"Male","Female"};
        ArrayAdapter ad = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, gender);
        spbmr.setAdapter(ad);

        String[] activity = {"Little or no exercise","Exercise 1-3 times/weak","Exercise 4-5 times/weak","Intense Exercise 3-4 times/weak","Intense Exercise 6-7 times/weak","Very Intense Exercise or Physical Job"};
        ArrayAdapter ad1 = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, activity);
        sp2.setAdapter(ad1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x = Double.parseDouble(w.getText().toString());
                double y = Double.parseDouble(h.getText().toString());
                double z = Double.parseDouble(a.getText().toString());
                double bmr,cal;
                if (spbmr.getSelectedItem().toString() == "Male" && sp2.getSelectedItem().toString() =="Little or no exercise" ) {
                    bmr = 10*x+6.25*y*2.54-5*z+5;
                    cal = bmr*1.1997;
                    text.setText(String.format("YOU NEED : %.2f Calories/day",cal ));
                }

                else if (spbmr.getSelectedItem().toString() == "Male" && sp2.getSelectedItem().toString() =="Exercise 1-3 times/weak" ) {
                    bmr = 10*x+6.25*y*2.54-5*z+5;
                    cal = bmr*1.3747;
                    text.setText(String.format("YOU NEED : %.2f Calories/day",cal ));
                }
                else if (spbmr.getSelectedItem().toString() == "Male" && sp2.getSelectedItem().toString() =="Exercise 4-5 times/weak" ) {
                    bmr = 10*x+6.25*y*2.54-5*z+5;
                    cal = bmr*1.4651;
                    text.setText(String.format("YOU NEED : %.2f Calories/day",cal ));
                }
                else if (spbmr.getSelectedItem().toString() == "Male" && sp2.getSelectedItem().toString() =="Intense Exercise 3-4 times/weak" ) {
                    bmr = 10*x+6.25*y*2.54-5*z+5;
                    cal = bmr*1.5497;
                    text.setText(String.format("YOU NEED : %.2f Calories/day",cal ));
                }
                else if (spbmr.getSelectedItem().toString() == "Male" && sp2.getSelectedItem().toString() =="Intense Exercise 6-7 times/weak") {
                    bmr = 10*x+6.25*y*2.54-5*z+5;
                    cal = bmr*1.7248;
                    text.setText(String.format("YOU NEED : %.2f Calories/day",cal ));
                }
                else if (spbmr.getSelectedItem().toString() == "Male" && sp2.getSelectedItem().toString() =="Very Intense Exercise or Physical Job") {
                    bmr = 10*x+6.25*y*2.54-5*z+5;
                    cal = bmr*1.8998;
                    text.setText(String.format("YOU NEED : %.2f Calories/day",cal ));
                }
                else if (spbmr.getSelectedItem().toString() == "Female" && sp2.getSelectedItem().toString() =="Little or no exercise" ) {
                    bmr =  10*x+6.25*y*2.54-5*z-161;
                    cal = bmr*1.1997;
                    text.setText(String.format("YOU NEED : %.2f Calories/day",cal ));
                }

                else if (spbmr.getSelectedItem().toString() == "Female" && sp2.getSelectedItem().toString() =="Exercise 1-3 times/weak" ) {
                    bmr =  10*x+6.25*y*2.54-5*z-161;
                    cal = bmr*1.3747;
                    text.setText(String.format("YOU NEED : %.2f Calories/day",cal ));
                }
                else if (spbmr.getSelectedItem().toString() == "Female" && sp2.getSelectedItem().toString() =="Exercise 4-5 times/weak" ) {
                    bmr =  10*x+6.25*y*2.54-5*z-161;
                    cal = bmr*1.4651;
                    text.setText(String.format("YOU NEED : %.2f Calories/day",cal ));
                }
                else if (spbmr.getSelectedItem().toString() == "Female" && sp2.getSelectedItem().toString() =="Intense Exercise 3-4 times/weak" ) {
                    bmr =  10*x+6.25*y*2.54-5*z-161;
                    cal = bmr*1.5497;
                    text.setText(String.format("YOU NEED : %.2f Calories/day",cal ));
                }
                else if (spbmr.getSelectedItem().toString() == "Female" && sp2.getSelectedItem().toString() =="Intense Exercise 6-7 times/weak") {
                    bmr =  10*x+6.25*y*2.54-5*z-161;
                    cal = bmr*1.7248;
                    text.setText(String.format("YOU NEED : %.2f Calories/day",cal ));
                }
                else if (spbmr.getSelectedItem().toString() == "Female" && sp2.getSelectedItem().toString() =="Very Intense Exercise or Physical Job") {
                    bmr =  10*x+6.25*y*2.54-5*z-161;
                    cal = bmr*1.8998;
                    text.setText(String.format("YOU NEED : %.2f Calories/day",cal ));
                }


            }
        });
    }
}