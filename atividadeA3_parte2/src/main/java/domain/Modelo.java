/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;


/**
 *
 * @author lucaszimmermann
 */
public class Modelo {

    private int id;
    private String nome;
    private Marca marca;
    private Ecategoria categoria;
    private Motor motor;
    
    //---------------------------------------
    
    public Modelo() { 
        this.motor = new Motor();// Precisa ser adicionado para cumprir com o diagrama de classes
    }

    public Modelo(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.motor = new Motor();// Precisa ser adicionado para cumprir com o diagrama de classes
    }
    
    //---------------------------------------

    public int getId() {
        return id;
    }

    public void setId(int idTeste) { //Por que é void mesmo? não lembro
        this.id = idTeste;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Marca getMarca(){
        return marca;
    }
    public void setMarca(Marca marca){
        this.marca = marca;
    }
    
    //---------------------------------------
    
    public void setEcategoria(Ecategoria categoria){
        this.categoria = categoria;
    }
    
    public Ecategoria getEcategoria(){
        return categoria;
    }
    
    public void setMotor(Motor motor){
        this.motor = motor;
    }
    
    public Motor getMotor(){
        return motor;
    }
}
