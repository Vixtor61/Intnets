package com.dondyprax.labo_03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.dondyprax.labo_03.utils.AppConstants;

public class MainActivity extends AppCompatActivity {
    private Button mButton, mButtonShare;
    private static final String TAG=MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonShare=findViewById(R.id.btn_share);
        mButton =findViewById(R.id.btn_send);

        mButton.setOnClickListener(v->{
            Intent mIntent = new Intent(MainActivity.this,Main2Activity.class);
            mIntent.putExtra(AppConstants.TEXT_KEY,"Hola, Main2Activity. oijufikjujsdsuihhihhhhoytahhdsafoutaputahjhdsafputashdfhjfkshputajhsjdhfjsdhputahdfjhsdputadsgfhjhkd");
            startActivity(mIntent);

        });

        mButtonShare.setOnClickListener(v->{
            Intent mIntent=new Intent();
            mIntent.setAction(Intent.ACTION_SEND);
            mIntent.setType("text/plain");
            mIntent.putExtra(Intent.EXTRA_TEXT,"holoholaholaholaholaolhahola");
            startActivity(mIntent);

        });
    }

}
