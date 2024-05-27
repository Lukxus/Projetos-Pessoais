package org.example.vo;

public enum TipoContaEnum {
    CONTA_CORRENTE("Checking"), CONTA_POUPANCA("Savings"), CONTA_INVESTIMENTO("Investment");

    private String tipo;

    TipoContaEnum(String tipo) {
        this.tipo = tipo;
    }

    public static TipoContaEnum fromString(String tipo) {
        for (TipoContaEnum tc : TipoContaEnum.values()) {
            if (tc.tipo.equalsIgnoreCase(tipo)) {
                return tc;
            }
        }
        throw new IllegalArgumentException("Tipo de conta inválido: " + tipo);
    }

}
