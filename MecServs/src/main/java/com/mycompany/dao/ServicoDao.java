/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.models.Servico;
import java.util.List;

/**
 *
 * @author Sirval
 */
public interface ServicoDao {
    public void registrar(Servico servico) throws Exception;
    public List<Servico> listarTodos() throws Exception;
}
