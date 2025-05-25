package fatec.poo.model;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author shenmue
 */
public class Registro {
    private int codigo;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private double valorHospedagem;
    private Hospede hospede; // multiplicidade 1
    private Recepcionista recepcionista;// multiplicidade 1
    private Quarto quarto;// multiplicidade 1
    private ArrayList<ServicoQuarto> servicos; // multiplicidade 0..*


    public Registro(int codigo, LocalDate dataEntrada, Recepcionista recepcionista) {
        this.codigo = codigo;
        this.dataEntrada = dataEntrada;
        this.recepcionista = recepcionista;
        servicos = new ArrayList<>();
        recepcionista.addRegistro(this);
    }

    public int getCodigo() {
        return codigo;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public double getValorHospedagem() {
        return valorHospedagem;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }
    
    public void addServicos(ServicoQuarto servico){
        servicos.add(servico);
    }
    
    public void reservarQuarto(Hospede hospede, Quarto quarto){
       this.hospede = hospede;
       hospede.addRegistro(this);
       this.quarto = quarto;
       quarto.reservar();
    }
    public double liberarQuarto(){
        long qtdeDiasLong = ChronoUnit.DAYS.between(dataEntrada, dataSaida);
        int qtdeDias = (int) qtdeDiasLong;
        if (qtdeDias <= 0) qtdeDias = 1;
        valorHospedagem = quarto.liberar(qtdeDias);
        
        double valorAPagar = valorHospedagem;
        valorAPagar -= valorHospedagem * (hospede.getTaxaDesconto()/100.0);
        
        for(ServicoQuarto itemServicos : this.servicos) {
            valorAPagar += itemServicos.getValor();
        }
        
        return valorAPagar;
    }
    
}
