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
public class Clientes {
    
        private int id_cliente;
        private String nome, cpf, rg;
        private Date datanascimento;
    
    public void setId_cliente(int _id) throws Exception {
        
        if (_id > 0) {
            this.id_cliente= _id;
        } else {
            throw new Exception ("ID não pode ser menor que zero");
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
    
    public void setCpf(String _cpf) {
            this.cpf = _cpf;   
    }   
    public String getCpf() {
        return this.cpf;
    }
    
    public void setRg(String _rg) {
            this.rg = _rg;   
    }    
    public String getRg() {
        return this.rg;
    }    
    
}
