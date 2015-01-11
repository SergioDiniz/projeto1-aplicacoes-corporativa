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
        DaoFuncionario df = new DaoFuncionario();
        Dao dao = new Dao();
//        EnderecoUsuario eu1 = new EnderecoUsuario("pb", "santa helena");
//        Usuario u1 = new Usuario(eu1, "sd", "sergio@gmail.com", "123");
//      
//        CidadePK cpk1 = new CidadePK("12345", "12345");
//        Cidade c1 = new Cidade(cpk1);
//        
//        Prefeitura p1 = new Prefeitura("12345", "12345", "12345", c1);
//        
//        Funcionario f1 = new Funcionario("Sergio", "1234567890", "f2@gmail.com", "123");
//        ArrayList<Funcionario> lf1 = new ArrayList<>();
//        lf1.add(f1);
//        
//        p1.setFuncionarios(lf1);
//        
//        entity.getTransaction().begin();
//        entity.persist(f1);
//        entity.persist(p1);
//        entity.getTransaction().commit();
        
        
        Funcionario f = df.login("f2@gmail.com", "1234", "12345", "12345");
        
        if (f != null){
            System.out.println("usuario logado!\nBem Vindo " + f.getCpf());
        } else {
            System.out.println("usuario ou senha invalidos.");
        }
        
        
        
    }
}
