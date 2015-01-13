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
import sd.com.br.beans.Denuncia;
import sd.com.br.beans.EnderecoDenuncia;
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
    
    
    public String novaDenuncia(Usuario usuario, String cidade, String estado, String rua, 
                                String numeroS, String bairro, String descricao){
        int numero = Integer.parseInt(numeroS);
        
        
        try {
            
            EnderecoDenuncia ed = new EnderecoDenuncia(bairro, numero, rua);
            CidadePK cpk = new CidadePK(cidade, estado);
            Cidade c = new Cidade(cpk);
            Denuncia d = new Denuncia(descricao, ed, c);
            
            usuario.novaDenuncia(d);
            
            entity.getTransaction().begin();
            entity.persist(ed);
            entity.persist(d);
            entity.merge(usuario);
            entity.getTransaction().commit();
            
            
            
            
            
            return "ok";
        } catch (Exception e) {
        }
        
        
        return "ERRO";
    }
    
    
    public List<Denuncia> minhasDenuncias(String email){
        
        Query query = entity.createQuery("SELECT d from Usuario u JOIN u.denuncias d WHERE u.email = :email");
              query.setParameter("email", email);
        
        List<Denuncia> d = query.getResultList();
        
        if(d.size() > 0){
            return d;
        }
        
        return null;
        
    }
    
    
}
