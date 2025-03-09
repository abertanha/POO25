import java.util.Scanner;
import fatec.poo.model.Circulo;
/**
 *
 * @author shenmue
 */
public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String unidadeMedida;
        
        System.out.print("Entre a unidade de medida do raio: ");
        unidadeMedida = entrada.nextLine();
        
        Circulo objCirc = new Circulo(unidadeMedida);
        
        System.out.println("A unidade de medida do raio é: "+ objCirc.getUnidadeMedida());
    }
    
}
