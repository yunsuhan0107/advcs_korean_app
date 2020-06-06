package com.example.android.koreanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView number, color, food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = (TextView) findViewById(R.id.numbers);
        color = (TextView) findViewById(R.id.colors);
        food = (TextView) findViewById(R.id.foods);

        number.setOnClickListener(this);
        color.setOnClickListener(this);
        food.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.numbers : i = new Intent(this, ColorsActivity.class); startActivity(i); break;
            case R.id.colors : i = new Intent(this, NumbersActivity.class); startActivity(i); break;
            case R.id.foods : i = new Intent(this, FoodsActivity.class); startActivity(i); break;
            default: break;
        }
    }
}