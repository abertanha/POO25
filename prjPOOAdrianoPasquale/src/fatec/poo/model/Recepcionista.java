package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author shenmue
 */
public class Recepcionista extends Pessoa {
    private int regFunc;
    private String turno;
    private ArrayList<Registro> registros; // multiplicidade 0..*

    public Recepcionista(int regFunc, String nome) {
        super(nome);
        this.regFunc = regFunc;
        registros = new ArrayList<>();
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getRegFunc() {
        return regFunc;
    }

    public String getTurno() {
        return turno;
    }
    public void addRegistro(Registro registro) {
        registros.add(registro);
    }
}
