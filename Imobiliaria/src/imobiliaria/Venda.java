/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imobiliaria;

/**
 *
 * @author Alexandre.Torres
 */
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
public class Venda extends Imovel{
    
    private double valorVenda;
    private double comissao;

    public Venda(double valorVenda, double comissao, String endereco, String cidade, String estado, Funcionario f) {
        super(endereco, cidade, estado, f);
        this.valorVenda = valorVenda;
        this.comissao = comissao;
    }
    
    public Venda(){}

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    
    
}
