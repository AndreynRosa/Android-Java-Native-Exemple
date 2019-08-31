package com.example.boletimapp.view.controller;

import android.app.Activity;
import android.content.Intent;
import android.widget.EditText;
import android.widget.NumberPicker;

import com.example.boletimapp.R;
import com.example.boletimapp.view.CaulculadoraActivity;
import com.example.boletimapp.view.model.Entity.Boletim;
import com.example.boletimapp.view.model.Entity.Disciplina;
import com.example.boletimapp.view.model.bo.BoletimBo;
import com.example.boletimapp.view.utils.NumberPickerUtils;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MainController {

    private Activity activity;
    private EditText editNome;
    private NumberPicker npNota01;
    private NumberPicker npNota02;
    private NumberPicker npNota03;


    public MainController(Activity activity) {
        this.activity = activity;
        initComponents();
    }

    private void initComponents() {
        List<NumberPicker> npNotas = createNumberPickList();
        NumberPickerUtils.configNumberPicker(npNotas);

    }

    private List<NumberPicker> createNumberPickList() {
        editNome = activity.findViewById(R.id.editNome);
        npNota01 = activity.findViewById(R.id.nota01);
        npNota02 = activity.findViewById(R.id.nota02);
        npNota03 = activity.findViewById(R.id.nota03);
        List<NumberPicker> npNotas  = NumberPickerUtils.newNumberPickList3(npNota01, npNota02,npNota03);
        return npNotas;
    }
//    private void configNumberPicker(List<NumberPicker> npNotas) {
//        for (NumberPicker npNota : npNotas) {
//            npNota.setMinValue(0);
//            npNota.setMaxValue(10);
//            npNota.setValue(5);
//        }
//    }


    public void proximoAction() {
        Disciplina disciplina = new Disciplina();
        disciplina.setNome(editNome.getText().toString());
        disciplina.setNota01(npNota01.getValue());
        disciplina.setNota02(npNota02.getValue());
        disciplina.setNota03(npNota03.getValue());

        List<Disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(disciplina);
        Intent it = new Intent(activity, CaulculadoraActivity.class);
        it.putExtra("disciplinas", (Serializable) disciplinas);
        activity.startActivity(it);
    }
}
