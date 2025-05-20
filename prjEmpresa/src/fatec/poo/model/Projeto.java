
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Dimas
 */

public class Projeto {
    private int codigo;
    private String descricao;
    private String dtInicio;
    private String dtTermino;
    private ArrayList<Funcionario> funcionarios; //multiplicidade 1..*

    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        funcionarios = new ArrayList<Funcionario>();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public String getDtTermino() {
        return dtTermino;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public void setDtTermino(String dtTermino) {
        this.dtTermino = dtTermino;
    }
    public void addFuncionario(Funcionario f){ 
        funcionarios.add(f);//Projeto ---> Funcionario (horista,
                            //mensalista, comissionado
        f.setProjeto(this); //Funcionario (horista,mensalista,
                            //comissionado ---> Projeto
    }    
}
