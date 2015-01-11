/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.com.br.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import sd.com.br.beans.Prefeitura;

/**
 *
 * @author Sergiod
 */
public class DaoPrefeitura {
    
    EntityManager entity = Persistence.createEntityManagerFactory("jdbc:projeto1dac").createEntityManager();
    
    public Prefeitura login(String email, String senha){
        
        Query query =  entity.createQuery("SELECT p FROM Prefeitura p WHERE p.email = :email AND p.senha = :senha ");
              query.setParameter("email", email);
              query.setParameter("senha", senha);
              
    
        List<Prefeitura> p = query.getResultList();
        
        if(p.size() > 0){
            return p.get(0);
        }

        return null;
        
    }
    
    
}
