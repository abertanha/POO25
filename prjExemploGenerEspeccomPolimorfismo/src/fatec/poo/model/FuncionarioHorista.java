package fatec.poo.model;

/**
 * @author 0030482321026
 */
public class FuncionarioHorista extends Funcionario {
    private double valHorTrab;
    private int qtdeHorTrab;
    private String cargo;
    
    public FuncionarioHorista(int registro, String nome, String dtAdmissao, double valHorTrab){
        super(registro, nome, dtAdmissao);
        this.valHorTrab = valHorTrab;
    }
    public void setHorTrab(int qtdeHorTrab){
        this.qtdeHorTrab = qtdeHorTrab;
    }
    public double calcSalBruto() {
        return this.valHorTrab * this.qtdeHorTrab;
    }
    public double calcGratificacao(){
        return (calcSalBruto() * 0.075);
    }
    public double calcSalLiquido(){
        return (super.calcSalLiquido() + calcGratificacao() );
    }    
}
