import fatec.poo.model.*;

/**
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,
                                                            "Pedro Silveira",
                                                            "14/05/1978",
                                                            15.80);
        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020,
                                                                  "Ana Beatriz", 
                                                                  "22/10/1997",
                                                                  600.0);
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, 
                                                                      "Joao Mendes",
                                                                      "10/12/1975",
                                                                      10);
        
        Departamento dep1 = new Departamento("CP", "Compras");
        Departamento dep2 = new Departamento("VD", "Vendas");
        Projeto proj1 = new Projeto(1532, "Refatoração do código XYZ");
        proj1.setDtInicio("26/04/2025");
        proj1.setDtTermino("31/05/2025");
        
        
        funcHor.setCargo("Programador");
        funcCom.setCargo("Vendedor");                //dp2
        funcMen.setCargo("Aux. Admin"); //dp1
     
        //Estabelece a associação entre um objeto da classse FuncionárioHorista
        //com um objeto da classe Departamento
        funcHor.setDepartamento(dep1);
        System.out.println("O funcionario horista "+funcHor.getNome()+ " trabalha no departamento de "+ funcHor.getDepartamento().getNome());
        
        //Estabelece a associação entre um objeto da classse FuncionárioMensalista
        //com um objeto da classe Departamento
        funcMen.setDepartamento(dep1);
        System.out.println("O funcionario mensalista "+funcMen.getNome()+ " trabalha no departamento de "+ funcMen.getDepartamento().getNome());
    
        //Estabelece a associação entre um objeto da classse FuncionárioComissionado
        //com um objeto da classe Departamento
        funcCom.setDepartamento(dep2);
        System.out.println("O funcionario comissionado "+funcCom.getNome()
                + " trabalha no departamento de "
                + funcCom.getDepartamento().getNome());
    
        //Estabelece a associação entre um objeto da classe Departamento com
        //um objeto das classes FuncionarioHorista e FuncionarioMensalista
        dep1.addFuncionario(funcHor);
        dep1.addFuncionario(funcMen);
            
        //Estabelece a associação entre um objeto da classe Departamento com
        //um objeto da classe FuncionarioComissionado
        dep2.addFuncionario(funcCom);

        // Listando funcionários do departamento 1
        dep1.listarFuncionarios();
                
        // Listando funcionários do departamento 2
        dep2.listarFuncionarios();
        
        
        // Atribuindo funcionários ao projeto 1
        proj1.addFuncionario(funcHor);
        proj1.addFuncionario(funcCom);
        proj1.addFuncionario(funcMen);
        
        // Listando funcionários do projeto 1
        proj1.listarFuncionarios();
        
    }    
}
