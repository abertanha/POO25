package fatec.poo.model;

/**
 * @author 0030482321026
 */
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario funcionario;
    private int numFunc;
    public Departamento(String sigla, String nome){
        this.nome = nome;
        this.sigla = sigla;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public String getSigla(){
        return sigla;
    }
    public String getNome(){
        return nome;
    }
    public void addFuncionario(Funcionario funcionario){
        System.out.println("to do");
    }
    public void listarFuncionarios(){
        System.out.println("to do");
    }
}
