package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class textViewActivity extends AppCompatActivity {

    private TextView centerLine; //声明TextView对象
    private TextView belowLine;
    private TextView html;
    private  TextView roll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //对控件内容设置中划线
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view); //获取布局页面
        centerLine = findViewById(R.id.tv_5); //获取控件的id
        centerLine.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG); //对控件内容设置下划线
        centerLine.getPaint().setAntiAlias(true); //去除锯齿

        //对指定控件内容设置下划线
        belowLine = findViewById(R.id.tv_6);
        belowLine.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG); //设置下划线

        //以html的形式给控件追加内容
        html = findViewById(R.id.tv_7);
        html.setText(Html.fromHtml("<u>门泊东吴万里船</u>"));

        //文字跑马灯效果
        roll = findViewById(R.id.tv_8);
        roll.setSelected(true); //获取焦点
    }
}
