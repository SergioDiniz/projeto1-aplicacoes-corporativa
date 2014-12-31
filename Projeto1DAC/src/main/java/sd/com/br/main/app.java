/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.com.br.main;

import java.util.Date;
import javax.persistence.*;
import sd.com.br.beans.*;

/**
 *
 * @author Sergiod
 */
public class app {
    public static void main(String[] args) {
        EntityManager entity = Persistence.createEntityManagerFactory("jdbc:projeto1dac").createEntityManager();
        
        
        EnderecoUsuario e = new EnderecoUsuario("pb", "sth");
        
        Usuario u = new Usuario(e, "sergiod", "sergio@gmail.com", "12345");
        
        Funcionario f = new Funcionario("sergio", "sergio@gmail.com", "12345");
        PrefeituraPK ppk = new PrefeituraPK("sth@gmail.com");
        
        Prefeitura p = new Prefeitura(ppk, "Santa Helena - PB", "12345");
        
        Cidade c = new Cidade("Santa Helena", "PB");
        
        EnderecoDenuncia ed = new EnderecoDenuncia("pb", "cidade", "rua");
        Denuncia d = new Denuncia("buraco", EstadoDeAcompanhamento.AGUARDANDO, new Date(), ed);
        
        
        Administrador a = new Administrador("sergio@gmail.com", "senha");
        
        
        entity.getTransaction().begin();
        entity.persist(a);
        entity.persist(c);
        entity.persist(d);
        entity.persist(f);
        entity.persist(p);
        entity.persist(u);
        entity.getTransaction().commit();
        
    }
}
