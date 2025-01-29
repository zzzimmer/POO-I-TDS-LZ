/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package domain;

/**
 *
 * @author lucaszimmermann
 */
public class Cor {

    private long id;
    private String nome;

    public Cor() {
    }

    public Cor(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
///////////////////

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
