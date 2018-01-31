package com.example.cyrinehammmi.gps;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;

import android.location.LocationManager;

import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
        static final int REQUEST_LOCATION = 1;
        LocationManager locationManager;
        GPSTracker mGPS;
        TextView text;
        Button start;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            mGPS = new GPSTracker(this);

            text = findViewById(R.id.loc);
            start= findViewById(R.id.btnStart);
            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onStartButtonClick();
                }
            });

        }

        public void onStartButtonClick()
        {
            if(mGPS.canGetLocation ){
                mGPS.getLocation();
                text.setText("Lat"+mGPS.getLatitude()+"Lon"+mGPS.getLongitude());
            }else{
                text.setText("Unabletofind");
                System.out.println("Unable");
            }
        }


    }
