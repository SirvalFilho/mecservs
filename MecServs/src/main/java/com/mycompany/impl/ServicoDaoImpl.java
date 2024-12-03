/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.impl;

import com.mycompany.dao.ServicoDao;
import com.mycompany.db.DataBase;
import com.mycompany.models.Carro;
import com.mycompany.models.Servico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sirval
 */
public class ServicoDaoImpl extends DataBase implements ServicoDao{

    public static List<Servico> servicosDisponiveis;
    
    @Override
    public void registrar(Servico servico) throws Exception {
        try{
           this.Conectar();
            PreparedStatement st = this.connection.prepareStatement("INSERT INTO servicos(nome, descricao, valor, tipo_servico)"
                    + " VALUES(?,?,?,?);");
            st.setString(1, servico.getNome());
            st.setString(2, servico.getDescricao());
            st.setDouble(3, servico.getValor());
            st.setString(4, servico.getTipoServico());
            st.executeUpdate();
            st.close();
            servicosDisponiveis = this.listarTodos();
       }catch(Exception e){
            throw e;
       }finally {
            this.Encerrar();
        }
    }

    @Override
    public List<Servico> listarTodos() throws Exception {
        List<Servico> lista = null;
        try{
            this.Conectar(); 
             String query = "SELECT * FROM servicos";
             PreparedStatement st = this.connection.prepareStatement(query);
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                Servico servico = new Servico();
                servico.setNome(rs.getString("nome"));
                servico.setDescricao(rs.getString("descricao"));
                servico.setValor(rs.getDouble("valor"));
                servico.setTipoServico(rs.getString("tipo_servico"));
                lista.add(servico);
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
    
}
