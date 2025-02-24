package mainapp;

import domain.*;

import javax.swing.*;
import java.math.*;

public class MainApp {

    public static void main(String[] args) {

        
        Servico sv1 = new Servico();
        sv1.setDescricao("Lavação Completa");
        sv1.setId(99);
        sv1.setPontos(43);
        sv1.setValor(149.99);

        ItemOS itemOS1 = new ItemOS();
        itemOS1.setServico(sv1);
        itemOS1.setValorServico();

        OrdemServico os1 = new OrdemServico();
        os1.setNumero(22);
        os1.add(itemOS1);

        System.out.println(os1.calcularServico());
        System.out.println(os1.getNumero());


    }
}
