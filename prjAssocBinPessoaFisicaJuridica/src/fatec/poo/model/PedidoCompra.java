package fatec.poo.model;
/**
 * @author 0030482321026
 */
public class PedidoCompra {
    private int numero;
    private String dataPedido;
    private double valor;
    private Pessoa pessoa;

    public PedidoCompra(int numero) {
        this.numero = numero;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public double getValor() {
        return valor;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
}
