package fatec.poo.control;

import fatec.poo.model.Quarto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author shenmue
 */
public class DaoQuarto {
    private Connection conn;

    public DaoQuarto(Connection conn) {
        this.conn = conn;
    }
    
    public void inserir(Quarto quarto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tblQuarto(Numero_Quarto, Tipo_Quarto, ValorDiaria_Quarto, " +
                                           "Situacao_Quarto, TotalFaturado_Quarto) VALUES(?,?,?,?,?)");
            ps.setInt(1, quarto.getNumero());
            ps.setString(2, quarto.getTipo());
            ps.setDouble(3, quarto.getValorDiaria());
            ps.setBoolean(4, quarto.getSituacao());
            ps.setDouble(5, quarto.getTotalFaturado());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir quarto: " + ex.toString());
        } finally {
            try {
                // encerrando recursos de banco para evitar problemas de perfomance
                // testando se é diferente de null para evitar NullPointerException
                // é preciso testar pois finally SEMPRE é executado.
                if (ps != null) ps.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    public void alterar(Quarto quarto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tblQuarto SET Tipo_Quarto = ?, ValorDiaria_Quarto = ?, " +
                                           "Situacao_Quarto = ?, TotalFaturado_Quarto = ? " +
                                           "WHERE Numero_Quarto = ?");

            ps.setString(1, quarto.getTipo());
            ps.setDouble(2, quarto.getValorDiaria());
            ps.setBoolean(3, quarto.getSituacao());
            ps.setDouble(4, quarto.getTotalFaturado());
            ps.setInt(5, quarto.getNumero());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar quarto: " + ex.toString());
        } finally {
            try {
                if (ps != null) ps.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    public Quarto consultar(int numero) {
        Quarto quarto = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tblQuarto WHERE Numero_Quarto = ?");
            ps.setInt(1, numero);
            rs = ps.executeQuery();

            if (rs.next()) {
                quarto = new Quarto(rs.getInt("Numero_Quarto"), 
                               rs.getString("Tipo_Quarto"),
                               rs.getDouble("ValorDiaria_Quarto"));
                quarto.setSituacao(rs.getBoolean("Situacao_Quarto")); 
                quarto.setTotalFaturado(rs.getDouble("TotalFaturado_Quarto"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar quarto: " + ex.toString());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return quarto;
    }
    public void excluir(Quarto quarto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tblQuarto WHERE Numero_Quarto = ?");
            ps.setInt(1, quarto.getNumero());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir quarto: " + ex.toString());
        } finally {
            try {
                if (ps != null) ps.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
}
