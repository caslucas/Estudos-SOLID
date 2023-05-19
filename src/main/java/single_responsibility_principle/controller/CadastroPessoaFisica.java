package single_responsibility_principle.controller;


import single_responsibility_principle.interfaces.ICadastroCrud;
import single_responsibility_principle.model.PessoaFisicaModel;

import java.util.Date;

public class CadastroPessoaFisica extends PessoaFisicaModel implements ICadastroCrud {

    private Integer idPessoa;
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private Character estadoCivil;

    public CadastroPessoaFisica(Integer idPessoa, String nome, String cpf, Date dataNascimento, Character estadoCivil){
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
    }

    @Override
    public void cadastrar() {
        setIdPessoa(idPessoa);
        setNome(nome);
        setCpf(cpf);
        setDataNascimento(dataNascimento);
        setEstadoCivil(estadoCivil);
        System.out.println("\nCadastro Pessoa Fisica realizado com sucesso: " +
                "\nidPessoa: " + getIdPessoa() + ", Nome: " + getNome() + ", CPF: " + getCpf() + ", Data de Nascimento: " + getDataNascimento() + ", Estado Civil: " + getEstadoCivil());
    }

    @Override
    public void consultar() {
        System.out.println("\nConsulta Pessoa Fisica: " +
                "\nidPessoa: " + getIdPessoa() + ", Nome: " + getNome() + ", CPF: " + getCpf() + ", Data de Nascimento: " + getDataNascimento() + ", Estado Civil: " + getEstadoCivil());
    }

    @Override
    public void editar() {
        setIdPessoa(idPessoa);
        setNome(nome);
        setCpf(cpf);
        setDataNascimento(dataNascimento);
        setEstadoCivil(estadoCivil);
        System.out.println("\nEdição Pessoa Fisica: " +
                "\nidPessoa: " + getIdPessoa() + ", Nome: " + getNome() + ", CPF: " + getCpf() + ", Data de Nascimento: " + getDataNascimento() + ", Estado Civil: " + getEstadoCivil());
    }

    @Override
    public void deletar() {
        setIdPessoa(null);
        setNome(null);
        setCpf(null);
        setDataNascimento(null);
        setEstadoCivil(null);
        System.out.println("\nRegistro removido com sucesso!");
    }
}
