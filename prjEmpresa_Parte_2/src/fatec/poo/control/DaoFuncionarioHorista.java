package fatec.poo.control;

import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioHorista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dimas
 */
public class DaoFuncionarioHorista {
    private Connection conn;
    
    public DaoFuncionarioHorista(Connection conn) {
         this.conn = conn;
    }
    
     public  FuncionarioHorista consultar (int registro) {
        FuncionarioHorista fh = null;         
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tblFuncHorista " +
                                       "where Registro_FuncHor = ?");
            
            ps.setInt(1, registro);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next()) {
                fh = new FuncionarioHorista(registro,
                                            rs.getString("Nome_FuncHor"),
                                            rs.getString("DtAdmissao_FuncHor"),
                                            rs.getDouble("ValHorTrab_FuncHor"));
                fh.setCargo(rs.getString("Cargo_FuncHor"));
                fh.setSexo(rs.getString("Sexo_FuncHor"));
                
                //Consultando o objeto Departamento associado ao objeto
                //FuncionarioHorista e estabelecendo a associação binária
                //entre eles
                Departamento d = new DaoDepartamento(conn).consultar(rs.getString("Sigla_Dep"));
                d.addFuncionario(fh);
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (fh);
    }   
     
    public void inserir(FuncionarioHorista fh) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tblFuncHorista(Registro_FuncHor," +
                                       "Nome_FuncHor, Sexo_FuncHor, DtAdmissao_FuncHor," +
                                       "Cargo_FuncHor, ValHorTrab_FuncHor," +
                                       "Sigla_Dep) VALUES(?,?,?,?,?,?,?)");
            ps.setInt(1,fh.getRegistro());
            ps.setString(2,fh.getNome());
            ps.setString(3, fh.getSexo());
            ps.setString(4,fh.getDtAdmissao());
            ps.setString(5,fh.getCargo());
            ps.setDouble(6,fh.getValHorTrab());
            ps.setString(7,fh.getDepartamento().getSigla());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    } 
    
    public void alterar(FuncionarioHorista fh) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tblFuncHorista set Nome_FuncHor = ?," +
                                       "Sexo_FuncHor = ?, DtAdmissao_FuncHor = ?, Cargo_FuncHor = ?,"  +
                                       "ValHorTrab_FuncHor = ?, Sigla_Dep = ? " +                                       
                                       "where Registro_FuncHor = ?");
            
            ps.setString(1, fh.getNome());
            ps.setString(2, fh.getSexo());
            ps.setString(3, fh.getDtAdmissao());
            ps.setString(4, fh.getCargo());
            ps.setDouble(5, fh.getValHorTrab());
            ps.setString(6, fh.getDepartamento().getSigla());
            ps.setInt(7, fh.getRegistro());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void excluir(FuncionarioHorista fh) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tblFuncHorista where Registro_FuncHor = ?");
            
            ps.setInt(1, fh.getRegistro());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
