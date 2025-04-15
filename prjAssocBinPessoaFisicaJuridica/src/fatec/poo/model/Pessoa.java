package fatec.poo.model;
import java.util.ArrayList;
/**
 * @author 0030482321026
 */
abstract public class Pessoa {
    private String nome;
    private int anoInscricao;
    private double totalCompras;
    private ArrayList<PedidoCompra> pedidos;  //multiplicidade 1..*
    
    public Pessoa(String nome, int anoInscricao){
        this.nome = nome;
        this.anoInscricao = anoInscricao;
        pedidos = new ArrayList<>();       
    }
    abstract public double calcBonus(int anoAtual);
    
    public void addPedidoCompra(PedidoCompra pedido){
        pedidos.add(pedido);
        totalCompras += pedidos.get(pedidos.indexOf(pedido)).getValor();
    }
    public String getNome(){
        return nome;
    }
    public int getAnoInscricao(){
        return anoInscricao;
    }
    public double getTotalCompras(){
        return totalCompras;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }    
}
