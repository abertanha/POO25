import java.text.DecimalFormat;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
/**
 * @author 0030482321026
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat number = new DecimalFormat("#,##0.00");
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,"Pedro Silveira","14/05/1978",15.80);
        
        funcHor.setHorTrab(90);
        funcHor.setCargo("Mecanico");
        System.out.println("Nome           => " + funcHor.getNome());
        System.out.println("Registro       => " + funcHor.getRegistro());
        System.out.println("Dt de Admissão => " + funcHor.getdtAdmissao());
        System.out.println("Cargo          => " + funcHor.getCargo());
        System.out.println("Salario Bruto  => " + number.format(funcHor.calcSalBruto()));
        System.out.println("Gratificação   => " + number.format(funcHor.calcGratificacao()));
        System.out.println("Desconto       => " + number.format(funcHor.calcDesconto()));
        System.out.println("Salário Liquido=> " + number.format(funcHor.calcSalLiquido()));
        
        FuncionarioMensalista funcMen = new FuncionarioMensalista(1253, "Mateus da Silva", "15/06/1980", 750);
        
        funcMen.setNumSalMin(3);
        funcMen.setCargo("Engenheiro");
        
        System.out.println("\n\nNome           => " + funcMen.getNome());
        System.out.println("Registro       => " + funcMen.getRegistro());
        System.out.println("Dt de Admissão => " + funcMen.getdtAdmissao());
        System.out.println("Cargo          => " + funcMen.getCargo());
        System.out.println("Salario Bruto  => " + number.format(funcMen.calcSalBruto()));
        System.out.println("Desconto       => " + number.format(funcMen.calcDesconto()));
        System.out.println("Salário Liquido=> " + number.format(funcMen.calcSalLiquido()));
        
    }
    
}
