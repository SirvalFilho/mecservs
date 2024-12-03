/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.dao;


import com.mycompany.models.Agendamento;
import java.util.List;

/**
 *
 * @author Sirval
 */
public interface AgendamentoDao {
    public void registrar(Agendamento agendamento) throws Exception;
    public List<Agendamento> listarTodos() throws Exception;
    public List<Agendamento> listarTodosAgendados() throws Exception;
    public List<Agendamento> listarTodosEmExecucao() throws Exception;
    public List<Agendamento> listarTodosFinalizados() throws Exception;
    public void atualizarStatus(String placa,String status)throws Exception;
}
