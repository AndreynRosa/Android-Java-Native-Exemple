package com.example.boletimapp.view.controller;

import android.app.Activity;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

import com.example.boletimapp.R;
import com.example.boletimapp.view.model.Entity.Disciplina;

import java.util.List;

public class ResultadoController {
    private Activity activity;
    private TextView textoDisiplina01;
    private TextView textoDisiplina02;


    public ResultadoController(Activity activity) {
        this.activity = activity;
        initComponents();
        getDisciplina();
    }

    private void initComponents() {
        textoDisiplina02 = activity.findViewById(R.id.textoDisiplina01);
        textoDisiplina02 = activity.findViewById(R.id.textoDisiplina02);
    }

    private void getDisciplina() {
        List<Disciplina> disciplinas = (List<Disciplina>)
                activity.getIntent().getSerializableExtra("disciplinas");
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina.toString());
        }

    }
}


