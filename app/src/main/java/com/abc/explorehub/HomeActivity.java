package com.abc.explorehub;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
      public void ENGINEERING(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

}