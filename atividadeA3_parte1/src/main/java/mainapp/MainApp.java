package mainapp;

import domain.*;
import java.math.*;

public class MainApp {

    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        criaCNPJ(pessoaJuridica);
        criaCPF(pessoaFisica);

        printCliente(pessoaFisica);
        printCliente(pessoaJuridica);

    }


    public static void printCliente(Cliente cliente){
        System.out.println();
        System.out.println("A classe do cliente é: "+ cliente.getClass().getSimpleName());
        if (cliente instanceof PessoaFisica pessoaFisica){
            //operação downcast por meio de uma variável temporária
            System.out.println(pessoaFisica.getDados());
        } else {
            //operação downcast sem a necessidade de usar uma variável
            System.out.println(((PessoaJuridica)cliente).getDados());
        }
    }

    public static void criaCPF(PessoaFisica cpf){
        cpf.setId((int)(Math.random()*20));
        cpf.setCpf(String.valueOf((int)(Math.random()*20)));
        cpf.setCelular(String.valueOf((int)(Math.random()*20)));
        cpf.getPontuacao().adicionar((int)(Math.random()*30));
    }

    public static void criaCNPJ(PessoaJuridica cnpj){
        cnpj.setId((int)(Math.random()*20));
        cnpj.setCnpj(String.valueOf((int)(Math.random()*20)));
        cnpj.setCelular(String.valueOf((int)(Math.random()*20)));
        cnpj.getPontuacao().adicionar((int)(Math.random()*30));
    }

}
