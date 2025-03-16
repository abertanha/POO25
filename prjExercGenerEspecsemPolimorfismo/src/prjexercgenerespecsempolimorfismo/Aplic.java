import fatec.poo.model.Pessoa;
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;
import java.util.Scanner;


/**
 * @author shenmue
 */
public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int identificacao;
        String nome, telefone, cpf;
        double altura,peso;
        
        System.out.println("Entre a identificacao do Instrutor: ");
        identificacao = entrada.nextInt();
        System.out.println("Entre o nome do Instrutor: ");
        nome = entrada.next();
        System.out.println("Entre o telefone do Instrutor: ");
        telefone = entrada.next();
        Instrutor objIns = new Instrutor(identificacao,nome,telefone);
        System.out.println("Digite area de atuacao do instrutor: ");
        objIns.setAreaAtuacao(entrada.next());
        
        System.out.println("Entre o cpf do Cliente: ");
        cpf = entrada.next();
        System.out.println("Entre o nome do Cliente: ");
        nome = entrada.next();
        System.out.println("Entre o telefone do Cliente: ");
        telefone = entrada.next();
        Cliente objCli = new Cliente(cpf,nome,telefone);
        
        System.out.println("Digite o peso: ");
        objCli.setPeso(entrada.nextDouble());
        System.out.println("Digite a altura:" );
        objCli.setAltura(entrada.nextDouble());
        
        int opcao;
        boolean sessao = true;
        while(sessao){
            System.out.println("\n1 - Instrutor");
            System.out.println("2 - Cliente");
            System.out.println("3 - Sair");
            System.out.println("\n\tDigite a opção: ");

            opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("\nNome: "+objIns.getNome());
                    System.out.println("Telefone: "+objIns.getTelefone());
                    System.out.println("Identificacao do instrutor: "+ objIns.getIdentificacao());
                    System.out.print("Area de atuação: "+objIns.getAreaAtuacao()+ "\n");
                    break;
                case 2:
                    System.out.println("\nNome: "+objCli.getNome());
                    System.out.println("Telefone: "+objCli.getTelefone());
                    System.out.println("peso: "+ objCli.getPeso());
                    System.out.println("altura: "+ objCli.getAltura()+"\n");
                    break;      
                case 3:
                    sessao = false;
                    break;
                    default:
                        System.out.println("\nOperação inválida");
            }
        }
       
    }
    
}
