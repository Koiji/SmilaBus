package com.example.smilabus;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class SelectActivity extends AppCompatActivity implements OnClickListener {


    Button bus30;
    Button bus32;
    Button bus17;
    Button bus40;
    Button bus141;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        bus30 = (Button) findViewById(R.id.button30);
        bus30.setOnClickListener(this);
        bus32 = (Button) findViewById(R.id.button32);
        bus32.setOnClickListener(this);
        bus17 = (Button) findViewById(R.id.button17);
        bus17.setOnClickListener(this);
        bus40 = (Button) findViewById(R.id.button40);
        bus40.setOnClickListener(this);
        bus141 = (Button) findViewById(R.id.button141);
        bus141.setOnClickListener(this);
    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button30:
                Intent intent0 = new Intent(this, BusesActivity.class);
                startActivity(intent0);
                break;
            case R.id.button40:
                Intent intent1 = new Intent(this, BusesActivity.class);
                startActivity(intent1);
                break;
            case R.id.button32:
                Intent intent2 = new Intent(this, BusesActivity.class);
                startActivity(intent2);
                break;
            case R.id.button17:
                Intent intent3 = new Intent(this, BusesActivity.class);
                startActivity(intent3);
                break;
            case R.id.button141:
                Intent intent4 = new Intent(this, BusesActivity.class);
                startActivity(intent4);
                break;
            default:
                break;
        }
    }
}