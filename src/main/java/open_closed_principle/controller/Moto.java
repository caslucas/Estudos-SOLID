package open_closed_principle.controller;

public class Moto extends Veiculo{

    public Moto(String cor, String ano, double motor){
        this.cor = cor;
        this.ano = ano;
        this.motor = motor;
        configuracaoMoto();
    }

    public void configuracaoMoto(){
        System.out.println("Criando uma moto: " + cor + " " + ano + " " + motor);
        ligarVeiculo();
    }
}
