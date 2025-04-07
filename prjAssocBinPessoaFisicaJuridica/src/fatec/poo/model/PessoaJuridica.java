package fatec.poo.model;

/**
 * @author 0030482321026
 */
public class PessoaJuridica extends Pessoa {
    private String cgc;
    private double taxaIncentivo;
    
    public PessoaJuridica(String cgc, String nome, int anoInscricao){
        super(nome, anoInscricao);
        this.cgc = cgc;
    }
    public double calcBonus(int anoAtual){
        return ((super.getTotalCompras() * (this.taxaIncentivo/100)) * (anoAtual - super.getAnoInscricao()));
    }
    public void setTaxaIncentivo(double taxaIncentivo){
        this.taxaIncentivo = taxaIncentivo;        
    }
    public String getCgc(){
        return cgc;
    }
    public double getTaxaIncentivo(){
        return taxaIncentivo;
    }
    
}
