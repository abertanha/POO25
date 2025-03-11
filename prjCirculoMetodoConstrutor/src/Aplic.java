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
        Circulo objCirc = new Circulo(entrada.nextLine());
        
        System.out.print("Entre a unidade de medida do raio: ");
        objCirc.setRaio(entrada.nextDouble());
        
        System.out.println("A unidade de medida do raio é: "+ objCirc.getUnidadeMedida());
        System.out.println("O raio do circulo é: "+ objCirc.getRaio() + objCirc.getUnidadeMedida());
        System.out.println("A area do circulo é: "+ number.format(objCirc.calcArea())+objCirc.getUnidadeMedida()+ "²");
        System.out.println("O perimetro do circulo é: "+ number.format(objCirc.calcPerimetro()) + objCirc.getUnidadeMedida());        
    }
    
}
