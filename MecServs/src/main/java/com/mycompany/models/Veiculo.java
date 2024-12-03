/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

/**
 *
 * @author Sirval
 */
public abstract class Veiculo {
    
    //Para facilitar a identificação nas tabelas
    private String tipo;
    
    private String placa;
    private String modelo;
    private Integer anoFabric;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnoFabric() {
        return anoFabric;
    }

    public void setAnoFabric(Integer anoFabric) {
        this.anoFabric = anoFabric;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
