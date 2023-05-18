package liskov_substituition_principle.controller;

import jdk.swing.interop.SwingInterOpUtils;
import liskov_substituition_principle.interfaces.IntrumentoPagamento;

public class PontosNubank implements IntrumentoPagamento {

    @Override
    public void validacao() {
        System.out.println("Limite OK!");
        System.out.println("Pontos OK!");
    }

    @Override
    public void recebePagamento() {
        System.out.println("Pagamento realizado com sucesso!");
        System.out.println("Pontuação creditada!");
    }
}
