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
public class Prefeitura implements Serializable{
    @EmbeddedId
    private PrefeituraPK prefeiturapk;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String senha;

    public Prefeitura() {
    }

    public Prefeitura(PrefeituraPK prefeiturapk, String nome, String senha) {
        this.prefeiturapk = prefeiturapk;
        this.nome = nome;
        this.senha = senha;
    }

    public PrefeituraPK getPrefeiturapk() {
        return prefeiturapk;
    }

    public void setPrefeiturapk(PrefeituraPK prefeiturapk) {
        this.prefeiturapk = prefeiturapk;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

 
    
    
    
}
