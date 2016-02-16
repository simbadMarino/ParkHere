package com.example.simbad.park_here;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.gms.plus.internal.model.people.PersonEntity;

public class startActivityMain extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_activity_main);

        ImageButton btnLogin = (ImageButton)findViewById(R.id.imgBtnSignIn);
        btnLogin.setOnClickListener(this);

        ImageButton btnRegister = (ImageButton)findViewById(R.id.imgBtnReg);
        btnLogin.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        switch(v.getId())
        {
            case        R.id.imgBtnSignIn: startActivity(new Intent(this, LoginActivity.class));
                        break;

            default:   // R.id.imgBtnReg:    //Start Registration activit
                        break;
        }

    }
}
