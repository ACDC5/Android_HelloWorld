package com.example.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ButtonActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;

    //重写来自父类的方法即加载指定布局页面的所有内容
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button);

        //这里同样可以实现按钮点击事件，不用在按钮中设置onclick属性，下面的showToast方法则来自布局文件属性
        button = findViewById(R.id.butt_7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //这里的this已经不指代当前的类，可能是父类的this，所以需要写成ButtonActivity.this
                Toast.makeText(ButtonActivity.this,"按钮7被点击了",Toast.LENGTH_SHORT).show();
            }
        });

        textView = findViewById(R.id.text_1);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this,"文本控件text_1被点击了",Toast.LENGTH_SHORT).show();
            }
        });

    }

    //(按钮的onclick写法2)方法名需和在xml种定义的onClick事件名称一致
    public void showToast(View view) {
        //按钮点击后出现渐隐的提示信息
        //根据debug代码调用顺序为从左到右
        Toast.makeText(this,"按钮8被点击了",Toast.LENGTH_SHORT).show();
    }
}
