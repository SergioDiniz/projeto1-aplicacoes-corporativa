/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.com.br.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Denuncia> denuncias;
    
    public Usuario() {
    }

    public Usuario(EnderecoUsuario endereco, String nickname, String email, String senha) {
        super(email, senha);
        this.endereco = endereco;
        this.nickname = nickname;
        this.denuncias = new ArrayList<>();
    }

    public List<Denuncia> getDenuncias() {
        return denuncias;
    }

    public void setDenuncias(List<Denuncia> denuncias) {
        this.denuncias = denuncias;
    }
    
    public void novaDenuncia(Denuncia denuncia) {
        this.denuncias.add(denuncia);
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.endereco);
        hash = 31 * hash + Objects.hashCode(this.nickname);
        hash = 31 * hash + Objects.hashCode(this.denuncias);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.nickname, other.nickname)) {
            return false;
        }
        if (!Objects.equals(this.denuncias, other.denuncias)) {
            return false;
        }
        return true;
    }




    
    
}
