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
    public boolean saque(double valorSaque){
        if(valorSaque > this.saldo){
            return false;
        }else{
            this.saldo -= valorSaque;
            return true;
        }
    }
    public void deposito(double valorDep){
        this.saldo += valorDep;
    }
    
}
