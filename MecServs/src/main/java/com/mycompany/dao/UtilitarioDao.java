/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.dao;


import com.mycompany.models.Utilitario;
import java.util.List;

/**
 *
 * @author Sirval
 */
public interface UtilitarioDao {
    public void registrar(Utilitario utilitario) throws Exception;
    public List<Utilitario> listar() throws Exception;
}
