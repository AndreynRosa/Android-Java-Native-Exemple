package com.example.boletimapp.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.boletimapp.R;
import com.example.boletimapp.view.controller.MainController;

public class MainActivity extends AppCompatActivity {

    private MainController controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controller = new MainController(this);
    }

    public void proximo(View view) {
        controller.proximoAction();

    }
}
