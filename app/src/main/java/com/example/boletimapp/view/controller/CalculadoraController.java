package com.example.boletimapp.view.controller;

import android.app.Activity;
import android.content.Intent;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

import com.example.boletimapp.R;
import com.example.boletimapp.view.CaulculadoraActivity;
import com.example.boletimapp.view.ResultadoActivity;
import com.example.boletimapp.view.model.Entity.Boletim;
import com.example.boletimapp.view.model.Entity.Disciplina;
import com.example.boletimapp.view.model.bo.BoletimBo;
import com.example.boletimapp.view.utils.NumberPickerUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CalculadoraController {

    private Activity activity;
    private TextView resultado;
    private EditText editNome;
    private NumberPicker npNota01;
    private NumberPicker npNota02;
    private NumberPicker npNota03;
    private List<Disciplina> disciplinaParam;

    public CalculadoraController(Activity activity) {
        this.activity = activity;
        initComponents();
        getDisciplina();
    }
    private void initComponents() {
        editNome = activity.findViewById(R.id.editNome);
        resultado = activity.findViewById(R.id.resutado);
        List<NumberPicker> npNotas = createNumberPickList();
        NumberPickerUtils.configNumberPicker(npNotas);

    }
    private List<NumberPicker> createNumberPickList() {
        npNota01 = activity.findViewById(R.id.nota01);
        npNota02 = activity.findViewById(R.id.nota02);
        npNota03 = activity.findViewById(R.id.nota03);
        List<NumberPicker> npNotas  = NumberPickerUtils.newNumberPickList3(npNota01, npNota02,npNota03);
        return npNotas;
    }

    private void getDisciplina()   {
        List<Disciplina> disciplinas = (List<Disciplina>)
                activity.getIntent().getSerializableExtra("disciplinas");
        disciplinaParam = new ArrayList<>();
        disciplinaParam.addAll(disciplinas);
        resultado.setText(disciplinas.get(0).getNome());
    }




    public void calcularAction() {
        Disciplina disciplina = new Disciplina();
        disciplina.setNome(editNome.getText().toString());
        disciplina.setNota01(npNota01.getValue());
        disciplina.setNota02(npNota02.getValue());
        disciplina.setNota03(npNota03.getValue());

        disciplinaParam.add(disciplina);
        Intent it = new Intent(activity, ResultadoActivity.class);
        it.putExtra("disciplinas", (Serializable) disciplinaParam);
        activity.startActivity(it);


    }
}
