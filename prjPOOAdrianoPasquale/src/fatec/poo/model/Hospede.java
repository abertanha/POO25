package fatec.poo.model;
import java.util.ArrayList;

/**
 *
 * @author shenmue
 */
public class Hospede extends Pessoa {
    private String cpf;
    private double taxaDesconto;
    private ArrayList<Registro> registros; // multiplicidade 0..*

    public Hospede(String cpf, String nome) {
        super(nome);
        this.cpf = cpf;
        registros = new ArrayList<>();
    }
    
    public void setTaxaDesconto(double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }

    public String getCpf() {
        return cpf;
    }

    public double getTaxaDesconto() {
        return taxaDesconto;
    }
    public void addRegistro(Registro registro){
        registros.add(registro);
    }
    public static boolean validarCPF(String cpf){
        String cpfNumeros = cpf.replaceAll("[^0-9]", "");
        
        // já que o método pode ser chamado de qualquer lugar da app adicionei essa verificação
        // pois não sei se todos os campos que possão vir a ser implementados
        // que passam o CPF terão a mesma máscara que implementei no guiHospede
        // assim esse método sempre será auto-suficiente indiferente de como será chamado
        if (cpfNumeros.length() != 11) return false;
        
        //verificando se são todos iguais, ex: 111.111.111-11, 222.222.222-22, etc...
        boolean todosIguais = true;
        for(int i = 1; i < 11; i++) {
            if(cpfNumeros.charAt(i) != cpfNumeros.charAt(0)){
                todosIguais = false;
                break;
            }
        }
        if(todosIguais) return false;
        
        
        int[] digitos = new int[11];
        for(int i = 0; i < 11; i++){
            digitos[i] = Integer.parseInt(String.valueOf(cpfNumeros.charAt(i)));
        }
        
        //constituindo primeiro DV
        int soma1 = 0;
        for(int i = 0; i < 9; i++){
            soma1 += digitos[i] * (i + 1);
        }
        int dv1Calculado = soma1 % 11;
        if (dv1Calculado == 10) {
            dv1Calculado = 0;
        }
        //apos calculado primeiro DV é hora de verificar com o recebido
        if(dv1Calculado != digitos[9]) return false;
        
        //constituindo segundo DV
        int soma2 = 0;
        for(int i = 0; i < 9; i++){
            soma1 += digitos[i] * (11 - i);
        }
        int dv2Calculado = (soma2 * 10) % 11;
        if (dv2Calculado == 10) {
            dv2Calculado = 0;
        }
        //apos calculado segundo DV é hora de verificar com o recebido
        if(dv2Calculado != digitos[10]) return false;
        
        // se nenhum return false for acionado então:
        return true; 
    }
}
