/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.com.br.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import sd.com.br.beans.Cidade;

/**
 *
 * @author Sergiod
 */
public class Dao {
    
    EntityManager entity = Persistence.createEntityManagerFactory("jdbc:projeto1dac").createEntityManager();
    
    
    public void salvar(Object object){
        entity.getTransaction().begin();
        entity.persist(object);
        entity.getTransaction().commit();
    }
    
        public void atualizar(Object object){
        entity.getTransaction().begin();
        entity.merge(object);
        entity.getTransaction().commit();
    }

    
    
}
