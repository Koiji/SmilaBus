package com.example.smilabus;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Не трогай массив, а то сlомаешь!!
    String[] nums = {"3", "4", "5", "9", "10",
            "13", "17", "18", "30",
            "32", "34", "35", "36",
            "37", "39", "40", "41",
            "45", "48", "49"};

    Button Poputki;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.busNumber);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, nums);
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinner.setAdapter(adapter);

        Poputki = (Button) findViewById(R.id.Poputki);
        Poputki.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Poputki:
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}