package fatec.poo.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import fatec.poo.model.Projeto;

/**
 * @author 0030482321026
 */
public class DaoProjeto {
    private Connection conn;
    
    public DaoProjeto(Connection conn) {
        this.conn = conn;
    }
    public Projeto consultar(int codigo) {
        Projeto objProj = null;
        
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("SELECT * from tblprojeto WHERE codigo_proj = ?");
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                objProj = new Projeto(rs.getInt("codigo_proj"),rs.getString("descricao_proj"));
                objProj.setDtInicio(rs.getString("dtinicio_proj"));
                objProj.setDtTermino(rs.getString("dttermino_proj"));
            }
        }catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
        return (objProj);
    }
    public void inserir (Projeto objProj) {
        PreparedStatement ps;
        
        try {
            ps = conn.prepareStatement("INSERT INTO tblProjeto(codigo_proj, descricao_proj, dtinicio_proj, dttermino_proj) VALUES(?,?,?,?)");
            ps.setInt(1, objProj.getCodigo());
            ps.setString(2, objProj.getDescricao());
            ps.setString(3, objProj.getDtInicio());
            ps.setString(4, objProj.getDtTermino());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(Projeto projeto) {
        PreparedStatement ps;
        
        try {
            ps = conn.prepareStatement("UPDATE tblProjeto SET descricao_proj = ?,"+
                                        "dtinicio_proj = ?, " +
                                        "dttermino_proj = ? " +
                                        "where codigo_proj = ?");
            ps.setString(1, projeto.getDescricao());
            ps.setString(2, projeto.getDtInicio());
            ps.setString(3, projeto.getDtTermino());
            ps.setInt(4, projeto.getCodigo());
            
            ps.execute();
        } catch (SQLException ex){
            System.out.println(ex.toString());
        }
    }
    public void excluir (Projeto projeto) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE FROM tblProjeto WHERE codigo_proj ?");
            
            ps.setInt(1, projeto.getCodigo());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
}
