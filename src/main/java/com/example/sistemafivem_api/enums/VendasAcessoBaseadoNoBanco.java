package com.example.sistemafivem_api.enums;

import java.util.Arrays;
import java.util.Optional;

public enum VendasAcessoBaseadoNoBanco {

    CONSULTARVEN(0,"ROLE_CONSULTAR_VENDA"),
    INCLUIRVEN(1,"ROLE_INCLUIR_VENDA"),
    ALTERARVEN(2,"ROLE_ALTERAR_VENDA"),
    EXCLUIRVEN(3,"ROLE_EXCLUIR_VENDA");

    private final int posicao;
    private final String roleName;

    
    
    VendasAcessoBaseadoNoBanco(int posicao, String roleName) {
        this.posicao = posicao;
        this.roleName = roleName;
    }


    public int getPosicao() {
        return posicao;
    }

    public String getRoleName() {
        return roleName;
    }
    public static Optional<String> getRoleByIndex(int index) {
        return Arrays.stream(VendasAcessoBaseadoNoBanco.values())
                .filter(role -> role.getPosicao() == index)
                .map(VendasAcessoBaseadoNoBanco::getRoleName)
                .findFirst();
    }

    

}
