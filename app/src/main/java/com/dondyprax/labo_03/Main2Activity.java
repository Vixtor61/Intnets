package com.dondyprax.labo_03;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.dondyprax.labo_03.utils.AppConstants;

import java.io.Serializable;

public class Main2Activity extends AppCompatActivity {
    //Serializable
    //Parcelable
    //Bundle
    private TextView mText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mText=findViewById(R.id.tv_message);
        Intent mIntent = getIntent();
        if(mIntent!=null){
            mText.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY));
        }
    }
}
