package open_closed_principle;

import open_closed_principle.controller.Carro;
import open_closed_principle.controller.Moto;
import open_closed_principle.enums.TipoVeiculo;

public class Main {
    private  static TipoVeiculo tipoVeiculo;
    public static void main(String[] args) {
        tipoVeiculo = TipoVeiculo.CARRO;

        if(tipoVeiculo == TipoVeiculo.CARRO){
            Carro carro = new Carro("Azul", "2004", 1.4, 4);
        }else{
            Moto moto = new Moto("Vermelha", "2012", 600);
        }
    }
}
