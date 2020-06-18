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
public class Quartos {
    
        private int id_quarto, numero, qtde_cama_casal, qtde_cama_solteiro;
        private String categoria, status;
        private float valor_diaria;
        
    public void setId_quarto(int _id) throws Exception {        
        if (_id > 0) {
            this.id_quarto= _id;
        } else {
            throw new Exception ("ID não pode ser menor que zero");
        }   
    }    
    public int getId_quarto() {
        return this.id_quarto;
    }
    
    public void setNumero(int _n) {
            this.numero = _n;   
    }    
    public int getNumero() {
        return this.numero;
    }
    
    public void setStatus(String _st) {
            this.status = _st;   
    }    
    public String getStatus() {
        return this.status;
    }
       
    public void setCategoria(String _c) {
            this.categoria = _c;   
    }    
    public String getCategoria() {
        return this.categoria;
    }
            
    public void setValor_diaria(float _v) {
        this.valor_diaria = _v;
    }
    public float getValor_diaria() {
        return this.valor_diaria;
    }
    
     public void setQtde_cama_casal(int _q) {
            this.qtde_cama_casal = _q;   
    }    
    public int getQtde_cama_casal() {
        return this.qtde_cama_casal;
    }
    
     public void setQtde_cama_solteiro(int _q) {
            this.qtde_cama_solteiro = _q;   
    }    
    public int getQtde_cama_solteiro() {
        return this.qtde_cama_solteiro;
    }
}
