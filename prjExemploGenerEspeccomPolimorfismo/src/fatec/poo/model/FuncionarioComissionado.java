package fatec.poo.model;

/**
 * @author 0030482321026
 */
public class FuncionarioComissionado extends Funcionario {
    private double salBase;
    private double taxaComissao;
    private double totalVendas;
    
    public FuncionarioComissionado(int registro, String nome, String dtAdmissao, double taxaComissao){
        super(registro, nome, dtAdmissao);
        this.taxaComissao = taxaComissao;
    }
    public void setSalBase(double salBase){
        this.salBase = salBase;
    }
    public double getSalbase(){
        return this.salBase;
    }
    public double getTotalVendas(){
        return this.totalVendas;
    }
    public double getTaxaComissao(){
        return this.taxaComissao;
    }
    public void addVendas(double valor){
        this.totalVendas += valor;
    }
    public double calcSalBruto(){
        return this.salBase + ((this.taxaComissao/100) * this.totalVendas);
    }
    public double calcGratificacao(){
        if(this.totalVendas > 10000){
            return (calcSalBruto() * 0.05);
        } else if (this.totalVendas > 5000){
            return (calcSalBruto() * 0.03);
        }
        return 0;
    }
    public double calcSalLiquido(){
        return (super.calcSalLiquido() + calcGratificacao());
    }
}
