package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public class FuncionarioComissionado extends Funcionario{
    private double salBase;
    private double taxaComissao;//em porcentagem Exemplo: 5%
    private double totalVendas;

    public FuncionarioComissionado(int r, String n, String dtAdm,double txCom) {
        super(r, n, dtAdm);//chamada do método construtor da superclasse
        taxaComissao = txCom; 
    }
    
    public double getSalBase() {
        return salBase;
    }

    public void setSalBase(double sb) {
        salBase = sb;
    }

    public double getTaxaComissao() {
        return taxaComissao; 
    }

    public double getTotalVendas() {
        return totalVendas;
    }
    
    public void addVendas(double vendas){
        totalVendas += vendas; //totalVendas = totalVendas + vendas   
    }
    
    public double calcSalBruto(){
        return salBase + (taxaComissao/100 * totalVendas); 
    }
    
    public double calcGratificacao(){
        if(totalVendas <= 5000){
            return 0;
        }else 
           if(totalVendas > 5000 && totalVendas <= 10000){
             return calcSalBruto()*0.03; //3%
           } 
           else {             
             return calcSalBruto()*0.05; //5%
           }  
    }
    
    //Aplicando polomorfismo
    public double calcSalLiquido(){
        return (super.calcSalLiquido() + calcGratificacao());
    }
}
