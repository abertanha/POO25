package fatec.poo.model;


/**
 *
 * @author shenmue
 */
public class Circulo {
    private String unidadeMedida;
    private double raio;
    
    public Circulo(String unidadeMedida){
        this.unidadeMedida = unidadeMedida;
    }
    public String getUnidadeMedida(){
        return this.unidadeMedida;
    }
    public void setRaio(double raio){
        this.raio = raio;
    }
    public double getRaio(){
        return this.raio;
    }
    public double calcArea(){
        return (Math.pow(this.raio, 2)*Math.PI);
    }
    public double calcPerimetro(){
        return (Math.PI*this.raio*2);
    }
}
