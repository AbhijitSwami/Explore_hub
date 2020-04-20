package com.abc.explorehub;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class EntcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entc);
    }
    public void QUESTIONS_PAPER(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/u/0/folders/1OEs4Zl7c12q5f2QTLg2Xlot27f0sTtDR"));
        startActivity(intent);
    }
    public void EXPLORE(View view){
        Intent intent=new Intent(this,Excomp1.class);
        startActivity(intent);
    }

}
