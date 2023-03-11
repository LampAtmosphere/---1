package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = "StartActivity";
    private Integer counter = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter", counter);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("counter")) {
            counter = savedInstanceState.getInt("counter");
        }
        ((TextView) findViewById(R.id.txt_counter)).setText(counter.toString());

    }

    public void onClickBtn(View view) {
        counter = counter + 1000;
        TextView counterView = findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
    }}

