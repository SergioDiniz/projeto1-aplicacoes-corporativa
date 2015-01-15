/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.com.br.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
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
    @Column(nullable = false) @Temporal(TemporalType.DATE)
    private Date data;
    
    @OneToOne(cascade = CascadeType.ALL)
    private EnderecoDenuncia enderecoDenuncia;
    @ManyToOne
    private Cidade cidade;

    public Denuncia() {
    }

    public Denuncia(String descricao, EnderecoDenuncia enderecoDenuncia, Cidade cidade) {
        this.descricao = descricao;
        this.enderecoDenuncia = enderecoDenuncia;
        this.cidade = cidade;
        this.data = new Date();
        this.estadoDeAcompanhamento = EstadoDeAcompanhamento.AGUARDANDO; 
    }

    
    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.descricao);
        hash = 79 * hash + Objects.hashCode(this.estadoDeAcompanhamento);
        hash = 79 * hash + Objects.hashCode(this.data);
        hash = 79 * hash + Objects.hashCode(this.enderecoDenuncia);
        hash = 79 * hash + Objects.hashCode(this.cidade);
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
        final Denuncia other = (Denuncia) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (this.estadoDeAcompanhamento != other.estadoDeAcompanhamento) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.enderecoDenuncia, other.enderecoDenuncia)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        return true;
    }

    
    
    
}
