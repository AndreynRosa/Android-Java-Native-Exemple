package com.example.boletimapp.view.model.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Boletim implements Serializable {

    private List<Disciplina> disciplinas;

    public List<Disciplina> getDisciplinas() {
        if(this.disciplinas == null) {
            this.disciplinas = new ArrayList<>();
        }
        return this.disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
