package fatec.poo.model;

/**
 *
 * @author shenmue
 */
public class Quarto {
    private int numero;
    private String tipo;
    private boolean situacao;
    private double valorDiaria;
    private double totalFaturado;

    public Quarto(int numero, String tipo, double valorDiaria) {
        this.numero = numero;
        this.tipo = tipo;
        this.valorDiaria = valorDiaria;
        situacao = false; // quarto desocupado
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }
    public void reservar() {
        situacao = true; // quarto ocupado
    }
    public double liberar(int qtdeDias){
        double valorHospedagem = qtdeDias * this.valorDiaria;
        
        this.totalFaturado += valorHospedagem;
        
        this.situacao = false;
        
        return valorHospedagem;
    }
    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public void setTotalFaturado(double totalFaturado) {
        this.totalFaturado = totalFaturado;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
}
