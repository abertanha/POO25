import fatec.poo.model.Retangulo;
import java.text.DecimalFormat;
/**
 * @author 0030482321026
 */
public class Aplic {
    public static void main(String[] args) {
        // Definição do ponteiro para o objeto
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        Retangulo objRet, objRet1;
        
        //Instanciação(alocação) de um objeto
        //a partir de uma classe
        objRet = new Retangulo();
        objRet1 = new Retangulo();
       
        objRet.setAltura(4.0);
        objRet.setBase(3.0);
        
        objRet1.setAltura(7.0);
        objRet1.setBase(5.0);
        
        double diagonal = objRet.calcDiagonal();
        double diagonal1 = objRet.calcDiagonal();
                        
        System.out.println("Retangulo 1");
        System.out.println("Medida da altura: "+objRet.getAltura());
        System.out.println("Medida da base: "+objRet.getBase());
        System.out.println("Medida da área: "+objRet.calcArea());
        System.out.println("Medida do perímetro: "+objRet.calcPerimetro());
        System.out.println("Medida da diagonal: "+numberFormat.format(diagonal));
        System.out.println("\n\nRetangulo 2");
        System.out.println("Medida da altura: "+objRet1.getAltura());
        System.out.println("Medida da base: "+objRet1.getBase());
        System.out.println("Medida da área: "+objRet1.calcArea());
        System.out.println("Medida do perímetro: "+objRet1.calcPerimetro());
        System.out.println("Medida da diagonal: "+numberFormat.format(diagonal1));
    }
}
