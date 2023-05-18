package open_closed_principle.controller;

import open_closed_principle.interfaces.IVeiculoCarro;

public class Carro implements IVeiculoCarro {

    private String cor;
    private String ano;
    private double motor;
    private int assentos;

    public Carro(String cor, String ano, double motor, int assentos){
        configuracaoVeiculo(cor, ano, motor, assentos);
    }

    @Override
    public void configuracaoVeiculo(String cor, String ano, double motor, int assentos) {
        this.cor = cor;
        this.ano = ano;
        this.motor = motor;
        this.assentos = assentos;
        System.out.println("Criando um carro com interface");
        ligarVeiculo();
    }

    @Override
    public void ligarVeiculo() {
        System.out.println("Ligando o motor");
    }
}
