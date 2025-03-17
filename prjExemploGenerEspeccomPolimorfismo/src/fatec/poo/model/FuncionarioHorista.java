package fatec.poo.model;

/**
 * @author 0030482321026
 */
public class FuncionarioHorista extends Funcionario {
    private double valHorTrab;
    private int qtdeHorTrab;
    
    public FuncionarioHorista(int registro, String nome, String dtAdmissao, double valHorTrab){
        super(registro, nome, dtAdmissao);
        this.valHorTrab = valHorTrab;
    }
    public void setHorTrab(int qtdeHorTrab){
        this.qtdeHorTrab = qtdeHorTrab;
    }
    @Override
    public double calcSalBruto() {
        return this.valHorTrab *  this.qtdeHorTrab;
    }
    
}
