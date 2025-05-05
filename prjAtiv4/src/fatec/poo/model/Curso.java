package fatec.poo.model;

/**
 * @author shenmue
 */
public class Curso {
    private String sigla;
    private String descricao;
    private String cargaHoraria;
    private String nome;
    private Turma turma;

    public Curso(String sigla, String descricao, String cargaHoraria) {
        this.sigla = sigla;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    
    public String getSigla() {
        return sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }
    
    
}
