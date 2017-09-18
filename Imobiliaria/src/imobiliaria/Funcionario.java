/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imobiliaria;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;

/**
 *
 * @author Alexandre.Torres
 */
@Entity
public class Funcionario {
    @Id
    @GeneratedValue
    private int id;
    
    private String nome;
    
    @OneToMany (mappedBy = "funcionario", cascade= CascadeType.ALL)
    private List<Imovel> imoveis = new ArrayList<>();
            
    public Funcionario(){};
    
    public Funcionario(String nome){
        this.nome = nome;
    }

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(List<Imovel> imoveis) {
        this.imoveis = imoveis;
    }
    
    public void setImovelVenda( String endereco, String cidade, String estado){
        Imovel i = new Venda(  0, 0, endereco, cidade, estado, this);
        imoveis.add(i);
    }
    
    public void setImovelAluguel( String endereco, String cidade, String estado){
        Imovel i = new Aluguel(  endereco, cidade, estado, 0, this);
        imoveis.add(i);
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
