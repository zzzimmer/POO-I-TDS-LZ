package domain;

public class Pontuacao {
    private int quantidade;

    public int adicionar (int qtd){
        quantidade += qtd;
        return quantidade;
    }
    public int subtrair(int qtd){
        if ((quantidade-=qtd)>0){
            quantidade-=qtd;
        } else {
            System.out.println("Saldo insuficiente para completar operação" );
        }
        return quantidade;
    }
    public int saldo(){
        return quantidade;
    }

}
