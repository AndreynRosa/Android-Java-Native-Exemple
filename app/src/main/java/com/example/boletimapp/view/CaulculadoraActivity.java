package com.example.boletimapp.view;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.boletimapp.R;
import com.example.boletimapp.view.controller.CalculadoraController;
import com.example.boletimapp.view.controller.MainController;

public class  CaulculadoraActivity extends AppCompatActivity {

    private CalculadoraController controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_main);
        controller = new CalculadoraController(this);
    }
    
    public void calcular(View v){
        controller.calcularAction();
    }

}