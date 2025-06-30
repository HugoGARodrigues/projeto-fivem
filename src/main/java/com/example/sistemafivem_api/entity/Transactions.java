package com.example.sistemafivem_api.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "GM_MMOV")
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODMOV")
    private Integer codigoMovimentacao;

    @Column(name = "CODSERVIDOR")
    private Integer codigoServidor;

    @Column(name = "CODORG")
    private Integer codigoOrganizacao;

    @Column(name = "CODMAT")
    private Integer codigoProduto;

    @Column(name = "TPMOV")
    private Integer tipoMovimentacao;

    @Column(name = "QTDE")
    private Float quantidade;

    @Column(name = "VLUNIT")
    private Float valorUnitario;

    @Column(name = "TOTAL")
    private Float total;

    @Column(name = "CODFAVOREC")
    private Integer codigoFavorecido;

    @Column(name = "OBSERV")
    private String observacao;

    @Column(name = "USUI")
    private Integer usuarioInclusao;

    @Column(name = "DTI")
    private LocalDateTime dataInclusao;

    @Column(name = "USUA")
    private Integer usuarioAtualizacao;

    @Column(name = "DTA")
    private LocalDateTime dataAtualizacao;

    public Integer getCodigoMovimentacao() {
        return codigoMovimentacao;
    }

    public void setCodigoMovimentacao(Integer codigoMovimentacao) {
        this.codigoMovimentacao = codigoMovimentacao;
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

    public Integer getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(Integer codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public Integer getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(Integer tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public Float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Float quantidade) {
        this.quantidade = quantidade;
    }

    public Float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Integer getCodigoFavorecido() {
        return codigoFavorecido;
    }

    public void setCodigoFavorecido(Integer codigoFavorecido) {
        this.codigoFavorecido = codigoFavorecido;
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
