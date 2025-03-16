package fatec.poo.model;

/**
 *
 * @author shenmue
 */
public class Pessoa {
    private String nome;
    private String telefone;
    
    public Pessoa(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    public String getNome(){
        return this.nome;
    }
    public String getTelefone(){
        return this.telefone;
    }
}
