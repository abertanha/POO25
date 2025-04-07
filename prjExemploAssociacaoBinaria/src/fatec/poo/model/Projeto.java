package fatec.poo.model;

/**
 * @author shenmue
 */
public class Projeto {
    private int codigo;
    private String descricao;
    private String dtInicio;
    private String dtTermino;
    private Funcionario[] funcionarios;//definicao ponteiro - multiplicidade 1..*//
    private int numFunc;
    
    public Projeto (int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
        funcionarios = new Funcionario[3];
        numFunc = 0;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public void setDtTermino(String dtTermino) {
        this.dtTermino = dtTermino;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public String getDtTermino() {
        return dtTermino;
    }
    public void addFuncionario(Funcionario funcionario){
        if(numFunc < 3)
            funcionarios[numFunc++] = funcionario;
    }
    public void listarFuncionarios(){
        int cont = 0;
        System.out.println("\n\nCódigo: "+codigo+
                "\nDescricao: "+ descricao +
                "\nData Início: "+ dtInicio + 
                "\nData Término: "+ dtTermino +
                "\nQtde. de Funcionários: "+ numFunc);
        System.out.println("\nRegistro\tNome\t\tCargo\t\t\tDepartamento");
        
        while(cont < numFunc){
            System.out.println(funcionarios[cont].getRegistro() +"\t\t"
                    +funcionarios[cont].getNome()+"\t"
                    +funcionarios[cont].getCargo()+"\t\t"
                    +funcionarios[cont++].getDepartamento().getNome());
        }
    }  
}
