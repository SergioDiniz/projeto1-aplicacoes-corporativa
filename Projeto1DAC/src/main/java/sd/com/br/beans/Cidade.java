/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.com.br.beans;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Sergiod
 */
@Entity
public class Cidade implements Serializable{
    @Id @GeneratedValue
    private int id;
    @Column (nullable = false)
    private String nome;
    @Column (nullable = false)
    private String estado;
    
    @OneToOne(mappedBy = "cidade")
    private Prefeitura prefeitura;
    @OneToMany(mappedBy = "cidade", cascade = CascadeType.ALL)
    private List<Denuncia> denuncias;
            
    public Cidade() {
    }

    public Cidade(String nome, String estado) {
        this.nome = nome;
        this.estado = estado;
        this.prefeitura = null;
        this.denuncias = null;
    }

    public Cidade(String nome, String estado, Prefeitura prefeitura) {
        this.nome = nome;
        this.estado = estado;
        this.prefeitura = prefeitura;
        this.denuncias = null;
    }

    public Cidade(String nome, String estado, Prefeitura prefeitura, List<Denuncia> denuncias) {
        this.nome = nome;
        this.estado = estado;
        this.prefeitura = prefeitura;
        this.denuncias = denuncias;
    }

    public List<Denuncia> getDenuncias() {
        return denuncias;
    }

    public void setDenuncias(List<Denuncia> denuncias) {
        this.denuncias = denuncias;
    }
    
    public Prefeitura getPrefeitura() {
        return prefeitura;
    }

    public void setPrefeitura(Prefeitura prefeitura) {
        this.prefeitura = prefeitura;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
