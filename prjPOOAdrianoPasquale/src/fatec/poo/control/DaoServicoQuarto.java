package fatec.poo.control;

import fatec.poo.model.ServicoQuarto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author shenmue
 */
public class DaoServicoQuarto {
    
    private Connection conn;

    public DaoServicoQuarto(Connection conn) {
        this.conn = conn;
    }
    public void inserir(ServicoQuarto servicoQuarto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tblServicoQuarto(Codigo_ServQuarto, Descricao_ServQuarto, Valor_ServQuarto) VALUES(?,?,?)");
            ps.setInt(1, servicoQuarto.getCodigo());
            ps.setString(2, servicoQuarto.getDescricao());
            ps.setDouble(3, servicoQuarto.getValor());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir serviço de quarto: " + ex.toString());
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
    public void alterar(ServicoQuarto servicoQuarto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tblServicoQuarto SET Descricao_ServQuarto = ?, Valor_ServQuarto = ? " +
                                        "WHERE Codigo_ServQuarto = ?");

            ps.setString(1, servicoQuarto.getDescricao());
            ps.setDouble(2, servicoQuarto.getValor());
            ps.setInt(3, servicoQuarto.getCodigo());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar serviço de quarto: " + ex.toString());
        } finally {
            try {
                if (ps != null) ps.close();
            } catch (SQLException e) {
                System.out.println("Erro ao fechar PreparedStatement: " + e.toString());
            }
        }
    }
    public ServicoQuarto consultar(int codigo) {
        ServicoQuarto sq = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tblServicoQuarto WHERE Codigo_ServQuarto = ?");
            ps.setInt(1, codigo);
            rs = ps.executeQuery();

            if (rs.next()) {
                sq = new ServicoQuarto(rs.getInt("Codigo_ServQuarto"), rs.getString("Descricao_ServQuarto"));
                sq.setValor(rs.getDouble("Valor_ServQuarto")); 
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar serviço de quarto: " + ex.toString());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
            } catch (SQLException e) {
                System.out.println("Erro ao fechar recursos: " + e.toString());
            }
        }
        return sq;
    }
    public void excluir(ServicoQuarto servicoQuarto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tblServicoQuarto WHERE Codigo_ServQuarto = ?");
            ps.setInt(1, servicoQuarto.getCodigo());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir serviço de quarto: " + ex.toString());
        } finally {
            try {
                if (ps != null) ps.close();
            } catch (SQLException e) {
                System.out.println("Erro ao fechar PreparedStatement: " + e.toString());
            }
        }
    }
}
