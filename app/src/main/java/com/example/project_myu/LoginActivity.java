package com.example.project_myu;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    TextView signbtn;

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // 회원가입 버튼
        signbtn =findViewById(R.id.reg_button);

        // 회원가입 버튼 클릭시 -> 회원가입 페이지로 이동
        signbtn.setOnClickListener(v -> {
            Intent intent = new Intent(this.signbtn.class);
            startActivity(intent);
        });
    }
}