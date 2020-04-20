package com.abc.explorehub;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Excomp1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excomp1);
    }
    public void LIST_OF_REFERENCE_BOOKS(View view){
        Intent intent=new Intent(this,BookMain.class);
        startActivity(intent);
    }
    public void EXPLORE(View view){
        Intent intent=new Intent(this,Excomp1.class);
        startActivity(intent);
    }



}
