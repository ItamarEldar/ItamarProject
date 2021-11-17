package com.example.itamarproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ClassActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class);
        textView=findViewById(R.id.tv);
        textView.setText(getIntent().getStringExtra("TYPE"));
    }
}
