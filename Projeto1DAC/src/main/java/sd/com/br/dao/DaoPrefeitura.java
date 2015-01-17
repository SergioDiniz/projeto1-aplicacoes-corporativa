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
    
    
    public Funcionario pesquisarFuncionario(Prefeitura prefeitura, String cpf){
        Query query = entity.createQuery("SELECT f FROM Prefeitura p JOIN p.funcionarios f WHERE p.email = :pEmail AND f.cpf = :fCpf");
              query.setParameter("pEmail", prefeitura.getEmail());
              query.setParameter("fCpf", cpf);
              
        List<Funcionario> pf = query.getResultList();        
        
        if (pf.size() > 0){
            return  pf.get(0);
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
            return "Vinculado com Sucesso!";
        }

//        return "ERRO!";
        
    }
    
    
    public String desvincular(Prefeitura prefeitura, String cpf){

        Funcionario funcionario = pesquisarFuncionario(prefeitura, cpf);
        
        
        if (funcionario != null){

                    prefeitura.getFuncionarios().remove(funcionario);
                    funcionario.getPrefeituras().remove(prefeitura);

                    entity.getTransaction().begin();
                    entity.merge(prefeitura);
                    entity.merge(funcionario);
                    entity.getTransaction().commit();

            return "Removido";

        } else {
            return "Funcionario não vinculado com a prefeitura.";
        }
              
//        return "ERRO!";
    }
    
    
    public List<Prefeitura> prefeiturasPendentes(){
        
        Query query = entity.createQuery("SELECT p from Prefeitura p WHERE p.ativo = false");
        List<Prefeitura> prefeituras = query.getResultList();
        
        if (prefeituras.size() > 0){
            return prefeituras;
        }
                
        return null;
    }
    
    
    public Prefeitura pesquisarPorCodigo(int codigo){
        
        Query query = entity.createQuery("SELECT p from Prefeitura p WHERE p.id = :codigo");
              query.setParameter("codigo", codigo);
              
        List<Prefeitura> prefeituras = query.getResultList();
        
        if (prefeituras.size() > 0){
            return  prefeituras.get(0);
        }
        
        return null;
        
    }
    
    public String atualizarSituacao(Prefeitura prefeitura, boolean situacao){
        
        
        
        try {
        
            prefeitura.setAtivo(situacao);

            entity.getTransaction().begin();
            entity.merge(prefeitura);
            entity.getTransaction().commit();            
            
            return "Atualizado com Sucesso!";
            
        } catch (Exception e) {
        }
        
        return "ERRO!";
        
    }
    
    
    public String  excluir(Prefeitura prefeitura){
        
        try {
            prefeitura.setFuncionarios(null);
            prefeitura.setCidade(null);

            entity.getTransaction().begin();
            entity.remove(entity.merge(prefeitura));
            entity.getTransaction().commit();   
            
            return "Excluido com sucesso!";
            
        } catch (Exception e) {
        }
        
        
        
        return "ERRO!";
        
    }
    
    
    public List<Prefeitura> todasPrefeituras(){
        
        Query query = entity.createQuery("SELECT p FROM Prefeitura p WHERE p.ativo = true");
        
        List<Prefeitura> prefeituras = query.getResultList();
        
        if(prefeituras.size() > 0){
            return prefeituras;
        }
        
        return null;
        
    }
    
    
}
