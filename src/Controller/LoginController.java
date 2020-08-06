/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Login;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author gm041
 */
public class LoginController {
    
    private Conexao bd;
    
    public LoginController() throws SQLException, ClassNotFoundException {
        
        this.bd = new Conexao();        
    }
    
    public Login logar(String usuario, String senha) throws SQLException, Exception {
     
        Login l = null;
        
        String sql = "SELECT * FROM login WHERE usuario = ? AND senha = ? ";
        
        PreparedStatement stmt = bd.getConn().prepareStatement(sql);
        stmt.setString(1, usuario);
        stmt.setString(2, senha);
        
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {

            l = new Login();
              
            l.setId_login(Integer.parseInt(rs.getString("id_login)")));
        }

        stmt.close();
        
        return l;        
    }
}
