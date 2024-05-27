package org.example.vo;

import lombok.Getter;
import lombok.Setter;

public class ContaInvestimento extends Conta {

    @Getter
    @Setter
    protected double taxaInvestimento = 1.1;

    public ContaInvestimento(Cliente cliente, int agencia) {
        super(cliente, agencia); // Chama o construtor da superclasse
    }

    public ContaInvestimento(Cliente cliente, int numero, int agencia) {
        super(cliente, numero, agencia); // Chama o construtor da superclasse
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

}