package domain;

import java.util.Date;

public abstract class Cliente implements IDados{
    protected int id;
    protected String nome;
    protected String celular;
    protected Date dataCadastro;
    protected Pontuacao pontuacao = new Pontuacao();

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCelular(){
        return this.celular;
    }

    public void setCelular(String celular){
        this.celular = celular;
    }

    public Date getDataCadastro(){
        return dataCadastro;
    }

    public void setCadastro(Date dataCadastro){
        this.dataCadastro = dataCadastro;
    }

    public Cliente(){ //realiza a composição
        this.pontuacao = new Pontuacao();
    }

    public Pontuacao getPontuacao(){
        return pontuacao;
    }
    
    public void add(Veiculo veiculo){

    }

    public void remove (Veiculo veiculo){

    }

    public String getDados(){//stringbuilder
    StringBuilder dados = new StringBuilder();
    dados.append("Os dados de id são: ").append(getId()).append("\n");
    dados.append("O nome é: ").append(getNome()).append("\n");
    dados.append("Celular do cliente: ").append(getCelular()).append("\n");
    dados.append("A data de cadastro: ").append(getDataCadastro()).append("\n");
    dados.append("A pontuação do referido cliente é: ").append(getPontuacao().saldo());
    dados.append("\n");
    return dados.toString();
    }

    public String getDados(String observacao){//stringbuilder
        StringBuilder dados = new StringBuilder();
        dados.append("Os dados de ID são: ").append(getId());
        dados.append(observacao);
        return dados.toString();
    }
}
