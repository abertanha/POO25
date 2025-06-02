package fatec.poo.control;

import fatec.poo.model.Hospede;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author shenmue
 */
public class DaoHospede {
    private Connection conn;
    
    public DaoHospede(Connection conn){
        this.conn = conn;
    }
    
    public void inserir(Hospede hospede) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("INSERT INTO tblHospede(Cpf_Hospede, Nome_Hospede, Endereco_Hospede, "+
                                        "Telefone_Hospede, TaxaDesconto_Hospede) VALUES(?,?,?,?,?)");
            ps.setString(1, hospede.getCpf());
            ps.setString(2, hospede.getNome());
            ps.setString(3, hospede.getEndereco());
            ps.setString(4, hospede.getTelefone());
            ps.setDouble(5, hospede.getTaxaDesconto());
            
            ps.execute();
        } catch (SQLException ex){
            System.out.println(ex.toString());
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
    public void alterar(Hospede hospede) {
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("UPDATE tblHospede SET Nome_Hospede = ?, Endereco_Hospede = ?, " +
                                        "Telefone_Hospede = ?, TaxaDesconto_Hospede = ?" +
                                        "WHERE Cpf_Hospede = ? ");
            ps.setString(1, hospede.getNome());
            ps.setString(2, hospede.getEndereco());
            ps.setString(3, hospede.getTelefone());
            ps.setDouble(4, hospede.getTaxaDesconto());
            ps.setString(5, hospede.getCpf());
            
            ps.execute();            
        }catch(SQLException ex) {
            System.out.println(ex.toString());
        }finally {
            try{
                if (ps != null) ps.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    public Hospede consultar(String cpf) {
        Hospede hospede = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tblHospede WHERE Cpf_Hospede = ?");
            ps.setString(1, cpf);
            rs = ps.executeQuery();
            
            if(rs.next()){
                hospede = new Hospede(rs.getString("Cpf_Hospede"), rs.getString("Nome_Hospede"));
                hospede.setEndereco(rs.getString("Endereco_Hospede"));
                hospede.setTelefone(rs.getString("Telefone_Hospede"));
                hospede.setTaxaDesconto(rs.getDouble("TaxaDesconto_Hospede"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
            } catch (SQLException e){
                System.out.println(e.toString());
            }
        }
        
        return hospede;
    }
    public void excluir(Hospede hospede){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("DELETE FROM tblHospede WHERE Cpf_Hospede = ?");
            ps.setString(1, hospede.getCpf());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } finally {
            try {
                if (ps != null) ps.close();
            } catch(SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
}
