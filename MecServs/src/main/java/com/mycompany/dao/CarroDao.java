/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.models.Carro;
import java.util.List;

/**
 *
 * @author Sirval
 */
public interface CarroDao {
    public void registrar(Carro carro) throws Exception;
    public List<Carro> listar() throws Exception;
}
