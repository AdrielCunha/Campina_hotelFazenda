/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author gm041
 */
public class Clientes_dependentes {
    
        private int id_telefone, id_cliente;
        private String nome, rg;
        private Date datanascimento;
    
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
    
    public void setNome(String _n) {
            this.nome = _n;   
    }    
    public String getNome() {
        return this.nome;
    }
    
    public void setDatanascimento(Date _datanasc) {
            this.datanascimento = _datanasc;   
    }    
    public Date getDatanascimento() {
        return this.datanascimento;
    }
    
    public void setRg(String _rg) {
            this.rg = _rg;   
    }    
    public String getRg() {
        return this.rg;
    }
}
