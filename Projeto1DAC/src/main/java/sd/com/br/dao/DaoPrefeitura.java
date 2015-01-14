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
    
    
    public String cadastrarNaPrefeitura(Prefeitura prefeitura, Funcionario funcionario){
        
        try {

            prefeitura.getFuncionarios().add(funcionario);
        
            entity.getTransaction().begin();
            entity.merge(prefeitura);
            entity.getTransaction().commit();
            
            return "Cadastrado com Sucesso";
            
        } catch (Exception e) {
        }
        
        
        return "ERRO!";
        
    }
    
    
    public String vincular(Prefeitura prefeitura, Funcionario funcionario){
        
        Query query = entity.createQuery("SELECT f FROM Prefeitura p JOIN p.funcionarios f WHERE p.email = :pEmail AND f.cpf = :fCpf");
              query.setParameter("pEmail", prefeitura.getEmail());
              query.setParameter("fCpf", funcionario.getCpf());
              
        List fs = query.getResultList();
        
        if (fs.size() > 0){
            return "Funcionario ja esta vinculado na prefeitura!";
        } else {
            cadastrarNaPrefeitura(prefeitura, funcionario);
        }
        
        
        
        
        
        return "ERRO!";
        
    }
    
    
}
