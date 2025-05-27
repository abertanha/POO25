package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Dimas
 */
public class Departamento {
    private String sigla;
    private String nome;
    private ArrayList<Funcionario> funcionarios;  //multiplicidade 1..*
                                
    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new ArrayList<Funcionario>();
    }

    public String getSigla() { 
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void addFuncionario(Funcionario f){
       funcionarios.add(f); //Departamento ---> Funcionario (horista,
                            //mensalista, comissionado
       f.setDepartamento(this);//Funcionario (horista,mensalista,
                               //comissionado ---> Departamento
    }
    
    public void removeFuncionario(Funcionario f){
        funcionarios.remove(f);
        f.setDepartamento(null);
    }
}
