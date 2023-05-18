package liskov_substituition_principle;

import liskov_substituition_principle.controller.CartaoCredito;
import liskov_substituition_principle.controller.CartaoDebito;
import liskov_substituition_principle.controller.PontosNubank;

public class Main {

    public static void main(String[] args) {
/*        CartaoCredito cartaoCredito = new CartaoCredito();
        cartaoCredito.validacao();
        cartaoCredito.recebePagamento();
        CartaoDebito cartaoDebito = new CartaoDebito();
        cartaoDebito.validacao();
        cartaoDebito.recebePagamento();*/

        PontosNubank pontosNubank = new PontosNubank();
        pontosNubank.recebePagamento();

    }
}
