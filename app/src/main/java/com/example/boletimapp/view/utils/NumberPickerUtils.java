package com.example.boletimapp.view.utils;

import android.widget.NumberPicker;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberPickerUtils {


    public static void configNumberPicker(List<NumberPicker> npNotas) {
        for (NumberPicker npNota : npNotas) {
            npNota.setMinValue(0);
            npNota.setMaxValue(10);
            npNota.setValue(0);
        }
    }

    public static  List<NumberPicker> newNumberPickList3(NumberPicker npNota01, NumberPicker npNota02, NumberPicker npNota03) {
        List<NumberPicker> npNotas = new ArrayList<>();
        npNotas.add(npNota01);
        npNotas.add(npNota02);
        npNotas.add(npNota03);

        return npNotas;
    }
}

