package org.example.vo;

import lombok.Getter;

public abstract class Conta implements IConta {

    private static int SEQUENCIAL = 1;

    @Getter
    protected int agencia;
    @Getter
    protected int numero;
    @Getter
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente, int agencia) {
        this.agencia = agencia;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public Conta(Cliente cliente, int numero, int agencia) {
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Numero: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }

    @Override
    public String toString() {
        return String.format("Conta{agencia=%d, numero=%d, saldo=%.2f, cliente=%s}",
                agencia, numero, saldo, cliente.getNome());
    }

}