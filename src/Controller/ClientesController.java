/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Clientes;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author gm041
 */
public class ClientesController {
    
    private Conexao bd;
    
    public ClientesController() throws SQLException, ClassNotFoundException {
        
        this.bd = new Conexao();        
    }
    
    public void insert(Clientes cli) throws SQLException {
        
        PreparedStatement stmt = bd.getConn().prepareStatement("INSERT INTO clientes (nome, data_nasc, rg, cpf) VALUES (?, ?, ?, ?)");
        
        stmt.setString(1, cli.getNome());
        stmt.setDate(2, java.sql.Date.valueOf(cli.getDatanascimento().toString()));
        stmt.setString(3, cli.getRg());
        stmt.setString(4, cli.getCpf());
        
        stmt.execute();
        
        stmt.close();
    }
    
    public void update(Clientes cli) throws SQLException {
        
    }
    
    public void select(Clientes cli) throws SQLException {
        
    }
    
    
    
}
