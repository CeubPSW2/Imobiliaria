/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import java.util.HashMap;
import model.Aluno;

/**
 *
 * @author Alexandre.Torres
 */
public class AlunoUtil {
    
    public static HashMap<Integer, Aluno> obtemAlunos(){
        HashMap<Integer, Aluno> alunos = new HashMap<>();
        
        Aluno a = new Aluno( 232425, "Pelé");
        // chave=ra, objeto=aluno
        alunos.put(a.getRa(), a);
        alunos.put( 232426, new Aluno(232426, "Tostão"));
        alunos.put( 232427, new Aluno(232427, "Garrincha"));
        alunos.put( 232428, new Aluno(232428, "Carlos Alberto Torres"));
        
        return alunos;
        
    }
    
    public static Aluno obtemAluno( Integer ra){
//        HashMap<Integer, Aluno> alunos = obtemAlunos();
//        Aluno a = alunos.get(ra);
        return obtemAlunos().get(ra);
    }
    
}
