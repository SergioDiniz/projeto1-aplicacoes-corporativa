/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.com.br.beans;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Sergiod
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Pessoa implements Serializable {
    @Id @GeneratedValue
    private int id;
    @Column (nullable = false, unique = true)
    private String email;
    @Column (nullable = false)
    private String senha;
 
    public Pessoa() {
    }

    public Pessoa(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
