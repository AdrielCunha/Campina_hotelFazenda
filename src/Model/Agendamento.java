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
public class Agendamento {
    
        private int id_agendamento, id_quarto, id_cliente;
        private Date data_ck_in, data_ck_out;
        private float sub_total;
        
    public void setId_agendamento(int _id) throws Exception {        
        if (_id > 0) {
            this.id_agendamento= _id;
        } else {
            throw new Exception ("ID não pode ser menor que zero");
        }   
    }    
    public int getId_agendamento() {
        return this.id_agendamento;
    }
    
    public void setId_quarto(int _iq) throws Exception {        
        if (_iq > 0) {
            this.id_quarto= _iq;
        } else {
            throw new Exception ("ID não pode ser menor que zero");
        }   
    }    
    public int getId_quarto() {
        return this.id_quarto;
    }
    
    public void setId_cliente(int _ic) throws Exception {
        
        if (_ic > 0) {
            this.id_cliente= _ic;
        } else {
            throw new Exception ("ID não pode ser menor que zero");
        }   
    }    
    public int getId_cliente() {
        return this.id_cliente;
    }
    
    public void setData_ck_in(Date _dcin) {
            this.data_ck_in = _dcin;   
    }    
    public Date getData_ck_in() {
        return this.data_ck_in;
    }
    
    public void setData_ck_out(Date _dcout) {
            this.data_ck_out = _dcout;   
    }    
    public Date getData_ck_out() {
        return this.data_ck_out;
    }
    
    public void setSub_total(float _st) {
        this.sub_total = _st;
    }
    public float getSub_total() {
        return this.sub_total;
    }
    
}
