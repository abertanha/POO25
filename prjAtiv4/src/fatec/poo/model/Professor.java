package fatec.poo.model;
/**
 * @author 0030482321026
 */
public class Professor extends Pessoa {
    private String regFunc;
    private int titularidade;
    private int areaAtuacao;
    private Turma[] turmas;//multiplicidade 1..*
    private int numTur;

    public Professor(String regFunc, String nome) {
        super(nome);
        this.regFunc = regFunc;
        turmas = new Turma[3];
        numTur = 0;
        
    }
    public void addTurma(Turma turma){
        turmas[numTur++] = turma;
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
