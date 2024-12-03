/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.impl;

import com.mycompany.dao.UtilitarioDao;
import com.mycompany.db.DataBase;
import com.mycompany.models.Moto;
import com.mycompany.models.Utilitario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sirval
 */
public class UtilDaoImpl extends DataBase implements UtilitarioDao{

    public static List<Utilitario> utilsDisponiveis;
    
    @Override
    public void registrar(Utilitario utilitario) throws Exception {
        try{
           this.Conectar();
            PreparedStatement st = this.connection.prepareStatement("INSERT INTO utilitarios(tipo, placa, modelo, ano_fabri, capacidade_carga, numero_eixos, tipo_tracao)"
                    + " VALUES(?,?,?,?,?,?,?);");
            st.setString(1, utilitario.getTipo());
            st.setString(2, utilitario.getPlaca());
            st.setString(3, utilitario.getModelo());
            st.setInt(4, utilitario.getAnoFabric());
            st.setInt(5, (int)utilitario.getCapacidadeCarga());
            st.setInt(6, utilitario.getNumeroEixos());
            st.setString(7, utilitario.getTipoTração());
            st.executeUpdate();
            st.close();
            utilsDisponiveis = this.listar();
       }catch(Exception e){
            throw e;
       }finally {
            this.Encerrar();
        }
    }

    @Override
    public List<Utilitario> listar() throws Exception {
       List<Utilitario> lista = null;
        try{
            this.Conectar(); 
             String query = "SELECT * FROM utilitarios";
             PreparedStatement st = this.connection.prepareStatement(query);
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                Utilitario util = new Utilitario();
                util.setTipo(rs.getString("tipo"));
                util.setPlaca(rs.getString("placa"));
                util.setModelo(rs.getString("modelo"));
                util.setAnoFabric(rs.getInt("ano_fabri"));
                util.setCapacidadeCarga(rs.getInt("capacidade_carga"));
                util.setNumeroEixos(rs.getInt("numero_eixos"));
                util.setTipoTração(rs.getString("tipo_tracao"));
                lista.add(util);
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
