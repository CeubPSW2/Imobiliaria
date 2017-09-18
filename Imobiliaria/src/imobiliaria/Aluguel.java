/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imobiliaria;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;


/**
 *
 * @author Alexandre.Torres
 */
@Entity
public class Aluguel extends Imovel{

    private double valor;
    private int mesInicio;
    
    public Aluguel(){}
    public Aluguel(String endereco, String cidade, String estado, double valor, Funcionario f){
        super(endereco, cidade, estado, f);
        this.valor = valor;
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int month = cal.get(Calendar.MONTH);
        this.mesInicio = month;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getMesInicio() {
        return mesInicio;
    }

    public void setMesInicio(int mesInicio) {
        this.mesInicio = mesInicio;
    }

  
    
    
    
}
