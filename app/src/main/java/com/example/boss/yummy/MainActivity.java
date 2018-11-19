package com.example.boss.yummy;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void openAroundme(View v){
        Intent itn = new Intent(this,GoogleMapsActivity.class);
        startActivity(itn);
    }
    public void openEmergencyCall(View view){
        String number = "0874958929";
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + number));

        startActivity(intent);
    }
    public void openRecommend (View v){
        Intent itn = new Intent(this,Recommend.class);
        startActivity(itn);
    }
    public void openWeather (View v){
        Intent itn = new Intent(this,Weather1.class);
        startActivity(itn);
    }
}
