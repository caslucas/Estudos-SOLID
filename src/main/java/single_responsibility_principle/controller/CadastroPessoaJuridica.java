package single_responsibility_principle.controller;
import single_responsibility_principle.interfaces.ICadastroCrud;
import single_responsibility_principle.model.PessoaJuridicaModel;

public class CadastroPessoaJuridica extends PessoaJuridicaModel implements ICadastroCrud {

    private Integer idPessoa;
    private String razaoSocial;
    private String cnpj;
    private String nomeFantasia;

    public CadastroPessoaJuridica(Integer idPessoa, String razaoSocial, String cnpj, String nomeFantasia){
        this.idPessoa = idPessoa;
        this.razaoSocial = razaoSocial;
        this.cnpj =cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    @Override
    public void cadastrar() {
        setIdPessoaJuridica(idPessoa);
        setRazaoSocial(razaoSocial);
        setCnpj(cnpj);
        setNomeFantasia(nomeFantasia);
        System.out.println("\nCadastro Pessoa Juridica realizado com sucesso: " +
                "\nidPessoa: " + getIdPessoaJuridica() + ", Razão Social: " + getRazaoSocial() + ", CNPJ: " + getCnpj() + ", Nome Fantasia: " + getNomeFantasia());
    }

    @Override
    public void consultar() {
        System.out.println("\nConsulta Pessoa Juridica: " +
                "\nidPessoa: " + getIdPessoaJuridica() + ", Razão Social: " + getRazaoSocial() + ", CNPJ: " + getCnpj() + ", Nome Fantasia: " + getNomeFantasia() );
    }

    @Override
    public void editar() {
        setIdPessoaJuridica(idPessoa);
        setRazaoSocial(razaoSocial);
        setCnpj(cnpj);
        setNomeFantasia(nomeFantasia);
        System.out.println("\nEdição Pessoa Juridica: " +
                "\nidPessoa: " + getIdPessoaJuridica() + ", Razão Social: " + getRazaoSocial() + ", CNPJ: " + getCnpj() + ", Nome Fantasia: " + getNomeFantasia() );
    }

    @Override
    public void deletar() {
        setIdPessoaJuridica(null);
        setRazaoSocial(null);
        setCnpj(null);
        setNomeFantasia(null);
        System.out.println("\nRegistro removido com sucesso!");
    }
}
