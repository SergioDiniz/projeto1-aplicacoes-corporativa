/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.com.br.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import sd.com.br.beans.Denuncia;

/**
 *
 * @author Sergiod
 */
public class DaoDenuncia {
    
    EntityManager entity = Persistence.createEntityManagerFactory("jdbc:projeto1dac").createEntityManager();
    
    
    public List<Denuncia> pesquisarPorCidade(String cidade, String estado){
        Query query =  entity.createQuery("SELECT d FROM Denuncia d WHERE d.cidade.CidadePK.nomeCidade = :cidade AND d.cidade.CidadePK.siglaEstado = :estado");
              query.setParameter("cidade", cidade);
              query.setParameter("estado", estado);
        
        List d = query.getResultList();
        
        if(d.size() > 0){
           return d;
        }         
        
        return null;
    }
    
    
}
