package com.abc.explorehub;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MechActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mech);
    }
    public void QUESTIONS_PAPER(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/u/0/folders/1pOwdhcLGOR0eUwc5LV4zZQGCVVEuWQHU"));
        startActivity(intent);
    }
    public void EXPLORE(View view){
        Intent intent=new Intent(this,Excomp1.class);
        startActivity(intent);
    }

}
