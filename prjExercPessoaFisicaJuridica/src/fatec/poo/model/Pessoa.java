package fatec.poo.model;

/**
 * @author 0030482321026
 */
abstract public class Pessoa {
    private String nome;
    private int anoInscricao;
    private double totalCompras;
    
    public Pessoa(String nome, int anoInscricao){
        this.nome = nome;
        this.anoInscricao = anoInscricao;
    }
    abstract public double calcBonus(int anoAtual);
    
    public void addCompras(double valor){
        this.totalCompras += valor;
    }
    public String getNome(){
        return this.nome;
    }
    public int getAnoInscricao(){
        return this.anoInscricao;
    }
    public double getTotalCompras(){
        return this.totalCompras;
    }
}
