package fatec.poo.model;

/**
 * @author 0030482321026
 */
public class PessoaFisica extends Pessoa {
    private String cpf;
    private double base;
    
    public PessoaFisica (String cpf, String nome, int anoInscricao){
        super(nome, anoInscricao);
        this.cpf = cpf;
    }
    public double calcBonus(int anoAtual){
        if(super.getTotalCompras() > 12000){
            return (this.base * (anoAtual - super.getAnoInscricao()));
        }
        return 0;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setBase(double base){
        this.base = base;
    }
    public double getBase(){
        return this.base;
    }
}
