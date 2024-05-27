package org.example.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


public class Banco {

    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private List<Conta> contas;

}

