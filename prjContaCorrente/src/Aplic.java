import fatec.poo.model.ContaCorrente;
import java.util.Scanner;
/**
 *
 * @author shenmue
 */
public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroConta;
        double saldoConta;
        System.out.print("Informe o numero da conta: ");
        numeroConta = entrada.nextInt();
        
        System.out.print("Informe o saldo da conta: ");
        saldoConta = entrada.nextDouble();
        
        ContaCorrente objConta = new ContaCorrente(numeroConta, saldoConta);
        
        int opcao;
        boolean sessao = true;
        while(sessao){
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair");
            System.out.println("\n\tDigite a opção: ");

            opcao = entrada.nextInt();

            switch (opcao){
            case 1:
                double valorDep;
                System.out.println("Numero da conta: "+objConta.getNumero());
                System.out.print("Entre o valor do depósito: ");
                valorDep = entrada.nextDouble();
                objConta.deposito(valorDep);
                break;
            case 2:
                double valorSaque;
                System.out.println("Numero da conta: "+objConta.getNumero());
                System.out.print("Entre o valor do Saque: ");
                valorSaque = entrada.nextDouble();
                objConta.saque(valorSaque);
                break;      
            case 3:
                System.out.println("Numero da conta: "+objConta.getNumero());
                System.out.println("Saldo: "+objConta.getSaldo());
                break;
            case 4:
                sessao = false;
                break;
                default:
                    System.out.println("Operação inválida");
            }
        }
        
    }
    
}
