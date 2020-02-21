package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckBox extends AppCompatActivity {

    private android.widget.CheckBox checkFive; //因和当前自定义的类同名，默认使用全局包名
    private android.widget.CheckBox checkSex;//继承自com..button/button/textView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_box);

        checkFive = findViewById(R.id.check_box_5);
        checkFive.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //参数1当前页面,参数2提示信息,参数3提示信息展示时间的长短(可自定义),show()执行显示时间
                Toast.makeText(CheckBox.this,isChecked?"选中check5":"check5未选中",Toast.LENGTH_SHORT).show();
            }
        });

        checkSex = findViewById(R.id.check_box_6);
        checkSex.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(CheckBox.this,isChecked?"选中check6":"check6未选中",Toast.LENGTH_LONG).show();
            }
        });

    }
}
