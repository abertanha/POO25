import java.util.Scanner;
import fatec.poo.model.Circulo;
import java.text.DecimalFormat;
/**
 *
 * @author shenmue
 */
public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat number = new DecimalFormat("#.00");
        String unidadeMedida;
        double raio;
        
        System.out.print("Entre a unidade de medida do raio: ");
        unidadeMedida = entrada.nextLine();
        
        System.out.print("Entre a unidade de medida do raio: ");
        raio = entrada.nextDouble();
        
        
        Circulo objCirc = new Circulo(unidadeMedida);
        objCirc.setRaio(raio);
        double areaCirc = objCirc.calcArea();
        double periCirc = objCirc.calcPerimetro();
        
        System.out.println("A unidade de medida do raio é: "+ objCirc.getUnidadeMedida());
        System.out.println("O raio do circulo é: "+ objCirc.getRaio() + objCirc.getUnidadeMedida());
        System.out.println("A area do circulo é: "+ number.format(areaCirc));
        System.out.println("O perimetro do circulo é: "+ number.format(periCirc) + objCirc.getUnidadeMedida());        
    }
    
}
