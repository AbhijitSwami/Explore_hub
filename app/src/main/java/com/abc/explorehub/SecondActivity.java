package com.abc.explorehub;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }


    public void COMPUTER_ENGINEERING(View view) {
        Intent intent = new Intent(this, Third_Activity.class);
        startActivity(intent);
    }

    public void MECHANICAL_ENGINEERING(View view) {
        Intent intent = new Intent(this, MechActivity.class);
        startActivity(intent);
    }

    public void ENTC_ENGINEERING(View view) {
        Intent intent = new Intent(this, EntcActivity.class);
        startActivity(intent);
    }

    public void CIVIL_ENGINEERING(View view) {
        Intent intent = new Intent(this, CivilActivity.class);
        startActivity(intent);
    }

    public void FIRST_YEAR(View view) {
        Intent intent = new Intent(this, firstyear.class);
        startActivity(intent);
    }
}

