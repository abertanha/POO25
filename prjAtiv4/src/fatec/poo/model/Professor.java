package fatec.poo.model;
import java.util.ArrayList;

/**
 * @author 0030482321026
 */
public class Professor extends Pessoa {
    private String regFunc;
    private int titularidade;
    private int areaAtuacao;
    private ArrayList<Turma> turmas; //multiplicidade 1..*

    public Professor(String regFunc, String nome) {
        super(nome);
        this.regFunc = regFunc;
        turmas = new ArrayList<>();
    }
    public void addTurma(Turma turma){
        turmas.add(turma);
    } 
    public String getRegFunc() {
        return regFunc;
    }

    public int getTitularidade() {
        return titularidade;
    }

    public int getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setTitularidade(int titularidade) {
        this.titularidade = titularidade;
    }

    public void setAreaAtuacao(int areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
    
       
}
