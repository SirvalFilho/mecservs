/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

/**
 *
 * @author Sirval
 */
public class Carro extends Veiculo {
    
    private String tipoCombustivel;
    private Integer numPortas;
    private Integer capacidadePortaMalas;

    public Carro(){
        this.setTipo("CARRO");
    }
    
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public Integer getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(Integer numPortas) {
        this.numPortas = numPortas;
    }

    public Integer getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }

    public void setCapacidadePortaMalas(Integer capacidadePortaMalas) {
        this.capacidadePortaMalas = capacidadePortaMalas;
    }
    
    
}
