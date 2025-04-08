import java.util.Scanner;
import java.text.DecimalFormat;
import fatec.poo.model.*;
import java.util.Date;

/**
 * @author 0030482321026
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat number = new DecimalFormat("#.###,00");
        Date data = new Date();
        
        System.out.println("Entre os dados da Pessoa Física: ");
        System.out.println("CPF: ");
        String cpf = entrada.next();
        System.out.println("Nome: ");
        String nome = entrada.next();
        System.out.println("Ano de inscrição: ");
        int anoInscricao = entrada.nextInt();
        
        PessoaFisica objPeFis = new PessoaFisica(cpf, nome, anoInscricao);
        
        System.out.println("\n\nEntre os dados da Pessoa Jurídica: ");
        System.out.println("CGC: ");
        String cgc = entrada.next();
        System.out.println("Nome: ");
        String nomePj = entrada.next();
        System.out.println("Ano de inscrição: ");
        int anoInscricaoPj = entrada.nextInt();
        
        PessoaJuridica objPeJuri = new PessoaJuridica(cgc, nomePj, anoInscricaoPj);
        
        //definição da matriz objetos da classe PedidoCompra
        PedidoCompra[] cadPedidos = new PedidoCompra[10];
        
        int cont = 0;
        while(cont < 10){
            System.out.println("Insira o numero do pedido: ");
            cadPedidos[cont] = new PedidoCompra(entrada.nextInt());
            System.out.println("Insira a data do pedido: ");
            cadPedidos[cont].setDataPedido(entrada.next());
            System.out.println("Insira o valor do pedido: ");
            cadPedidos[cont].setValor(entrada.nextFloat());
            
            boolean sessao = true;
            while(sessao){
                System.out.println("\n1 - Pessoa Física\n2 - Pessoa Jurídica\n\tDigite uma opção");
                int opcao = entrada.nextInt();
                switch (opcao){
                    case 1:
                        System.out.println("\nContabilizado para Pessoa Física");
                        cadPedidos[cont].setPessoa(objPeFis);
                        objPeFis.addPedidoCompra(cadPedidos[cont++]);
                        sessao = false;
                        break;
                    case 2:
                        System.out.println("\nContabilizado para Pessoa Jurídica");
                        cadPedidos[cont].setPessoa(objPeJuri);
                        objPeJuri.addPedidoCompra(cadPedidos[cont++]);
                        sessao = false;
                        break;
                    default:
                        System.out.println("Operação inválida.");
                }
            }
        }
        
        System.out.println("Data atual: "+ data);
        System.out.println("\n\nPessoa Física");
        System.out.println("Nome                => " + objPeFis.getNome());
        System.out.println("Ano de inscrição    => " + objPeFis.getAnoInscricao());
        System.out.println("Total de compras    => " + objPeFis.getTotalCompras());
        System.out.println("CPF                 => " + objPeFis.getCpf());
        System.out.println("Base                => " + objPeFis.getBase());
        System.out.println("Bonus               => " + objPeFis.calcBonus(2025));
       
        System.out.println("Pessoa Jurídica");
        System.out.println("Nome                => " + objPeJuri.getNome());
        System.out.println("Ano de inscrição    => " + objPeJuri.getAnoInscricao());
        System.out.println("Total de compras    => " + objPeJuri.getTotalCompras());
        System.out.println("CPF                 => " + objPeJuri.getCgc());
        System.out.println("Taxa de incentivo   => " + objPeJuri.getTaxaIncentivo() + "%");
        System.out.println("Bonus               => " + objPeJuri.calcBonus(2025));
    } 
}
