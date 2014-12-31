/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.com.br.beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Sergiod
 */
@Entity
public class Denuncia implements Serializable{
    @Id @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false) @Enumerated(EnumType.STRING)
    private EstadoDeAcompanhamento estadoDeAcompanhamento;
    @Column(nullable = false) @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    private EnderecoDenuncia enderecoDenuncia;

    public Denuncia() {
    }

    public Denuncia(String descricao, EstadoDeAcompanhamento estadoDeAcompanhamento, Date data, EnderecoDenuncia enderecoDenuncia) {
        this.descricao = descricao;
        this.estadoDeAcompanhamento = estadoDeAcompanhamento;
        this.data = data;
        this.enderecoDenuncia = enderecoDenuncia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public EstadoDeAcompanhamento getEstadoDeAcompanhamento() {
        return estadoDeAcompanhamento;
    }

    public void setEstadoDeAcompanhamento(EstadoDeAcompanhamento estadoDeAcompanhamento) {
        this.estadoDeAcompanhamento = estadoDeAcompanhamento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public EnderecoDenuncia getEnderecoDenuncia() {
        return enderecoDenuncia;
    }

    public void setEnderecoDenuncia(EnderecoDenuncia enderecoDenuncia) {
        this.enderecoDenuncia = enderecoDenuncia;
    }

    
    
    
}
