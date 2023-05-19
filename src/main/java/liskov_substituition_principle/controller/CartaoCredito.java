package liskov_substituition_principle.controller;

public class CartaoCredito extends CartaoNubank {

    @Override
    public void validacao() {
        System.out.println("Validando limite!");
        System.out.println("Validação OK");
    }
}
