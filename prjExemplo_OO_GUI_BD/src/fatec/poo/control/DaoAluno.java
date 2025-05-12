package fatec.poo.control;

import fatec.poo.model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dimas
 */
public class DaoAluno {
    private Connection conn;
    
    public DaoAluno(Connection conn) {
         this.conn = conn;
    }    
    
    public Aluno consultar (int ra) {
        Aluno objAlu = null;         
       
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("SELECT * from tblAluno where Ra_Alu = ?");
            
            ps.setInt(1, ra);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                objAlu = new Aluno(rs.getInt("Ra_Alu"),rs.getString("Nome_Alu"));
                objAlu.setNota1(rs.getDouble("Nota1_Alu"));
                objAlu.setNota2(rs.getDouble("Nota2_Alu"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return(objAlu);
    }    
     
    public void inserir(Aluno objAlu) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("INSERT INTO tblAluno(ra_Alu, Nome_Alu, Nota1_Alu, Nota2_Alu) VALUES(?,?,?,?)");
            ps.setInt(1, objAlu.getRa());
            ps.setString(2, objAlu.getNome());
            ps.setDouble(3, objAlu.getNota1());
            ps.setDouble(4, objAlu.getNota2());
                      
            ps.execute(); //envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }  
    
    public void alterar(Aluno aluno) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE tblAluno set Nome_Alu = ?, " +
                                       "Nota1_Alu = ?, " +
                                       "Nota2_Alu = ? " +
                                       "where Ra_Alu = ?");
            
            ps.setString(1, aluno.getNome());
            ps.setDouble(2, aluno.getNota1());
            ps.setDouble(3, aluno.getNota2());
            ps.setInt(4, aluno.getRa());
           
            ps.execute(); //Envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void excluir(Aluno aluno) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE FROM tblAluno where Ra_Alu = ?");
            
            ps.setInt(1, aluno.getRa());
                      
            ps.execute(); //Envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
