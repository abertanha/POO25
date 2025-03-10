import java.util.Scanner;
import java.text.DecimalFormat;
import fatec.poo.model.Retangulo;
/**
 *
 * @author Dimas, Adriano
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat number = new DecimalFormat("#.00");
        
        double medAlt, medBase;
        int opcao;
        String unidade; 
        
        System.out.print("Digite a unidade de medida: ");
        unidade = entrada.next();
        
        //criação do ponteiro,
        //instanciação(alocação) de um objeto da classe Retangulo
        //e chamada do método construtor
        
        Retangulo objRet = new Retangulo(unidade);
        
        System.out.print("Digite a medida da altura: ");
        medAlt = entrada.nextDouble();
        System.out.print("Digite a medida da base: ");
        medBase = entrada.nextDouble();
        
        //Passagem de mensagens
        //passagem de mensagens
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
       
        System.out.println("Medida da altura: " + objRet.getAltura()+ " " + objRet.getUnidadeMedida());
        System.out.println("Medida da base: " + objRet.getBase() + " " + objRet.getUnidadeMedida());
        System.out.println("Medida da área: " + number.format(objRet.calcArea())+ " " + objRet.getUnidadeMedida() + "²");
        System.out.println("Medida do perímetro: " + objRet.calcPerimetro()+ " " + objRet.getUnidadeMedida());
        System.out.println("Medida da diagonal: " + number.format(objRet.calcDiagonal())+ " " + objRet.getUnidadeMedida());
    }    
}
