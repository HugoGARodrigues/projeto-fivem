package com.example.sistemafivem_api.enums;

import java.util.Arrays;
import java.util.Optional;

public enum VendasAcessoBaseadoNoBanco {

    POS_0(0,"ROLE_CONSULTAR_VENDA"),
    POS_1(1,"ROLE_INCLUIR_VENDA"),
    POS_2(2,"ROLE_ALTERAR_VENDA"),
    POS_3(3,"ROLE_EXCLUIR_VENDA");

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
