/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Sirval
 */
public class Agendamento {
  
    private String veiculo;
    private String servico;
    private Date dataAgendamento;
    private Date dataDeEntrega;
    private String status;

    public Agendamento(){
        this.setStatus("AGENDADO");
    }
    
    
    public Date getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(Date dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

  

    public Date getDataDeEntrega() {
        return dataDeEntrega;
    }

    public void setDataDeEntrega(Date dataDeEntrega) {
        this.dataDeEntrega = dataDeEntrega;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
