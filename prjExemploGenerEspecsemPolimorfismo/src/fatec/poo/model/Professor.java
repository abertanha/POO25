package fatec.poo.model;
/**
 * @author 0030482321026
 */
public class Professor extends Pessoa {
    private int regFuncional;
    private double salario;
    
    public Professor(int regFuncional, String nome, String dataNascimento) {
        super(nome, dataNascimento);
        this.regFuncional = regFuncional;
    }
    public void setSalario (double salario){
        this.salario = salario;
    }
    public int getRegFuncional() {
        return this.regFuncional;
    }
    public double getSalario(){
        return this.salario;
    }
    
}
