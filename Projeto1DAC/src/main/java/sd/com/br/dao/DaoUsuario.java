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
import sd.com.br.beans.Usuario;

/**
 *
 * @author Sergiod
 */
public class DaoUsuario {
    
    EntityManager entity = Persistence.createEntityManagerFactory("jdbc:projeto1dac").createEntityManager();
    
    
    public Usuario login(String email, String senha){
        
        Query query =  entity.createQuery("SELECT u FROM Usuario u WHERE u.email = :email AND u.senha = :senha ");
              query.setParameter("email", email);
              query.setParameter("senha", senha);
        
        List<Usuario> u = query.getResultList();
        
        if(u.size() > 0){
           return u.get(0);
        } 
        
        return null;
        
    }
    
    
}
