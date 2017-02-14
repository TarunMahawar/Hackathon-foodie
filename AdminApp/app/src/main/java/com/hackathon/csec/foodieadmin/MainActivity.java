package com.hackathon.csec.foodieadmin;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button addRest, admin, editRest, deleteRest, editMenu;
    TextView statusRest, nameRest;
    ImageView imageRest;

    LinearLayout layoutOldUser, layoutNewUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutOldUser = (LinearLayout) findViewById(R.id.layoutOldUser);
        layoutNewUser = (LinearLayout) findViewById(R.id.layoutNewUser);

        imageRest = (ImageView) findViewById(R.id.imageRest);

        statusRest = (TextView) findViewById(R.id.statusRest);
        nameRest = (TextView) findViewById(R.id.nameRest);

        addRest = (Button) findViewById(R.id.addRes);
        admin = (Button) findViewById(R.id.admin);
        editRest = (Button) findViewById(R.id.editRest);
        deleteRest = (Button) findViewById(R.id.deleteRest);
        editMenu = (Button) findViewById(R.id.editMenu);

        addRest.setOnClickListener(this);
        admin.setOnClickListener(this);
        editRest.setOnClickListener(this);
        deleteRest.setOnClickListener(this);
        editMenu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.addRes:

                break;


            case R.id.admin:

                break;


            case R.id.editRest:

                break;


            case R.id.deleteRest:

                break;


            case R.id.editMenu:

                break;
        }
    }
}
