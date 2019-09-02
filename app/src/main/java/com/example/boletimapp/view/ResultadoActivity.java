package com.example.boletimapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.boletimapp.R;
import com.example.boletimapp.view.controller.ResultadoController;

public class ResultadoActivity extends AppCompatActivity {

    private ResultadoController controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        controller = new ResultadoController(this);
    }


}
