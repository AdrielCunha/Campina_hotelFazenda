/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campina_hotelfazenda;
import Controller.Conexao;
import View.loginScreen;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author cunha
 */
public class Campina_hotelFazenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        loginScreen login = new loginScreen();
        login.setVisible(true);
        
        try { 
            Conexao c = new Conexao();
            
            c.getConn();
            
        } catch (SQLException ex) {
            System.out.println("erro: " + ex.getMessage());
            
            Logger.getLogger(Campina_hotelFazenda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Campina_hotelFazenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
