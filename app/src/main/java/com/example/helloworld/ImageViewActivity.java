package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView Iv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        //从网络获取图片到控件
        Iv4 = findViewById(R.id.image_view_4);
        Glide.with(this).load("https://static.oschina.net/uploads/space/2016/1214/143430_DHyz_2903254.jpg").into(Iv4);

    }
}
