import java.util.Scanner;
import java.text.DecimalFormat;
import fatec.poo.model.*;

/**
 * @author 0030482321026
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat number = new DecimalFormat("#.00");
        
        PessoaFisica objPeFis = new PessoaFisica("11122233344",
                                                "Clotilde Ferreira",
                                                2012);
        PessoaJuridica objPeJuri = new PessoaJuridica("1112223/55555",
                                                      "Mecânica Arvore Grande",
                                                      1987);
        PedidoCompra[] cadPedidos = new PedidoCompra[10];
        
        
        boolean sessao = true;
        while(sessao){
            System.out.println("\n1 - Adicionar compras\n2 - Informar Base\n3 - Sair\n\tDigite uma opção");
            int opcao = entrada.nextInt();
            switch (opcao){
                case 1:
                    boolean compras = true;
                    while(compras){
                        System.out.println("Insira o valor da compra ou insira zero se quiser parar: ");
                        double valor = entrada.nextDouble();
                        if(valor != 0){
                            objPeFis.addCompras(valor);
                        }else {
                            compras = false;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Insira o valor de base: ");
                    objPeFis.setBase(entrada.nextDouble());
                    break;
                case 3:
                    sessao = false;
                    break;
                default:
                    System.out.println("Operação inválida.");
            }
        }
        System.out.println("\n\nPessoa Física");
        System.out.println("Nome                => " + objPeFis.getNome());
        System.out.println("Ano de inscrição    => " + objPeFis.getAnoInscricao());
        System.out.println("Total de compras    => " + objPeFis.getTotalCompras());
        System.out.println("CPF                 => " + objPeFis.getCpf());
        System.out.println("Base                => " + objPeFis.getBase());
        System.out.println("Bonus               => " + objPeFis.calcBonus(2025));
        
        
        
        
        
        sessao = true;
        while(sessao){
            System.out.println("\n1 - Adicionar compras\n2 - Informar Taxa de Incentivo\n3 - Sair\n\tDigite uma opção");
            int opcao = entrada.nextInt();
            switch (opcao){
                case 1:
                    boolean compras = true;
                    while(compras){
                        System.out.println("Insira o valor da compra ou insira zero se quiser parar: ");
                        double valor = entrada.nextDouble();
                        if(valor != 0){
                            objPeJuri.addCompras(valor);
                        }else {
                            compras = false;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Insira o valor de taxa de incentivo: ");
                    objPeJuri.setTaxaIncentivo(entrada.nextDouble());
                    break;
                case 3:
                    sessao = false;
                    break;
                default:
                    System.out.println("Operação inválida.");
            }
        }
        System.out.println("Pessoa Jurídica");
        System.out.println("Nome                => " + objPeJuri.getNome());
        System.out.println("Ano de inscrição    => " + objPeJuri.getAnoInscricao());
        System.out.println("Total de compras    => " + objPeJuri.getTotalCompras());
        System.out.println("CPF                 => " + objPeJuri.getCgc());
        System.out.println("Taxa de incentivo   => " + objPeJuri.getTaxaIncentivo() + "%");
        System.out.println("Bonus               => " + objPeJuri.calcBonus(2025));
    }
    
}
