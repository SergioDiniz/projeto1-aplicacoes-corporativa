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
import sd.com.br.beans.Funcionario;

/**
 *
 * @author Sergiod
 */
public class DaoFuncionario {
    
    EntityManager entity = Persistence.createEntityManagerFactory("jdbc:projeto1dac").createEntityManager();
    
    public Funcionario login(String email, String senha, String cidade, String estado){
        
        Query query = entity.createQuery("SELECT f FROM Funcionario f JOIN f.prefeituras fp WHERE f.email = :email "
                + "AND f.senha = :senha AND fp.cidade.CidadePK.nomeCidade = :cidade "
                + "AND fp.cidade.CidadePK.siglaEstado = :estado");
        
              query.setParameter("email", email);
              query.setParameter("senha", senha);
              query.setParameter("cidade", cidade);
              query.setParameter("estado", estado);
              
        List<Funcionario> f = query.getResultList();
        
        if(f.size() > 0){
            return f.get(0);
        }
        
        return null;
    }
    
    public Funcionario buscarPorCPF(String cpf){
        
        Query query = entity.createQuery("SELECT f FROM Funcionario f WHERE f.cpf = :cpf");
              query.setParameter("cpf", cpf);
              
        List<Funcionario> f = query.getResultList();
        
        if(f.size() > 0){
            return f.get(0);
        }
        
        return null;        
        
    }
    
}