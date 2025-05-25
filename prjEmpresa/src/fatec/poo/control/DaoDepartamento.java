
package fatec.poo.control;

import fatec.poo.model.Departamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DaoDepartamento {
    private Connection conn;

    public DaoDepartamento(Connection conn) {
        this.conn = conn;
    }
    
    public Departamento consultar(String sigla){
        Departamento objDept = null;
        
        PreparedStatement ps;
        try{
            ps = conn.prepareStatement("SELECT * from tbldepartamento where SIGLA_DEP = ?");
            
            ps.setString(1, sigla);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next() == true){
                objDept = new Departamento(rs.getString("SIGLA_DEP"), rs.getString("NOME_DEP"));
                objDept.setNome(rs.getString("NOME_DEP"));
            }
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
        return(objDept);
    }
    
    public void inserir(Departamento objDep){
        PreparedStatement ps;
        
        try{
            ps = conn.prepareStatement("INSERT INTO tbldepartamento(SIGLA_DEP, NOME_DEP) VALUES(?, ?)");
            ps.setString(1, objDep.getSigla());
            ps.setString(2, objDep.getNome());
            
            ps.execute();
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
    
    }
    
    public void alterar(Departamento objDep){
    PreparedStatement ps;
    
    try{
        ps = conn.prepareStatement("UPDATE tblDepartamento set SIGLA_DEP = ?,"
                + "NOME_DEP = ?");
        ps.setString(1, objDep.getSigla());
        ps.setString(2, objDep.getNome());
        
        ps.execute();
    }
    catch(SQLException ex){
        System.out.println(ex.toString());   
    }
    }
    
    public void excluir(Departamento objDep){
        PreparedStatement ps;
        
        try{
            ps = conn.prepareStatement("DELETE FROM tblDepartamento Where SIGLA_DEP = ?");
            ps.setString(1, objDep.getSigla());
            
            ps.execute();
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
    
}