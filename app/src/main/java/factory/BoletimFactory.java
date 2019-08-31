package factory;

import android.widget.EditText;
import android.widget.NumberPicker;

import com.example.boletimapp.view.model.Entity.Boletim;
import com.example.boletimapp.view.model.Entity.Disciplina;

import java.math.BigDecimal;
import java.util.List;

public abstract class BoletimFactory {

    private static final int INDEX_NOTA1 = 0;
    private static final int INDEX_NOTA3TA2 =1;
    private static final int INDEX_NOTA3 = 2;

    public static Disciplina createNewDisciplina(EditText editNome, List<NumberPicker> npNotas ){
        Disciplina disciplina = new Disciplina();
        disciplina.setNome(editNome.getText().toString());

        disciplina.setNota01(npNotas.get(INDEX_NOTA1).getValue());
        disciplina.setNota02(npNotas.get(INDEX_NOTA3TA2).getValue());
        disciplina.setNota03(npNotas.get(INDEX_NOTA3).getValue());

        return disciplina;
    }
}
