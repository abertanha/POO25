package fatec.poo.model;
import java.util.ArrayList;

/**
 *
 * @author shenmue
 */
public class Hospede extends Pessoa {
    private String cpf;
    private double taxaDesconto;
    private ArrayList<Registro> registros; // multiplicidade 0..*

    public Hospede(String cpf, String nome) {
        super(nome);
        this.cpf = cpf;
        registros = new ArrayList<>();
    }
    
    public void setTaxaDesconto(double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    } 

    public String getCpf() {
        return cpf;
    }

    public double getTaxaDesconto() {
        return taxaDesconto;
    }
    public void addRegistro(Registro registro){
        registros.add(registro);
    }
}
