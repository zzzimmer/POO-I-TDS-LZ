package domain;

import java.util.Date;

public class PessoaFisica extends Cliente {
    private String cpf;
    private Date dataNascimento;

    public PessoaFisica() {

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDados(){
        StringBuilder dados = new StringBuilder();
        dados.append(super.getDados());
        dados.append("CPF......: ").append(getCpf()).append("\n");
        dados.append("Data Nascimento.....:").append(getDataNascimento()).append("\n");
        return dados.toString();

    }

    public String getDados(String observacoes){
        StringBuilder dados = new StringBuilder();
        dados.append(super.getDados());
        dados.append(observacoes);
        return dados.toString();
    }

}

