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
import sd.com.br.beans.Cidade;
import sd.com.br.beans.CidadePK;

/**
 *
 * @author Sergiod
 */
public class DaoCidade {
    
    EntityManager entity = Persistence.createEntityManagerFactory("jdbc:projeto1dac").createEntityManager();
    
    public Cidade pesquisarCidade(String nome, String estado){
        CidadePK cidadePK = new CidadePK(nome, estado);
        return entity.find(Cidade.class, cidadePK);
    }
    
    
    public Cidade atualizarObjCidade(Cidade cidade){
        entity.getTransaction().begin();
        entity.refresh(cidade);
        entity.getTransaction().commit();
        
        return cidade;
    }
    

    
}
