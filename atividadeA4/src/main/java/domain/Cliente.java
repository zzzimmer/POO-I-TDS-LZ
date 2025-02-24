package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Cliente implements IDados{
    protected int id;
    protected String nome;
    protected String celular;
    protected Date dataCadastro;

    protected Pontuacao pontuacao = new Pontuacao();
    protected List<Veiculo> veiculoList = new ArrayList<>();// um cliente tem muitos veiculos via list

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
    } // ta certo ser um set data?
    // nao seria adicionar data?

    public Cliente(){ //realiza a composição
        this.pontuacao = new Pontuacao();
    }

    public Pontuacao getPontuacao(){
        return pontuacao;
    }
    
    public void add(Veiculo veiculo){
        veiculoList.add(veiculo);
        veiculo.setDono(this);// vai até veículo e adiciona um dono.
    }

    public void remove (Veiculo veiculo){
        veiculoList.remove(veiculo);
        veiculo.setDono(null);
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

    public String getVeiculoList() { //27s30
        StringBuilder listaVeiculos = new StringBuilder();
        listaVeiculos.append("Lista de veículos:");
        if (veiculoList != null && !veiculoList.isEmpty() ){
            for (Veiculo veiculo : veiculoList) {
                listaVeiculos.append("\nModelo do veiculo...... ").append(veiculo.getModelo().getNome());
                listaVeiculos.append("\nId do veículo...... ").append(veiculo.getId());
            }
        } else {
            listaVeiculos.append("\nEste cliente não tem veículo cadastrado");
        }
        listaVeiculos.append("\n");
        return listaVeiculos.toString();
    }
}
