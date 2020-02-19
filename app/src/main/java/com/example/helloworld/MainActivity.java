package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * 每一个Activity对应一个页面的操作(页面中的任何动作),所以只能调用当前页面的事件id，如果调用别的页面的事件id会报空指针异常
 */
//实现逻辑,调用试图页面
public class MainActivity extends AppCompatActivity {

    private Button button_2,button_3;  //声明按钮对象
    private View view;  //声明布局对象
    private EditText edit_one;  //编辑框对象，和按钮对象一样，同样继承自textView,textView的父类为View

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载主页面
        setContentView(R.layout.activity_main); //每个Activity类里面所以的代码都是基于(setContentView方法设置的布局)这个页面进行操作的，当调用别的页面的id时，对应的动作会出现空指针

        //点击视图
        view = findViewById(R.id.ksjy);    //初始化控件,如果控件是按钮，则绑定的id不能是布局控件，否则应用无法启动
//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //TODO
//            }
//        });    //给控件添加监听事件。绑定控件的id后，当被组件点击触发时，执行重写的接口方法onClick

        //按钮事件
        button_2 = findViewById(R.id.btn_2); //点击此按钮后跳转到指定的页面
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //跳转到textView演示页面
//                Intent intent = new Intent(MainActivity.this,textViewActivity.class);//参数1，起始页；参数2，目标页(需确定页面已注册)
//                startActivity(intent);
//            }
//        });

        //按钮事件(将代码和展示页面当成一个整体，因为它们是相互作用的)
        button_3 = findViewById(R.id.btn_3);
//        button.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,ButtonActivity.class);
//                startActivity(intent);
//            }
//        });

        edit_one = findViewById(R.id.edit_1);

        setListener();
    }

    private void setListener(){
        OnClick click = new OnClick();
            view.setOnClickListener(click);
            button_2.setOnClickListener(click);
            button_3.setOnClickListener(click);
    }


    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch(v.getId()) { //判断用户点击的控件id是否为绑定了对应的监听
                case R.id.ksjy:
                    //根据上下文(参数一)跳转到对应的activity组件，以调用其中指定的布局
                     intent = new Intent(MainActivity.this,RelativeLayout_1.class);
                    break;
                case R.id.btn_2:
                    //MainActivity.this指的是MainActivity对象，textViewActivity.class使用反射机制得到textViewActivity类的所有信息，相当于new一个对象
                    intent = new Intent(MainActivity.this,textViewActivity.class);
                    break;
                case R.id.btn_3:
                    intent = new Intent(MainActivity.this,ButtonActivity.class);
                    break;
            }
            startActivity(intent);  //启动要打开的页面
        }
    }

}



