
package br.senai.sc.sisLoja.dao;

import br.senai.sc.sisLoja.modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao extends ConnectionFactory {
    private Connection con;
    
    public ClienteDao(){
        this.con = this.getConnection();
    }
    
    public List<Cliente> listarClientes() throws SQLException{
        String sql = "select * from cliente";
        
        try(PreparedStatement st = this.con.prepareStatement(sql)){
            ResultSet rs = st.executeQuery();
            
            List<Cliente> clientes = new ArrayList<Cliente>();
            
            while(rs.next()){
                Cliente c = new Cliente();
                c.setCodCli(rs.getInt("codCli"));
                c.setNomCli(rs.getString("nomCli"));
                c.setEndCli(rs.getString("endCli"));
                c.setBaiCli(rs.getString("baiCli"));
                c.setComCli(rs.getString("comCli"));
                c.setCepCli(rs.getInt("cepCli"));
                c.setTelCli(rs.getInt("telCli"));
                
                clientes.add(c);
            }
            
            rs.close();
            st.close();
            this.con.close();
            
            return clientes;
        }
    }
}
