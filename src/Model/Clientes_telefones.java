/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author gm041
 */
public class Clientes_telefones {
    
        private int id_telefone, id_cliente;
        private String nome_responsavel, ddd, numero;
    
    public void setId_telefone(int _it) throws Exception {
        
        if (_it > 0) {
            this.id_telefone= _it;
        } else {
            throw new Exception ("ID não pode ser menor que zero");
        }   
    }    
    public int getId_telefone() {
        return this.id_telefone;
    }
    
    public void setId_cliente(int _ic) throws Exception {
        
        if (_ic > 0) {
            this.id_cliente= _ic;
        } else {
            throw new Exception ("ID não pode ser menos que zero");
        }   
    }    
    public int getId_cliente() {
        return this.id_cliente;
    }
    
    public void setNome_responsavel (String _n){
        this.nome_responsavel = _n;
    }
    public String getNome_responsavel() {
        return this.nome_responsavel;
    }
    
    public void setDdd(String _ddd) throws Exception {
         this.ddd= _ddd;  
    }    
    public String getDdd() {
        return this.ddd;
    }
    
    public void setNumero(String _numero) throws Exception {
         this.numero= _numero;  
    }    
    public String getNumero() {
        return this.numero;
    }
    
}
