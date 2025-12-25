package com.example.healthfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
public class bgbutton extends AppCompatActivity {
    String buttonvalue;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bgbutton);



        Intent intent = getIntent();
        buttonvalue = intent.getStringExtra("value");

        int intvalue = Integer.valueOf(buttonvalue);

        switch (intvalue){
            case 1:
                setContentView(R.layout.activity_body_building);
                break;

            case 2:
                setContentView(R.layout.activity_weight_loss);
                break;
            case 3:
                setContentView(R.layout.activity_weight_gain);
                break;
            case 4:
                setContentView(R.layout.activity_step_count);
                break;
            case 5:
                setContentView(R.layout.activity_bmi);
                break;
            case 6:
                setContentView(R.layout.activity_bmr);
                break;
            case 7:
                setContentView(R.layout.activity_calorie);
                break;
            case 8:
                setContentView(R.layout.activity_calorie_burn);
                break;
            case 9:
                setContentView(R.layout.activity_protein);
                break;
            case 10:
                setContentView(R.layout.activity_alarm);
                break;
            case 11:
                setContentView(R.layout.activity_diet);
                break;
            case 12:
                setContentView(R.layout.activity_protein_of_food);
                break;

        }

    }


}