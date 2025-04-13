import fatec.poo.model.*;
import java.util.Scanner;

/**
 * @author shenmue
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Entre os dados do Curso\n");
        System.out.println("Sigla: ");
        String sigla = entrada.next();
        System.out.println("Descrição: ");
        String descricao = entrada.next();
        System.out.println("Carga Horária: ");
        String cargaHoraria = entrada.next();
        
        Curso objCur = new Curso(sigla, descricao, cargaHoraria);
        
        System.out.println("Nome: ");
        objCur.setNome(entrada.next());
        
        System.out.println("\nEntre os dados do Professor\n");
        System.out.println("Registro Funcional: ");
        String regFunc = entrada.next();
        System.out.println("Nome: ");
        String nomProf = entrada.next();
        
        Professor objProf = new Professor(regFunc, nomProf);
        
        System.out.println("\nEntre os dados da Turma\n");
        System.out.println("Sigla: ");
        String sigTur = entrada.next();
        System.out.println("Quantidade de Vagas: ");
        int qtdeVagas = entrada.nextInt();
        
        Turma objTur = new Turma(sigTur, qtdeVagas);
        
        // relacões entre curso - turma - professor
        objTur.setCurso(objCur); // Associa o curso à turma
        objTur.setProfessor(objProf); //associa o professor à turma
        objProf.addTurma(objTur); // adiciona uma turma ao professor(1..*)
        objCur.setTurma(objTur); // associa uma turma ao curso

        
        //definição da matriz de objetos da classe Aluno
        Aluno[] alunos = new Aluno[10];
        

        System.out.println("\nEntre os dados do Aluno\n");
        int cont = 0;
        while(cont < 10){
            System.out.println("Registro Acadêmico: ");
            String ra = entrada.next();
            System.out.println("Nome do aluno: ");
            String nomeAlu = entrada.next();
            
            Aluno aluno = new Aluno(ra, nomeAlu);
            alunos[cont++] = aluno;
            objTur.addAluno(aluno);
        }
        
        objTur.listarAlunos();
 
    }
    
}
