package org.example.vo;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, int agencia) {
        super(cliente, agencia); // Chama o construtor da superclasse
    }

    public ContaPoupanca(Cliente cliente, int numero, int agencia) {
        super(cliente, numero, agencia); // Chama o construtor da superclasse
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}