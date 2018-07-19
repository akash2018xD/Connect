package com.example.akash.feedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PassChange extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_change);
    }
    public void changePass(View view){
        Toast.makeText(getBaseContext(),"Your Password Has Been Sent To Your Registered Mail ID",Toast.LENGTH_LONG).show();
        Intent obj2 = new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(obj2);
        finish();
    }
}
