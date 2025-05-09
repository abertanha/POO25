package fatec.poo.model;
import java.util.ArrayList;
/**
 * @author shenmue
 */
public class Turma {
    private String sigla;
    private int qtdeVagas;
    private Professor professor;//multiplicidade tipo 1
    private Curso curso; //multiplicidade tipo 1
    private ArrayList<Aluno> alunos; //multiplicidade tipo 1..*
    
    public Turma(String sigla, int qtdeVagas) {
        this.sigla = sigla;
        this.qtdeVagas = qtdeVagas;
        alunos = new ArrayList<>();
    }
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    
    public Professor getProfessor(){
        return professor;
    }
    
    public void setCurso(Curso curso){
        this.curso = curso;
    }
    
    public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }
    
    public Curso getCurso(){
        return curso;
    }
    public String getSigla() {
        return sigla;
    }

    public int getQtdeVagas() {
        return qtdeVagas;
    }
    public void listarAlunos(){
        System.out.println("\n\t\t\tLista de Frequência\n\n");
        System.out.println("Sigla do Curso: "+curso.getSigla()
                        +"\t\t\tNome do Curso: "+curso.getNome()
                        +"\n\nSigla Turma: "+sigla
                        +"\n\nNome do Professor: "+professor.getNome()
                        +"\n\n\tNome do Aluno\n\n");
        int cont = 0;
        while(cont < alunos.size()){
            System.out.println(cont+1 +" - "+ alunos.get(cont++).getNome()+"\n");
        }
    }    
}
