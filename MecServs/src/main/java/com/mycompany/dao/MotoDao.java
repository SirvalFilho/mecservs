/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.dao;


import com.mycompany.models.Moto;
import java.util.List;

/**
 *
 * @author Sirval
 */
public interface MotoDao {
    public void registrar(Moto moto) throws Exception;
    public List<Moto> listar() throws Exception;
}
