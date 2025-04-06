package fatec.poo.model;

/**
 * @author 0030482321026
 */
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario[] funcionarios; //vetor de objetos -- multiplicidade 1..*
    private int numFunc;
    
    public Departamento(String sigla, String nome){
        this.nome = nome;
        this.sigla = sigla;
        funcionarios = new Funcionario[5];
        numFunc = 0; //indica o primeiro funcionário
    }
    public Funcionario getFuncionario(int numFunc) {
        return funcionarios[numFunc];
    }
    public String getSigla(){
        return sigla;
    }
    public String getNome(){
        return nome;
    }
    //tem como parametro de entrada o endereço de um
    //objeto da classe FuncionarioHorista, da classe FuncionarioMensalista
    //ou da classe FuncionarioComissionado.
    public void addFuncionario(Funcionario funcionario){
        if(numFunc < 5)
            funcionarios[numFunc++] = funcionario;
    }
    public void listarFuncionarios(){
        int cont = 0;
        System.out.println("\n\nSigla: "+this.getSigla()+
                "\nNome: "+ this.getNome() +
                "\nQtde. de Funcionários: "+ this.numFunc);
        System.out.println("\nRegistro\tNome\t\tCargo");
        
        while(funcionarios[cont] != null){
            System.out.println(funcionarios[cont].getRegistro() +"\t\t"
                    +funcionarios[cont].getNome()+"\t"
                    +funcionarios[cont++].getCargo());
        }
    }
}
