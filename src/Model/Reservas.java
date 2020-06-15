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
public class Reservas {
    
        private int id_reserva, id_agendamento;
        private String status, forma_pagamento;
        private float valor_total;
        
    public void setId_reserva(int _id) throws Exception {        
        if (_id > 0) {
            this.id_reserva= _id;
        } else {
            throw new Exception ("ID não pode ser menor que zero");
        }   
    }    
    public int getId_reserva() {
        return this.id_reserva;
    }
    
    public void setId_agendamento(int _ia) throws Exception {        
        if (_ia > 0) {
            this.id_agendamento= _ia;
        } else {
            throw new Exception ("ID não pode ser menor que zero");
        }   
    }    
    public int getId_agendamento() {
        return this.id_agendamento;
    }
    
    public void setStatus(String _st) {
            this.status = _st;   
    }    
    public String getStatus() {
        return this.status;
    }
    
    public void setForma_pagamento(String _fpg) {
            this.forma_pagamento = _fpg;   
    }    
    public String getForma_pagamento() {
        return this.forma_pagamento;
    }
    
    public void setValor_total(float _vt) {
        this.valor_total = _vt;
    }
    public float getValor_total() {
        return this.valor_total;
    }
}
