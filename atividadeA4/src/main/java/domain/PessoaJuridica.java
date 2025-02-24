package domain;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String inscricaoEstadual;

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return cnpj;
    }

    @Override
    public void add(Veiculo veiculo) {
        super.add(veiculo);
    }

    public void remove(Veiculo veiculo){
        super.remove(veiculo);
    }

    public String getDados(){
        StringBuilder dados = new StringBuilder();
        dados.append(super.getDados());
        dados.append("CNPJ.....:").append(getCnpj()).append("\n");
        dados.append("Data de Cadastro.....:").append(getDataCadastro()).append("\n");
        return dados.toString();
    }
}
