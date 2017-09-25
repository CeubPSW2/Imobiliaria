/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imobiliaria;

import java.util.List;
import org.hibernate.Query;
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
        
        Funcionario f = new Funcionario("Targino");
        f.setImovelVenda("QNL 34", "Brasília", "DF");
        f.setImovelAluguel("QND 30 LT 3", "Taguatinga", "DF");
        f.setImovelAluguel("QND 32 LT 1", "Taguatinga", "DF");
//        List<Funcionario> funcionarios = null;
//        List<Imovel> imoveis = null;
        
        try{
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();            
            
            session.beginTransaction();
            
//            String hql = "SELECT v FROM Venda v , Imovel i ";
//            hql        += "WHERE i.funcionario.id = :identificacao";
//            
//            Query query = session.createQuery(hql);
//            
//            query.setParameter("identificacao", 5);
//            
//            imoveis = query.list();      
//            
//            Funcionario f = (Funcionario)session.get(Funcionario.class, 5);

              session.save(f);
              
            session.getTransaction().commit();            
        }catch(Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally{
            session.close();
            sf.close();            
        }
        
//        for (Imovel i : imoveis){
//            System.out.println( i.getEndereco() + " " + i.getFuncionario().getId());;            
//        }
        
       
        
    }
    
}
