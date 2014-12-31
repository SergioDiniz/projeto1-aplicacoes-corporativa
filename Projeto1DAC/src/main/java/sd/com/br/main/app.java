/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.com.br.main;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import sd.com.br.beans.Endereco;
import sd.com.br.beans.Funcionario;
import sd.com.br.beans.Prefeitura;
import sd.com.br.beans.PrefeituraPK;
import sd.com.br.beans.Usuario;
import sd.com.br.beans.UsuarioPK;

/**
 *
 * @author Sergiod
 */
public class app {
    public static void main(String[] args) {
        EntityManager entity = Persistence.createEntityManagerFactory("jdbc:projeto1dac").createEntityManager();
        
        
        Endereco e = new Endereco("pb", "sth");
        Usuario u = new Usuario(e, "sergiod", "sergio@gmail.com", "12345");
        Funcionario f = new Funcionario("sergio", "sergio@gmail.com", "12345");
        PrefeituraPK ppk = new PrefeituraPK("Santa Helena - PB");
        Prefeitura p = new Prefeitura(ppk, "santa@gmail.com", "12345");
        entity.getTransaction().begin();
        entity.persist(u);
        entity.persist(f);
        entity.persist(p);
        entity.getTransaction().commit();
        
    }
}
