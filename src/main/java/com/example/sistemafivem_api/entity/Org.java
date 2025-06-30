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
@Table(name = "CM_CORG")
@IdClass(OrganizacaoId.class)
public class Org {

    @Id
    @Column(name = "CODSERVIDOR")
    private Integer codigoServidor;

    @Id
    @Column(name = "CODORG")
    private Integer codigoOrganizacao;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "IMAGEM")
    private String imagem;

    @Column(name = "USUI")
    private Integer usuarioInclusao;

    @Column(name = "DTI")
    private LocalDateTime dataInclusao;

    @Column(name = "USUA")
    private Integer usuarioAtualizacao;

    @Column(name = "DTA")
    private LocalDateTime dataAtualizacao;

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

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
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

class OrganizacaoId implements Serializable {

    private Integer codigoServidor;
    private Integer codigoOrganizacao;

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
        if (!(o instanceof OrganizacaoId)) return false;
        OrganizacaoId that = (OrganizacaoId) o;
        return Objects.equals(codigoServidor, that.codigoServidor) &&
               Objects.equals(codigoOrganizacao, that.codigoOrganizacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoServidor, codigoOrganizacao);
    }
}
