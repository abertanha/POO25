package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import fatec.poo.model.Departamento;
import java.util.ArrayList;

/**
 *
 * @author Dimas
 */
public class DaoDepartamento {

    private Connection conn;
    
    public DaoDepartamento(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Departamento departamento) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbldepartamento(Sigla_Dep, Nome_Dep) VALUES(?,?)");
            ps.setString(1, departamento.getSigla());
            ps.setString(2, departamento.getNome());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Departamento departamento) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbldepartamento set Nome_Dep = ? " +
                                                 "where Sigla_Dep = ?");
            
            ps.setString(1, departamento.getNome());
            ps.setString(2, departamento.getSigla());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public  Departamento consultar (String sigla) {
        Departamento d = null;         
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tblDepartamento where " +
                                                 "Sigla_Dep = ?");
            
            ps.setString(1, sigla);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next()) {
                d = new Departamento (sigla, rs.getString("Nome_Dep"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (d);
    }    
     
    public void excluir(Departamento departamento) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbldepartamento where Sigla_Dep = ?");
            
            ps.setString(1, departamento.getSigla());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
     
     public ArrayList<Departamento> consultarDepartamentos(){
        ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
        
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tblDepartamento order by nome_dep");
                        
            ResultSet rs = ps.executeQuery();
           
            while(rs.next()){
                departamentos.add(new Departamento (rs.getString("Sigla_Dep"),
                                                    rs.getString("Nome_Dep")));                
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }        
        return departamentos;
     }
}





