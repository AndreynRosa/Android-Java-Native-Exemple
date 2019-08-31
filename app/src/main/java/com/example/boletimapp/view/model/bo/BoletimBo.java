package com.example.boletimapp.view.model.bo;

import com.example.boletimapp.view.model.Entity.Boletim;
import com.example.boletimapp.view.model.Entity.Disciplina;

import java.io.Serializable;
import java.util.List;

public class BoletimBo implements Serializable {

    public BoletimBo(Boletim boletim) {
        this.boletim = boletim;
    }

    public BoletimBo() {
    }

    private Boletim boletim;

    public Boletim getBoletim() {
        return boletim;
    }

    public void setBoletim(Boletim boletim) {
        this.boletim = boletim;
    }
    public Boolean validaNotas(List<Disciplina> disciplinas){
        return true;
    }
}
