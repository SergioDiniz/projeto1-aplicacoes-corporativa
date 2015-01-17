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
import sd.com.br.beans.Administrador;

/**
 *
 * @author SergioD
 */
public class DaoAdmin {
    EntityManager entity = Persistence.createEntityManagerFactory("jdbc:projeto1dac").createEntityManager();        
    
    public Administrador login(String email, String senha){
        
        Query query =  entity.createQuery("SELECT a FROM Administrador a WHERE a.email = :email AND a.senha = :senha ");
              query.setParameter("email", email);
              query.setParameter("senha", senha);
        
        List<Administrador> a = query.getResultList();
        
        if(a.size() > 0){
           return a.get(0);
        } 
        
        return null;
        
    }    
}
