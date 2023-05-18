package single_responsibility_principle.view;
import single_responsibility_principle.controller.CadastroPessoaFisica;
import single_responsibility_principle.controller.CadastroPessoaJuridica;
import single_responsibility_principle.enums.TipoPessoa;

import java.sql.Date;

public class Main {
    private static TipoPessoa tipoPessoa;

    public static void main(String[] args) {
        tipoPessoa = TipoPessoa.PESSOA_JURIDICA;
        if (tipoPessoa == TipoPessoa.PESSOA_FISICA) {
            CadastroPessoaFisica cadastroPessoaFisica = new CadastroPessoaFisica(1, "Lucas de Lima Ferreira", "01234567891", Date.valueOf("2023-05-18"), 'S');
            cadastroPessoaFisica.cadastrar();
            cadastroPessoaFisica.consultar();
            cadastroPessoaFisica = new CadastroPessoaFisica(1, "XPTOS", "19876543210", Date.valueOf("2004-01-13"), 'S');
            cadastroPessoaFisica.editar();
            cadastroPessoaFisica.deletar();
        }else{
            CadastroPessoaJuridica cadastroPessoaJuridica = new CadastroPessoaJuridica(1, "JAVA LTDA", "01234567891", "Java para baixinhos");
            cadastroPessoaJuridica.cadastrar();
            cadastroPessoaJuridica.consultar();
            cadastroPessoaJuridica = new CadastroPessoaJuridica(1, "JAVA LTDA", "01234567891", "Java para jovens");
            cadastroPessoaJuridica.editar();
            cadastroPessoaJuridica.deletar();
        }
    }
}
