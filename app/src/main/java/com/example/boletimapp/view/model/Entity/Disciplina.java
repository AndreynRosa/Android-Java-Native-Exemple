package com.example.boletimapp.view.model.Entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Disciplina implements Serializable {

    private String nome;
    private Integer nota01;
    private Integer nota02;
    private Integer nota03;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNota01() {
        return nota01;
    }

    public void setNota01(Integer nota01) {
        this.nota01 = nota01;
    }

    public Integer getNota02() {
        return nota02;
    }

    public void setNota02(Integer nota02) {
        this.nota02 = nota02;
    }

    public Integer getNota03() {
        return nota03;
    }

    public void setNota03(Integer nota03) {
        this.nota03 = nota03;
    }
}
