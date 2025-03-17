import fatec.poo.model.Professor;
import fatec.poo.model.Aluno;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {       
       //Instanciação de um objeto da classe Aluno
       Aluno objAlu = new Aluno(1010,
                                "Carlos Silveira", 
                                "15/03/1978");
       Professor objPro = new Professor(1253, "Mateus da Silva","23/10/78");
    
      //passagem de mensagens   
      objAlu.setMensalidade(1500);
      System.out.println("Registro escolar: " + objAlu.getRegEscolar());
      System.out.println("Nome: " + objAlu.getNome());
      System.out.println("Data de Nascimento: " + objAlu.getDataNascimento());
      System.out.println("Mensalidade: " + objAlu.getMensalidade()); 
      
      objPro.setSalario(2000);
      
      System.out.println("Registro funcional: "+objPro.getRegFuncional());
      System.out.println("Nome: "+ objPro.getNome());
      System.out.println("Data de Nascimento"+ objPro.getDataNascimento());
      System.out.println("Salário: "+objPro.getSalario());
    }
}
