/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.impl;

import com.mycompany.dao.MotoDao;
import com.mycompany.db.DataBase;
import com.mycompany.models.Moto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sirval
 */
public class MotoDaoImpl extends DataBase implements MotoDao  {

    public static List<Moto> motosDisponiveis;
    public MotoDaoImpl() {
    }

    @Override
    public void registrar(Moto moto) throws Exception {
        try{
           this.Conectar();
            PreparedStatement st = this.connection.prepareStatement("INSERT INTO motos(tipo, placa, modelo, ano_fabri, cilindradas, tipo_freio, tipo_partida)"
                    + " VALUES(?,?,?,?,?,?,?);");
            st.setString(1, moto.getTipo());
            st.setString(2, moto.getPlaca());
            st.setString(3, moto.getModelo());
            st.setInt(4, moto.getAnoFabric());
            st.setInt(5, moto.getCilindradas());
            st.setString(6, moto.getTipoFreio());
            st.setString(7, moto.getTipoPartida());
            st.executeUpdate();
            st.close();
            motosDisponiveis = this.listar();
       }catch(Exception e){
            throw e;
       }finally {
            this.Encerrar();
        }
    }

    @Override
    public List<Moto> listar() throws Exception {
        List<Moto> lista = null;
        try{
            this.Conectar(); 
             String query = "SELECT * FROM motos";
             PreparedStatement st = this.connection.prepareStatement(query);
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                Moto moto = new Moto();
                moto.setTipo(rs.getString("tipo"));
                moto.setPlaca(rs.getString("placa"));
                moto.setModelo(rs.getString("modelo"));
                moto.setAnoFabric(rs.getInt("ano_fabri"));
                moto.setCilindradas(rs.getInt("cilindradas"));
                moto.setTipoFreio(rs.getString("tipo_freio"));
                moto.setTipoPartida(rs.getString("tipo_partida"));
                lista.add(moto);
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
