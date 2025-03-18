package fatec.poo.model;

/**
 * @author 0030482321026
 */
abstract public class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String cargo;
    
    public Funcionario(int registro, String nome, String dtAdmissao){
        this.registro = registro;
        this.nome = nome;
        this.dtAdmissao = dtAdmissao;
    }
    // Método abstrato
    // Ele tem somente sua assinatura
    // a implementação estará nas subclasses
    abstract public double calcSalBruto();
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public double calcDesconto(){
        return (0.1 * calcSalBruto());
    }
    public double calcSalLiquido(){
        return (calcSalBruto() - calcDesconto());
    }
    public int getRegistro(){
        return this.registro;
    }
    public String getNome() {
        return this.nome;
    }
    public String getdtAdmissao(){
        return this.dtAdmissao;
    }
    public String getCargo(){
        return this.cargo;
    }
}
