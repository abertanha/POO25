package fatec.poo.control;

import fatec.poo.model.Recepcionista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * @author shenmue
 */
public class DaoRecepcionista {
    
    private Connection conn;

    public DaoRecepcionista(Connection conn) {
        this.conn = conn;
    }
    public void inserir(Recepcionista recepcionista) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tblRecepcionista(RegFunc_Recep, Nome_Recep, Endereco_Recep, " +
                                           "Telefone_Recep, Turno_Recep) VALUES(?,?,?,?,?)");
            ps.setInt(1, recepcionista.getRegFunc());
            ps.setString(2, recepcionista.getNome());
            ps.setString(3, recepcionista.getEndereco());
            ps.setString(4, recepcionista.getTelefone());
            ps.setString(5, recepcionista.getTurno());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir recepcionista: " + ex.toString());
        } finally {
            try {
                // encerrando recursos de banco para evitar problemas de perfomance
                // testando se é diferente de null para evitar NullPointerException
                // é preciso testar pois finally SEMPRE é executado.
                if (ps != null) ps.close();
            } catch (SQLException e) {
                System.out.println("Erro ao fechar PreparedStatement: " + e.toString());
            }
        }
    }
    public void alterar(Recepcionista recepcionista) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tblRecepcionista SET Nome_Recep = ?, Endereco_Recep = ?, " +
                                           "Telefone_Recep = ?, Turno_Recep = ? " +
                                           "WHERE RegFunc_Recep = ?");

            ps.setString(1, recepcionista.getNome());
            ps.setString(2, recepcionista.getEndereco());
            ps.setString(3, recepcionista.getTelefone());
            ps.setString(4, recepcionista.getTurno());
            ps.setInt(5, recepcionista.getRegFunc());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar recepcionista: " + ex.toString());
        } finally {
            try {
                if (ps != null) ps.close();
            } catch (SQLException e) {
                System.out.println("Erro ao fechar PreparedStatement: " + e.toString());
            }
        }
    }
    public Recepcionista consultar(int regFunc) {
        Recepcionista recepcionista = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tblRecepcionista WHERE RegFunc_Recep = ?");
            ps.setInt(1, regFunc);
            rs = ps.executeQuery();

            if (rs.next()) {
                recepcionista  = new Recepcionista(rs.getInt("RegFunc_Recep"), rs.getString("Nome_Recep"));
                recepcionista.setEndereco(rs.getString("Endereco_Recep"));
                recepcionista.setTelefone(rs.getString("Telefone_Recep"));
                recepcionista.setTurno(rs.getString("Turno_Recep")); 
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar recepcionista: " + ex.toString());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
            } catch (SQLException e) {
                System.out.println("Erro ao fechar recursos: " + e.toString());
            }
        }
        return recepcionista;
    }
    public void excluir(Recepcionista recepcionista) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tblRecepcionista WHERE RegFunc_Recep = ?");
            ps.setInt(1, recepcionista.getRegFunc());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir recepcionista: " + ex.toString());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar PreparedStatement: " + e.toString());
            }
        }
    }
}
