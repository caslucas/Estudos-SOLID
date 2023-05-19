package liskov_substituition_principle.controller;

import liskov_substituition_principle.interfaces.IntrumentoPagamento;

abstract public class CartaoNubank implements IntrumentoPagamento {

    @Override
    public void validacao() {

    }

    @Override
    public void recebePagamento() {
        System.out.println("Pagamento realizado");
    }
}
