package fatec.poo.model;

/**
 * @author 0030482321026
 */
/**
 * Essa classe tem como objetivo realizar operações
 * de geometria plana referente a um retângulo
 */
public class Retangulo {
    private double altura;
    private double base;
    
    /**
     **Recebe o atributo altura
     * @param altura 
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double calcArea(){
        return (this.altura * this.base);
    }
    public double calcPerimetro(){
        return (2*(this.altura + this.base));
    }
}
