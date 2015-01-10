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
public class Prefeitura implements Serializable{
    @Id @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String senha;
    @OneToOne(cascade = CascadeType.ALL)
    private Cidade cidade;
    
    @ManyToMany
    private List<Funcionario> funcionarios;
    
    public Prefeitura() {
    }

    public Prefeitura(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    
    
    public Prefeitura(String nome, String email, String senha, Cidade cidade) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cidade = cidade;
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

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    

}
