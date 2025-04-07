package fatec.poo.model;

/**
 * @author 0030482321026
 */
abstract public class Pessoa {
    private String nome;
    private int anoInscricao;
    private double totalCompras;
    private PedidoCompra[] pedidos;
    private int numPed;
    
    public Pessoa(String nome, int anoInscricao){
        this.nome = nome;
        this.anoInscricao = anoInscricao;
        pedidos = new PedidoCompra[10];
        numPed = 0;
        
    }
    abstract public double calcBonus(int anoAtual);
    
    public void addCompras(){
        totalCompras += pedidos[numPed++].getValor();
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
    public void setNome(String nome) {
        this.nome = nome;
    }    
}
