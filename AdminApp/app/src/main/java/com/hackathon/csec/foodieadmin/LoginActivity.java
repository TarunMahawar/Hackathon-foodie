package com.hackathon.csec.foodieadmin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.hackathon.csec.foodieadmin.Utilities.SharedPref;

public class LoginActivity extends AppCompatActivity {
private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final SharedPref sharedPref=new SharedPref(this);

        if(sharedPref.getLoginSkipStatus()||sharedPref.getLoginStatus()){
            startActivity(new Intent(LoginActivity.this,MainActivity.class));
            finish();
        }

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.content_login);
        imageView= (ImageView) findViewById(R.id.skipImage);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sharedPref.setLoginSkipStatus(true);
                startActivity(new Intent(LoginActivity.this,MainActivity.class));
                finish();
            }
        });
    }

}
