package com.example.sistemafivem_api.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.sistemafivem_api.enums.FinanceiroAcessoBaseadoNoBanco;
import com.example.sistemafivem_api.enums.VendasAcessoBaseadoNoBanco;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;


@Entity
@Table(name = "CM_CACES")
@IdClass(AcessoId.class)
public class Access implements UserDetails {

    @Autowired
    private User user;

    @Id
    @Column(name = "CODUSUAR")
    private Integer codigoUsuario;

    @Id
    @Column(name = "CODSERVIDOR")
    private Integer codigoServidor;

    @Id
    @Column(name = "CODORG")
    private Integer codigoOrganizacao;

    @Column(name = "VENDA")
    private String venda;

    @Column(name = "CAIXA")
    private String caixa;

    @Column(name = "USUI")
    private Integer usuarioInclusao;

    @Column(name = "DTI")
    private LocalDateTime dataInclusao;

    @Column(name = "USUA")
    private Integer usuarioAtualizacao;

    @Column(name = "DTA")
    private LocalDateTime dataAtualizacao;

    public Access() {
    }

    public Access(Integer codigoUsuario, Integer codigoServidor, Integer codigoOrganizacao, String venda, String caixa,
                  Integer usuarioInclusao, LocalDateTime dataInclusao, Integer usuarioAtualizacao, LocalDateTime dataAtualizacao) {
        this.codigoUsuario = codigoUsuario;
        this.codigoServidor = codigoServidor;
        this.codigoOrganizacao = codigoOrganizacao;
        this.venda = venda;
        this.caixa = caixa;
        this.usuarioInclusao = usuarioInclusao;
        this.dataInclusao = dataInclusao;
        this.usuarioAtualizacao = usuarioAtualizacao;
        this.dataAtualizacao = dataAtualizacao;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<GrantedAuthority> authorities = new HashSet<>();
        String venda = this.venda;
        if (venda != null) {
            for(int i = 0; i < venda.length(); i++) {
                if(venda.charAt(i) == '1') {
                    VendasAcessoBaseadoNoBanco.getRoleByIndex(i)
                            .ifPresent(role -> authorities.add(new SimpleGrantedAuthority(role)));
                }
            }
    }

    String caixa = this.caixa;
    if (caixa != null) {
        for (int i = 0; i < caixa.length(); i++) {
            if (caixa.charAt(i) == '1') {
                FinanceiroAcessoBaseadoNoBanco.getRoleByIndex(i)
                        .ifPresent(role -> authorities.add(new SimpleGrantedAuthority(role)));
            }
        }
    }

        return authorities;
}

    @Override
    public String getPassword() {
        return user.getSenha();
    }

    @Override
    public String getUsername() {
        return user.getEmail(); 
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
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

    public String getVenda() {
        return venda;
    }

    public void setVenda(String venda) {
        this.venda = venda;
    }

    public String getCaixa() {
        return caixa;
    }

    public void setCaixa(String caixa) {
        this.caixa = caixa;
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

class AcessoId implements Serializable {
    private Integer codigoUsuario;
    private Integer codigoServidor;
    private Integer codigoOrganizacao;

    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
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
        if (o == null || getClass() != o.getClass()) return false;
        AcessoId that = (AcessoId) o;
        return Objects.equals(codigoUsuario, that.codigoUsuario) &&
               Objects.equals(codigoServidor, that.codigoServidor) &&
               Objects.equals(codigoOrganizacao, that.codigoOrganizacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoUsuario, codigoServidor, codigoOrganizacao);
    }
}
