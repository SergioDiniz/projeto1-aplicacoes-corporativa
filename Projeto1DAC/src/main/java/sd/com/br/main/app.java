/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.com.br.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
        DaoDenuncia dd = new DaoDenuncia();
        Dao dao = new Dao();
//        EnderecoUsuario eu1 = new EnderecoUsuario("pb", "santa helena");
//        Usuario u1 = new Usuario(eu1, "sd", "sergio@gmail.com", "123");
//      
        CidadePK cpk1 = new CidadePK("12345", "12345");
        Cidade c1 = new Cidade(cpk1);
//        
//        Prefeitura p1 = new Prefeitura("12345", "12345", "12345", c1);
//        
//        Funcionario f1 = new Funcionario("Sergio", "1234567890", "f2@gmail.com", "123");
//        ArrayList<Funcionario> lf1 = new ArrayList<>();
//        lf1.add(f1);
//        
//        p1.setFuncionarios(lf1);
//        
//        EnderecoDenuncia ed1 = new EnderecoDenuncia("bairo1", 1, "rua1");
//        Denuncia d1 = new Denuncia("descricao1", ed1, c1);
//        
//        EnderecoDenuncia ed2 = new EnderecoDenuncia("bairo2", 1, "rua2");
//        Denuncia d2 = new Denuncia("descricao1", ed2, c1);
//        
        entity.getTransaction().begin();
        
        entity.getTransaction().commit();
        
        
//        List<Denuncia> denuncias = dd.pesquisarPorCidade("12345", "12345");
//        
//        if (denuncias != null){
//            System.out.println("achamos: " + denuncias.size() + " denuncias.");
//        } else {
//            System.out.println("sem resultado.");
//        }
        
        
        
    }
}
