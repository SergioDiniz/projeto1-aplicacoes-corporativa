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
public class Usuario extends Pessoa implements Serializable{
    
    @Embedded @Column(nullable = false)
    private EnderecoUsuario endereco;
    @Column(nullable = false, unique = true)
    private String nickname;

    public Usuario() {
    }

    public Usuario(EnderecoUsuario endereco, String nickname, String email, String senha) {
        super(email, senha);
        this.endereco = endereco;
        this.nickname = nickname;
    }

    public EnderecoUsuario getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoUsuario endereco) {
        this.endereco = endereco;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }




    
    
}
