package com.example.sistemafivem_api.enums;

import java.util.Arrays;
import java.util.Optional;

public enum FinanceiroAcessoBaseadoNoBanco {

    POS_0(0,"ROLE_CONSULTAR_FINANCEIRO"),
    POS_1(1,"ROLE_INCLUIR_FINANCEIRO"),
    POS_2(2,"ROLE_ALTERAR_FINANCEIRO"),
    POS_3(3,"ROLE_EXCLUIR_FINANCEIRO");

    private final int posicao;
    private final String roleName;

    
    
    FinanceiroAcessoBaseadoNoBanco(int posicao, String roleName) {
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
