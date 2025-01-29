/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.estendido;

/**
 *
 * @author lucaszimmermann
 */
public class Motor {
    private int potencia;
    private ETipoCombustivel TipoCombustivel;
    
//---------------------------------------
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
    
    public int getPotencia(){
        return potencia;
    }
    
    public void setTipoCombustivel (ETipoCombustivel Tipocombustivel){
        this.TipoCombustivel = Tipocombustivel;
    }
    
    public ETipoCombustivel getTipoCombustivel(){
        return TipoCombustivel;
    } 
 //---------------------------------------
    
}
