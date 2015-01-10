/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.com.br.main;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.*;
import sd.com.br.beans.*;
import sd.com.br.dao.Dao;
import sd.com.br.dao.DaoCidade;

/**
 *
 * @author Sergiod
 */
public class app {
    public static void main(String[] args) {
        EntityManager entity = Persistence.createEntityManagerFactory("jdbc:projeto1dac").createEntityManager();
        
        
        
        
        
//        
//        Cidade c1 = new Cidade("Santa Helena", "PB");
//        Cidade c2 = new Cidade("Cajazeiras", "PB");
//        Cidade c3 = new Cidade("Sousa", "PB");
//        
//        
//        
//        PrefeituraPK ppk = new PrefeituraPK("sth@gmail.com");
//        Prefeitura p = new Prefeitura(ppk, "Santa Helena - PB", "12345", c1);
//        
//        
//        Funcionario f = new Funcionario("sergio","12123123-23" , "sergio@gmail.com", "12345");
//        
//        
//        
//        
//        ArrayList<Funcionario> funcionarios = new ArrayList<>();
//        funcionarios.add(f);
//        
//        ArrayList<Prefeitura> prefeituras = new ArrayList<>();
//        prefeituras.add(p);
//        
//        
//        f.setPrefeituras(prefeituras);
//        p.setFuncionarios(funcionarios);
//        
//        
//        
//        
//        
//
//        EnderecoDenuncia ed = new EnderecoDenuncia("Centro", 560, "pedro muniz");
//        Denuncia d = new Denuncia("buracos", ed, c1);
//        
//        
//        EnderecoUsuario e = new EnderecoUsuario("pb", "sth");
//        Usuario u = new Usuario(e, "sergiod", "sergio@gmail.com", "12345");        
//        ArrayList<Denuncia> denuncias = new ArrayList<>();
//        denuncias.add(d);
//        u.setDenuncias(denuncias);
//        
//        
//        
//        Administrador a = new Administrador("sergio@gmail.com", "senha");
        Dao dao = new Dao();
//        dao.salvar(a);
        
//        entity.getTransaction().begin();
//        entity.persist(a);
//        entity.persist(c1);
//        entity.persist(c2);
//        entity.persist(c3);
//        entity.persist(p);
////        entity.persist(d);
//        entity.persist(f);
//        
//        entity.persist(u);
//        entity.getTransaction().commit();
     

        
//        CidadePK cidadePK = new CidadePK("Santa Helena", "PB");
//        Cidade cidade = new Cidade(cidadePK);
//        
//        
//        Prefeitura prefeitura = new Prefeitura("nome", "email", "senha", cidade);
//        
        
//        entity.getTransaction().begin();
//        entity.persist(cidade);
//        entity.persist(prefeitura);
//        entity.getTransaction().commit();
        
        DaoCidade dc = new DaoCidade();
//        Cidade c2 = d.pesquisarCidade("Santa Helena", "PB");
//        
//        
//        
//        
//        
//        if(c2 == null){
//            System.out.println("não cadastrado");
//        }else{
//        System.out.println(c2.getCidadePK().getNomeCidade());
//        }
        
        
        Cidade c3 = dc.pesquisarCidade("123", "123");
        Prefeitura prefeitura = new Prefeitura("nome1", "email1", "senha1", c3);
        
        entity.getTransaction().begin();
        entity.merge(prefeitura);
        entity.getTransaction().commit();
        
        
        
        
    }
}
