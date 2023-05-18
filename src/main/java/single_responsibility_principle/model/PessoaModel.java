package single_responsibility_principle.model;

public class PessoaModel {

    private int idPessoa;
    private int idPessoaFisica;
    private int idPessoaJuridica;

    public int getIdPessoa(){
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa){
        this.idPessoa = idPessoa;
    }

    public int getIdPessoaFisica(){
        return idPessoaFisica;
    }

    public void setIdPessoaFisica(int idPessoaFisica){
        this.idPessoaFisica = idPessoaFisica;
    }

    public int getIdPessoaJuridica(){
        return idPessoaJuridica;
    }

    public void setIdPessoaJuridica(int idPessoaJuridica){
        this.idPessoaJuridica = idPessoaJuridica;
    }
}
