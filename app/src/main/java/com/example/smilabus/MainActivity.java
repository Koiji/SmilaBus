package com.example.smilabus;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button Select;
    Button Poputki;
    Button Settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Poputki = (Button) findViewById(R.id.Poputki);
        Poputki.setOnClickListener(this);

        Select = (Button) findViewById(R.id.Select);
        Select.setOnClickListener(this);

        Settings = (Button) findViewById(R.id.Settings);
        Settings.setOnClickListener(this);

    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Poputki:
                Intent intent1 = new Intent(this, SecondActivity.class);
                startActivity(intent1);
                break;
            case R.id.Select:
                Intent intent2 = new Intent(this, SelectActivity.class);
                startActivity(intent2);
                break;
            case R.id.Settings:
                Intent intent3 = new Intent(this, SettingsActivity.class);
                startActivity(intent3);
                break;
            default:
                break;
        }
    }
}