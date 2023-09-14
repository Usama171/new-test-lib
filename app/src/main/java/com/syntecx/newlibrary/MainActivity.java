package com.syntecx.newlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.syntecx.new_test_lib.MyDemoClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyDemoClass.MyDemoWorld();

    }
}