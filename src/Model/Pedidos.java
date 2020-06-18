/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author gm041
 */
public class Pedidos {
    
        private int id_pedido, id_produto, id_reserva;
        private String observacao;
        private Date data;
        private Time hora;
        private float valor_total;
        
    public void setId_pedido(int _id) throws Exception {        
        if (_id > 0) {
            this.id_pedido= _id;
        } else {
            throw new Exception ("ID não pode ser menor que zero");
        }   
    }    
    public int getId_pedido() {
        return this.id_pedido;
    }
    
    public void setId_produto(int _ip) throws Exception {        
        if (_ip > 0) {
            this.id_produto= _ip;
        } else {
            throw new Exception ("ID não pode ser menor que zero");
        }   
    }    
    public int getId_produto() {
        return this.id_produto;
    }
    
    public void setId_reserva(int _ir) throws Exception {        
        if (_ir > 0) {
            this.id_reserva= _ir;
        } else {
            throw new Exception ("ID não pode ser menor que zero");
        }   
    }    
    public int getId_reserva() {
        return this.id_reserva;
    }
    
    public void setObservacao(String _o) {
            this.observacao = _o;   
    }    
    public String getObservacao() {
        return this.observacao;
    }
    
    public void setData(Date _d) {
            this.data = _d;   
    }    
    public Date getData() {
        return this.data;
    }
    
    public void setHora(Time _h) {
            this.hora = _h;   
    }    
    public Date getHora() {
        return this.hora;
    }
    
    public void setValor_total(float _vt) {
        this.valor_total = _vt;
    }
    public float getValor_total() {
        return this.valor_total;
    }
}
