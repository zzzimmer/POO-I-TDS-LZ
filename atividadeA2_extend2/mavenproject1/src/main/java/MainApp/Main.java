package MainApp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import domain.*;
import domain.estendido.*;
/**
 *
 * @author lucaszimmermann
 */
public class Main {
    public static void main(String[] args) {
        
        Cor cor2 = new Cor(7789,"Azul Petróleo");
        Cor cor3 = new Cor(4454, "Verde Oliva");
        
        Motor motor1 = new Motor();// por que ele não tem construtores alem do padrao?
        motor1.setPotencia(90);
        Motor motor2 = new Motor();//novo
        motor2.setPotencia(120);
        Motor motor3 = new Motor();//novo
        motor3.setPotencia(160);
        
        
        Modelo modelo1 = new Modelo (99,"Corola");
        Modelo modelo2 = new Modelo (07,"Civic");
        
        Marca marca1 = new Marca ("Toyota", 33);
        Marca marca2 = new Marca ("Honda", 12);
               
    
        Veiculo vrum1 = new Veiculo("L3L4L6",modelo1);
        Veiculo vrum2 = new Veiculo("3K5K9K",modelo2);
        Veiculo vrum3 = new Veiculo("4J5J9J", new Modelo (02,"Chevette")); 
        
        Modelo modelo3 = vrum3.getModelo();// instancia uma variável para a marca de vrum3
        Marca marca3 = new Marca("Chevrolet",66);//Cria a marca 3
        modelo3.setMarca(marca3);// existe algum caso onde se faria essa volta toda? nao ne
        
        vrum1.getModelo().setMarca(marca1);
        vrum2.getModelo().setMarca(marca2);
        
        vrum1.setCor(cor2);
        vrum2.setCor(cor2);
        vrum3.setCor(cor3);
       
        vrum1.getModelo().setMotor(motor1);
        vrum2.getModelo().setMotor(motor2);
        vrum3.getModelo().setMotor(motor3);
        
        vrum1.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.FLEX);
        vrum2.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.GASOLINA);
        vrum3.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.DIESEL);
        
        vrum1.getModelo().setEcategoria(Ecategoria.PADRAO);
        vrum2.getModelo().setEcategoria(Ecategoria.PEQUENO);
        vrum3.getModelo().setEcategoria(Ecategoria.MEDIO);
        
        print(vrum1);
        print(vrum2);
        print(vrum3);
        
                
    }
     public static void print(Veiculo veiculo){
            System.out.println("-------------------------------");
            System.out.println("O veiculo consultado é: "+veiculo.getModelo().getNome());
            System.out.println("De código de identificação: "+veiculo.getId());
            System.out.println("Número de Identificação do Modelo: "+ veiculo.getModelo().getId());
            System.out.println("Que apresenta a placa: "+veiculo.getPlaca());
            System.out.println("Tem a cor: "+ veiculo.getCor().getNome());
            System.out.println("");
            System.out.println("Este veículo apresenta potência de: "
            +veiculo.getModelo().getMotor().getPotencia()+"Hp");
            System.out.println("É movido por combustível: "+ veiculo.getModelo().getMotor().getTipoCombustivel());
            System.out.println("A categoria deste veiculo é: "+veiculo.getModelo().getEcategoria());
            System.out.println("-------------------------------");
            
        }
        
}
