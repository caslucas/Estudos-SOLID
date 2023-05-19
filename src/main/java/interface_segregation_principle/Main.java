package interface_segregation_principle;

import interface_segregation_principle.controller.Carro;
import interface_segregation_principle.controller.Moto;
import interface_segregation_principle.enums.TipoVeiculo;

public class Main {
    private  static TipoVeiculo tipoVeiculo;
    public static void main(String[] args) {
        tipoVeiculo = TipoVeiculo.MOTO;

        if(tipoVeiculo == TipoVeiculo.CARRO){
            Carro carro = new Carro("Azul", "2004", 1.4, 4);
        }else{
            Moto moto = new Moto("Vermelha", "2012", 600);
        }
    }
}
