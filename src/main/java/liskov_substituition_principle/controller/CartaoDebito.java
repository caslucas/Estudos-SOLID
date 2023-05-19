package liskov_substituition_principle.controller;

public class CartaoDebito extends CartaoNubank{

    @Override
    public void validacao() {
        System.out.println("Validando Saldo!");
    }
}
