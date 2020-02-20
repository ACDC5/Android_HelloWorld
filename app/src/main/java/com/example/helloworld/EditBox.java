package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditBox extends AppCompatActivity {

    private Button login;
    private EditText checkUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_box);

        //获取控件id
        login = findViewById(R.id.butt_login);
        //点击触发(监听事件)
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EditBox.this,"登录成功",Toast.LENGTH_SHORT).show();
            }
        });

        checkUserName = findViewById(R.id.user_edit);
        checkUserName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Toast.makeText(EditBox.this,"格式正确",Toast.LENGTH_SHORT).show();
                Log.d("editText",s.toString());

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
