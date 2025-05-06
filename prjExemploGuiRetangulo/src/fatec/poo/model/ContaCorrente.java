package fatec.poo.model;
/**
 *
 * @author shenmue
 */
public class ContaCorrente {
    private int numero;
    private double saldo;
    
    public ContaCorrente(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    public int getNumero(){
        return this.numero;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void saque(double valorSaque){
        this.saldo -= valorSaque;
    }
    public void deposito(double valorDep){
        this.saldo += valorDep;
    }
    
}
