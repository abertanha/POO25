
package fatec.poo.model;

/**
 * @author shenmue
 */
public class Cliente extends Pessoa {
    private String cpf;
    private Double peso;
    private Double altura;
    public Cliente(String cpf, String nome, String telefone){
        super(nome, telefone);
        this.cpf = cpf;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getPeso(){
        return this.peso;
    }
    public double getAltura(){
        return this.altura;
    }
    public String getCpf(){
        return this.cpf;
    }
    
}
