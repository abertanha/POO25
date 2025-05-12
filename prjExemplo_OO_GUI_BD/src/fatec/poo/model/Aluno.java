package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public class Aluno {
    private int ra;
    private String nome;
    private double nota1;
    private double nota2;    

    public Aluno(int ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }
    public int getRa() {
        return ra;
    }
    public String getNome() {
        return nome;
    }
    public double getNota1() {
        return nota1;
    }
    public double getNota2() {
        return nota2;
    }  
    public void setNome(String nome) {
        this.nome = nome;
    } 
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double calcMedia(){
        return((nota1+nota2)/2);
    }     
    public boolean isAprovado(){
        boolean resultado = false;
        
        if (calcMedia() >= 5){
            resultado = true;
        }
        return(resultado);
    }
}
