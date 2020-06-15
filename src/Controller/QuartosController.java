/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Quartos;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author gm041
 */
public class QuartosController {
    
    private Conexao bd;
    
    public QuartosController() throws SQLException, ClassNotFoundException {
        
        this.bd = new Conexao();        
    }
    
    public void insert(Quartos q) throws SQLException {
        
        PreparedStatement stmt = bd.getConn().prepareStatement("INSERT INTO quartos (numero, status, categoria, valor_diaria, qtde_cama_casal, qtde_cama_solteiro) VALUES (?, ?, ?, ?, ?, ?)");
        
        stmt.setInt(1, q.getNumero());
        stmt.setString(2, q.getStatus());
        stmt.setString(3, q.getCategoria());
        stmt.setFloat(4, q.getValor_diaria());
        stmt.setInt(5, q.getQtde_cama_casal());
        stmt.setInt(6, q.getQtde_cama_solteiro());
                
        stmt.execute();
        
        stmt.close();
        
        
    }
    
    public void update(Quartos q) throws SQLException {
        
    }
    
    public void select(Quartos q) throws SQLException {
        
    }
    
}
