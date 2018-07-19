package com.example.akash.feedback;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread obj = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(1000); //setting splash screen time in millisecs
                        Intent obj2 = new Intent(getApplicationContext(),LoginActivity.class);
                        startActivity(obj2);
                        finish();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        obj.start();
    }
}
