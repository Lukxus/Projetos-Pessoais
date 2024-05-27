package org.example.vo;

public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente, int agencia) {
        super(cliente, agencia); // Chama o construtor da superclasse
    }

    public ContaCorrente(Cliente cliente, int numero, int agencia) {
        super(cliente, numero, agencia); // Chama o construtor da superclasse
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

}