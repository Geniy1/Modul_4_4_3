package com.example.parcable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.parcable.cls.User;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setTextSize(26);
        textView.setPadding(16, 16, 16, 16);

        Bundle arguments = getIntent().getExtras();

        User user;
        if(arguments!=null){
            user = arguments.getParcelable(User.class.getSimpleName());

            textView.setText("Name: " + user.getName() + "\nAge: " + String.valueOf(user.getAge()));
        }
        setContentView(textView);
    }
}