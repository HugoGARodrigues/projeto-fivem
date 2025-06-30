package com.example.sistemafivem_api.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CM_CUSU")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODUSUAR")
    private Integer id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "SENHA")
    private String senha;

    @Column(name = "USUI")
    private Integer usuarioInclusao;

    @Column(name = "DTI")
    private LocalDateTime dataInclusao;

    @Column(name = "USUA")
    private Integer usuarioAtualizacao;

    @Column(name = "DTA")
    private LocalDateTime dataAtualizacao;

    public Integer getCodigoUsuario() {
        return id;
    }

    public void setCodigoUsuario(Integer codigoUsuario) {
        this.id = codigoUsuario;
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

    public Integer getUsuarioInclusao() {
        return usuarioInclusao;
    }

    public void setUsuarioInclusao(Integer usuarioInclusao) {
        this.usuarioInclusao = usuarioInclusao;
    }

    public LocalDateTime getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(LocalDateTime dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public Integer getUsuarioAtualizacao() {
        return usuarioAtualizacao;
    }

    public void setUsuarioAtualizacao(Integer usuarioAtualizacao) {
        this.usuarioAtualizacao = usuarioAtualizacao;
    }

    public LocalDateTime getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }
}
