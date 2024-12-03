/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sirval
 */
public class DataBase {
    /*
        O bando de dados H2 foi selecionado por ser um banco de dados em memória,facilitando suas conecções e teste
    porem sua funcionalidade é igual a qualquer outro banco de dados relacional, sendo assim, para migrar de um banco para outro
    basta mudar os endereços de conecção.
    
    */
    static protected Connection connection;
    static private final String JDBC_DRIVER = "org.h2.Driver";
    static private final String DB_URL = "jdbc:h2:mem:testdb";
    
    static private final String USER = "sa";
    static private final String PASS = "";
    
    public static void Conectar() throws ClassNotFoundException {
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar com o banco de dados.");
        }
    }
    
    public void Encerrar() throws SQLException{
        if (connection != null) {
            if (!connection.isClosed()) {
                connection.close();
            }
        }
    } 
    public static void CriarTabelas() {
         if (connection == null) {
         try{
             DataBase.Conectar();
         }catch(ClassNotFoundException e){
             System.out.println("Nao foi possivel fazer a conecao.");
         }
         }
            if (connection != null) {
             try {
                 if (!connection.isClosed()) {
                     Statement statement = connection.createStatement();
                     //Criando tabela Carros
                     statement.execute("CREATE TABLE IF NOT EXISTS carros("
                             +"tipo VARCHAR(100),"
                             +"placa VARCHAR(100) PRIMARY KEY,"
                             +"modelo VARCHAR(100),"
                             +"ano_fabri INT,"
                             +"tipo_combust VARCHAR(100),"
                             +"numero_portas INT,"
                             +"capacidade_port INT);");
                      statement.execute("CREATE TABLE IF NOT EXISTS motos("
                             +"tipo VARCHAR(100),"
                             +"placa VARCHAR(100) PRIMARY KEY,"
                             +"modelo VARCHAR(100),"
                             +"ano_fabri INT,"
                             +"cilindradas INT,"
                             +"tipo_freio VARCHAR(100),"
                             +"tipo_partida VARCHAR(100))");
                      //Criando tabela Utilitarios
                       statement.execute("CREATE TABLE IF NOT EXISTS utilitarios("
                             +"tipo VARCHAR(100),"
                             +"placa VARCHAR(100) PRIMARY KEY,"
                             +"modelo VARCHAR(100),"
                             +"ano_fabri INT,"
                             +"capacidade_carga INT,"
                             +"numero_eixos INT,"
                             +"tipo_tracao VARCHAR(100))");
                       //Criando tabela Servicos
                       statement.execute("CREATE TABLE IF NOT EXISTS servicos("
                             +"nome VARCHAR(100) PRIMARY KEY,"
                             +"descricao VARCHAR(100),"
                             +"valor DECIMAL(6,2),"
                             +"tipo_servico VARCHAR(100))");
                        //Criando tabela Agendamentos
                       statement.execute("CREATE TABLE IF NOT EXISTS agendamentos("
                             +"veiculo VARCHAR(100) PRIMARY KEY,"
                             +"servico VARCHAR(100),"
                             +"data_agendamento DATE,"
                             +"data_de_entrega DATE,"
                             +"status VARCHAR(100))"  );
                 }} catch (SQLException ex) {
                 Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
                 System.out.println("Nao foi possivel criar a tabela");
             }
        }
     }
}
