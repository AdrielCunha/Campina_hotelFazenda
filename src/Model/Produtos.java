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
public class Produtos {
    
    private int id_produto;
    private String nome, descricao;
    private float valor;
    
    public void setId_produto(int _id) throws Exception {        
        if (_id > 0) {
            this.id_produto= _id;
        } else {
            throw new Exception ("ID não pode ser menor que zero");
        }   
    }    
    public int getId_produto() {
        return this.id_produto;
    }
    
    public void setNome(String _n) {
            this.nome = _n;   
    }    
    public String getNome() {
        return this.nome;
    }
    
    public void setDescricao(String _d) {
            this.descricao = _d;   
    }    
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setValor(float _v) {
        this.valor = _v;
    }
    public float getValor() {
        return this.valor;
    }
}
