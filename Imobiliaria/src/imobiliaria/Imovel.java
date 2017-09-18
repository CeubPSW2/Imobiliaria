/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imobiliaria;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

/**
 *
 * @author Alexandre.Torres
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED )
public abstract class Imovel {
    
    @Id
    @GeneratedValue
    private int id;
    private int situacao;
    private String endereco;
    private String cidade;
    private String estado;
    
    @ManyToOne
    private Funcionario funcionario;
    
    public static final int DISPONIVEL = 1;
    public static final int ALUGADO = 2;
    public static final int VENDIDO = 3;

    public Imovel(){}
    
    public Imovel(String endereco, String cidade, String estado, Funcionario f) {
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.situacao = DISPONIVEL;
        funcionario = f;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
