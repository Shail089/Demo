package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void testFuntion(){
        int i=10;
        int j=40;
        int k=i+j;
    }

    public void newMethod(){
        int a=2;
        String test="Complex Merging ";
        String test2="compare on github";
    }
}
