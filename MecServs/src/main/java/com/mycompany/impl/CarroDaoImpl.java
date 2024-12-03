/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.impl;

import com.mycompany.dao.CarroDao;
import com.mycompany.db.DataBase;
import com.mycompany.models.Carro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Sirval
 */
public class CarroDaoImpl extends DataBase implements CarroDao{

    public static List<Carro> carrosDisponiveis;
   
    @Override
    public void registrar(Carro carro) throws Exception {
       try{
           this.Conectar();
            PreparedStatement st = this.connection.prepareStatement("INSERT INTO carros(tipo, placa, modelo, ano_fabri, tipo_combust, numero_portas, capacidade_port)"
                    + " VALUES(?,?,?,?,?,?,?);");
            st.setString(1, carro.getTipo());
            st.setString(2, carro.getPlaca());
            st.setString(3, carro.getModelo());
            st.setInt(4, carro.getAnoFabric());
            st.setString(5, carro.getTipoCombustivel());
            st.setInt(6, carro.getNumPortas());
            st.setInt(7, carro.getCapacidadePortaMalas());
            st.executeUpdate();
            st.close();
            carrosDisponiveis = this.listar();
       }catch(Exception e){
            throw e;
       }finally {
            this.Encerrar();
        }
    }

    @Override
    public List<Carro> listar() throws Exception {
        List<Carro> lista = null;
        try{
            this.Conectar(); 
             String query = "SELECT * FROM carros";
             PreparedStatement st = this.connection.prepareStatement(query);
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                Carro carro = new Carro();
                carro.setTipo(rs.getString("tipo"));
                carro.setPlaca(rs.getString("placa"));
                carro.setModelo(rs.getString("modelo"));
                carro.setAnoFabric(rs.getInt("ano_fabri"));
                carro.setTipoCombustivel(rs.getString("tipo_combust"));
                carro.setNumPortas(rs.getInt("numero_portas"));
                carro.setCapacidadePortaMalas(rs.getInt("capacidade_port"));
                lista.add(carro);
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
