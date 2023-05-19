package dependency_inversion_principle;

import dependency_inversion_principle.pagamento.Pagamento;

public class Main {

    public static void main(String[] args) {
        Pagamento pagamento = new Pagamento();
        pagamento.pagar("2023");
    }
}
