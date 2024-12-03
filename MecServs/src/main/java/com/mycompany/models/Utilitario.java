/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

/**
 *
 * @author Sirval
 */
public class Utilitario extends Veiculo {
    
    private Integer capacidadeCarga;
    private Integer numeroEixos;
    private String tipoTração;
    
    public Utilitario(){
        this.setTipo("UTIL");
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(Integer capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public Integer getNumeroEixos() {
        return numeroEixos;
    }

    public void setNumeroEixos(Integer numeroEixos) {
        this.numeroEixos = numeroEixos;
    }

    public String getTipoTração() {
        return tipoTração;
    }

    public void setTipoTração(String tipoTração) {
        this.tipoTração = tipoTração;
    }
    
}
