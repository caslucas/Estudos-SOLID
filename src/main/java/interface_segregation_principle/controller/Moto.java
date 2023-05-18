package interface_segregation_principle.controller;

import interface_segregation_principle.interfaces.IVeiculo;
import interface_segregation_principle.interfaces.IVeiculoMoto;

public class Moto implements IVeiculo, IVeiculoMoto {

    private String cor;
    private String ano;
    private double motor;

    public Moto(String cor, String ano, double motor){
        configuracaoMoto(cor, ano, motor);
    }

    @Override
    public void configuracaoMoto(String cor, String ano, double motor) {
        this.cor = cor;
        this.ano = ano;
        this.motor = motor;
        System.out.println("Criando uma moto com interface");
        ligarVeiculo();
    }

    @Override
    public void ligarVeiculo() {
        System.out.println("Ligando o motor");
    }
}
