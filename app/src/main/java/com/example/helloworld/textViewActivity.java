package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

public class textViewActivity extends AppCompatActivity {

    private TextView tv_5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        tv_5 = findViewById(R.id.tv_5);
        tv_5.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG); //设置下划线
        tv_5.getPaint().setAntiAlias(true); //去除锯齿
    }
}
