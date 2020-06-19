/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gm041
 */
public class Conexao {

    // comentario teste 
    private static final String host = "localhost";
    private static String database = "bd_fisico1";
    private static String usuario = "root";
    private static String senha = "";
    private static String url = "jdbc:mysql://" + host + "/" + database;
    
    private Connection conn;
     
    public Conexao() throws SQLException, ClassNotFoundException
    {        
        Class.forName("com.mysql.jdbc.Driver");

        conn = (Connection) DriverManager.getConnection(url, usuario, senha);        
    }
    
    
    
    public Connection getConn() {
        return this.conn;
    }
     
    
    
    public void fecharConexao() throws SQLException
    {        
       conn.close();
    }
    
    
}
