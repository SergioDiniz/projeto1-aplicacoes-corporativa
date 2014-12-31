/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.com.br.beans;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Sergiod
 */
@Entity
public class Funcionario extends Pessoa implements Serializable{
    private String nome;

    public Funcionario() {
    }

    public Funcionario(String nome, String email, String senha) {
        super(email, senha);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
