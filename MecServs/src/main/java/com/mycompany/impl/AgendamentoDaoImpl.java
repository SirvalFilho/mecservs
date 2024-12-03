/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.impl;

import com.mycompany.dao.AgendamentoDao;
import com.mycompany.db.DataBase;
import com.mycompany.models.Agendamento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Sirval
 */
public class AgendamentoDaoImpl extends DataBase implements AgendamentoDao{

    public static List<Agendamento> agendamentosDisponiveis;
    
    @Override
    public void registrar(Agendamento agendamento) throws Exception {
       try{
           this.Conectar();
            PreparedStatement st = this.connection.prepareStatement("INSERT INTO agendamentos(veiculo, servico, data_agendamento, data_de_entrega, status)"
                    + " VALUES(?,?,?,?,?);");
            st.setString(1, agendamento.getVeiculo());
            st.setString(2, agendamento.getServico());
            java.sql.Date sqlDate1 = new java.sql.Date(agendamento.getDataAgendamento().getTime());
            st.setDate(3, sqlDate1);
            java.sql.Date sqlDate2 = new java.sql.Date(agendamento.getDataDeEntrega().getTime());
            st.setDate(4, sqlDate2);
            st.setString(5,  agendamento.getStatus());
            st.executeUpdate();
            st.close();
            agendamentosDisponiveis = this.listarTodos();
       }catch(Exception e){
            throw e;
       }finally {
            this.Encerrar();
        }
    }

    @Override
    public List<Agendamento> listarTodos() throws Exception {
         List<Agendamento> lista = null;
        try{
            this.Conectar(); 
             String query = "SELECT * FROM agendamentos";
             PreparedStatement st = this.connection.prepareStatement(query);
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                Agendamento agendamento = new Agendamento();
                agendamento.setVeiculo(rs.getString("veiculo"));
                agendamento.setServico(rs.getString("servico"));
                agendamento.setDataAgendamento(rs.getDate("data_agendamento"));
                agendamento.setDataDeEntrega(rs.getDate("data_de_entrega"));
                agendamento.setStatus(rs.getString("status"));
                lista.add(agendamento);
            }
            rs.close();
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            this.Encerrar();
        }
         return lista;
    }

    @Override
    public List<Agendamento> listarTodosAgendados() throws Exception {
       List<Agendamento> lista = null;
        try{
            this.Conectar(); 
             String query = "SELECT * FROM agendamentos WHERE status = 'AGENDADO' ";
             PreparedStatement st = this.connection.prepareStatement(query);
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                Agendamento agendamento = new Agendamento();
                agendamento.setVeiculo(rs.getString("veiculo"));
                agendamento.setServico(rs.getString("servico"));
                agendamento.setDataAgendamento(rs.getDate("data_agendamento"));
                agendamento.setDataDeEntrega(rs.getDate("data_de_entrega"));
                agendamento.setStatus(rs.getString("status"));
                lista.add(agendamento);
            }
            rs.close();
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            this.Encerrar();
        }
         return lista;
    }

    @Override
    public List<Agendamento> listarTodosEmExecucao() throws Exception {
         List<Agendamento> lista = null;
        try{
            this.Conectar(); 
             String query = "SELECT * FROM agendamentos WHERE status = 'EM EXECUCAO' ";
             PreparedStatement st = this.connection.prepareStatement(query);
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                Agendamento agendamento = new Agendamento();
                agendamento.setVeiculo(rs.getString("veiculo"));
                agendamento.setServico(rs.getString("servico"));
                agendamento.setDataAgendamento(rs.getDate("data_agendamento"));
                agendamento.setDataDeEntrega(rs.getDate("data_de_entrega"));
                agendamento.setStatus(rs.getString("status"));
                lista.add(agendamento);
            }
            rs.close();
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            this.Encerrar();
        }
         return lista;
    }

    @Override
    public List<Agendamento> listarTodosFinalizados() throws Exception {
         List<Agendamento> lista = null;
        try{
            this.Conectar(); 
             String query = "SELECT * FROM agendamentos WHERE status = 'FINALIZADO' ";
             PreparedStatement st = this.connection.prepareStatement(query);
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                Agendamento agendamento = new Agendamento();
                agendamento.setVeiculo(rs.getString("veiculo"));
                agendamento.setServico(rs.getString("servico"));
                agendamento.setDataAgendamento(rs.getDate("data_agendamento"));
                agendamento.setDataDeEntrega(rs.getDate("data_de_entrega"));
                agendamento.setStatus(rs.getString("status"));
                lista.add(agendamento);
            }
            rs.close();
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            this.Encerrar();
        }
         return lista;
    }

    @Override
    public void atualizarStatus(String placa,String status) throws Exception {
        try{
           this.Conectar();
            PreparedStatement st = this.connection.prepareStatement("UPDATE agendamentos SET status = ? WHERE veiculo = ?;"
                    );
            st.setString(1, status);
            st.setString(2, placa);
            st.executeUpdate();
            st.close();
            agendamentosDisponiveis = this.listarTodos();
       }catch(Exception e){
            throw e;
       }finally {
            this.Encerrar();
        }
    }
}
