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
import sd.com.br.dao.*;


/**
 *
 * @author Sergiod
 */
public class app {
    public static void main(String[] args) {
        EntityManager entity = Persistence.createEntityManagerFactory("jdbc:projeto1dac").createEntityManager();
        DaoUsuario du = new DaoUsuario();
        
//        EnderecoUsuario eu1 = new EnderecoUsuario("pb", "santa helena");
//        Usuario u1 = new Usuario(eu1, "sd", "sergio@gmail.com", "123");
//        
//        entity.getTransaction().begin();
//        entity.persist(u1);
//        entity.getTransaction().commit();
        
        
        Usuario ul = du.login("sergio@gmail.com", "123");
        
        if (ul != null){
            System.out.println("usuario logado!\nBem Vindo " + ul.getNickname());
        } else {
            System.out.println("usuario ou senha invalidos.");
        }
        
        
        
    }
}
