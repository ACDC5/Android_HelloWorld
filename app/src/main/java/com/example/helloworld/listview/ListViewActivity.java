package com.example.helloworld.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.helloworld.R;

public class ListViewActivity extends Activity {

    private ListView lv_one; //最终父类View
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        lv_one = findViewById(R.id.lv_1);
        lv_one.setAdapter(new MyListAdapter(ListViewActivity.this));

        //用户点击事件。参数position为用户点击的item
        lv_one.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this,"Post:"+position,Toast.LENGTH_SHORT).show();
            }
        });


        //长按事件
        lv_one.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this,"长按pos:"+position,Toast.LENGTH_SHORT).show();
                return true;//true：当长按结束不再触发其他点击事件。即不会调用上面的点击事件
            }
        });
    }
}
