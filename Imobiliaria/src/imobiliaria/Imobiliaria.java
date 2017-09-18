/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imobiliaria;

import org.hibernate.SessionFactory;
import org.hibernate.Session;

/**
 *
 * @author Alexandre.Torres
 */
public class Imobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SessionFactory sf = null;
        Session session = null;
        
        Funcionario f = new Funcionario("Romero");
        //f.setImovelVenda("SHIS QL 3", "Brasília", "DF");
        //f.setImovelAluguel("QND 29 LT 3", "Taguatinga", "DF");
        
        try{
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();            
            
            session.beginTransaction();
            session.save( f );
            session.getTransaction().commit();            
        }catch(Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally{
            session.close();
            sf.close();            
        }
        
       
        
    }
    
}
