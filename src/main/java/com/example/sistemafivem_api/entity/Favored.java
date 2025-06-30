package com.example.sistemafivem_api.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "FV_FAVOR")
public class Favored {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODFAVOREC")
    private Integer codigoFavorecido;

    @Column(name = "CODSERVIDOR")
    private Integer codigoServidor;

    @Column(name = "CODORG")
    private Integer codigoOrganizacao;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "OBSERV", columnDefinition = "TEXT")
    private String observacao;

    @Column(name = "USUI")
    private Integer usuarioInclusao;

    @Column(name = "DTI")
    private LocalDateTime dataInclusao;

    @Column(name = "USUA")
    private Integer usuarioAtualizacao;

    @Column(name = "DTA")
    private LocalDateTime dataAtualizacao;

    public Integer getCodigoFavorecido() {
        return codigoFavorecido;
    }

    public void setCodigoFavorecido(Integer codigoFavorecido) {
        this.codigoFavorecido = codigoFavorecido;
    }

    public Integer getCodigoServidor() {
        return codigoServidor;
    }

    public void setCodigoServidor(Integer codigoServidor) {
        this.codigoServidor = codigoServidor;
    }

    public Integer getCodigoOrganizacao() {
        return codigoOrganizacao;
    }

    public void setCodigoOrganizacao(Integer codigoOrganizacao) {
        this.codigoOrganizacao = codigoOrganizacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
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
