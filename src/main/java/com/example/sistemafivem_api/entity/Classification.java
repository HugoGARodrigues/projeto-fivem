package com.example.sistemafivem_api.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "CM_CLASSIF")
@IdClass(ClassificacaoId.class)
public class Classification {

    @Id
    @Column(name = "CODCLASSIF")
    private Integer codigoClassificacao;

    @Id
    @Column(name = "CODSERVIDOR")
    private Integer codigoServidor;

    @Id
    @Column(name = "CODORG")
    private Integer codigoOrganizacao;

    @Column(name = "ORDEM")
    private Integer ordem;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "USUI")
    private Integer usuarioInclusao;

    @Column(name = "DTI")
    private LocalDateTime dataInclusao;

    @Column(name = "USUA")
    private Integer usuarioAtualizacao;

    @Column(name = "DTA")
    private LocalDateTime dataAtualizacao;

    public Integer getCodigoClassificacao() {
        return codigoClassificacao;
    }

    public void setCodigoClassificacao(Integer codigoClassificacao) {
        this.codigoClassificacao = codigoClassificacao;
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

    public Integer getOrdem() {
        return ordem;
    }

    public void setOrdem(Integer ordem) {
        this.ordem = ordem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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



class ClassificacaoId implements Serializable {

    private Integer codigoClassificacao;
    private Integer codigoServidor;
    private Integer codigoOrganizacao;

    public Integer getCodigoClassificacao() {
        return codigoClassificacao;
    }

    public void setCodigoClassificacao(Integer codigoClassificacao) {
        this.codigoClassificacao = codigoClassificacao;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClassificacaoId)) return false;
        ClassificacaoId that = (ClassificacaoId) o;
        return Objects.equals(codigoClassificacao, that.codigoClassificacao) &&
               Objects.equals(codigoServidor, that.codigoServidor) &&
               Objects.equals(codigoOrganizacao, that.codigoOrganizacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoClassificacao, codigoServidor, codigoOrganizacao);
    }
}

