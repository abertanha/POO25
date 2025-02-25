import java.util.Scanner;
import fatec.poo.model.Retangulo;
import java.text.DecimalFormat;
/**
 * @author 0030482321026
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        Retangulo objRet = new Retangulo();
        double medAlt, medBase;
        
        System.out.println("Digite a medida da altura: ");
        medAlt = entrada.nextDouble();
        System.out.println("Digite a medida da base: ");
        medBase = entrada.nextDouble();
        
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        double diagonal = objRet.calcDiagonal();
        
        System.out.println("Medida da altura: "+objRet.getAltura());
        System.out.println("Medida da base: "+objRet.getBase());
        System.out.println("Medida da área: "+objRet.calcArea());
        System.out.println("Medida do perímetro: "+objRet.calcPerimetro());
        System.out.println("Medida da diagonal: "+numberFormat.format(diagonal));
        
    }
}
