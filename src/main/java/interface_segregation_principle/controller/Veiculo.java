package interface_segregation_principle.controller;

public class Veiculo {

    protected String cor;
    protected String ano;
    protected double motor;

    public void ligarVeiculo(){
        System.out.println("Ligando o motor");
    }
}
