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
@Embeddable
public class EnderecoUsuario implements Serializable{
    @Column(nullable = false)
    private String uf;
    @Column(nullable = false)
    private String cidade;

    public EnderecoUsuario() {
    }

    public EnderecoUsuario(String uf, String cidade) {
        this.uf = uf;
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    

    
}
