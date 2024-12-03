/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.views.appointments;

import com.mycompany.impl.AgendamentoDaoImpl;
import com.mycompany.impl.CarroDaoImpl;
import com.mycompany.models.Agendamento;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sirval
 */
public class TableAllAppointments extends javax.swing.JPanel {

    private AgendamentoDaoImpl agendamentos = new AgendamentoDaoImpl();
    
    public TableAllAppointments() {
        initComponents();
        loadAppointments();
        initStyles();
        changeStatus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel = new javax.swing.JScrollPane();
        tableContent = new javax.swing.JTable();

        tableContent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Veículo", "Serviço", "DataAgendamento", "DataEntrega", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jpanel.setViewportView(tableContent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jpanel;
    private javax.swing.JTable tableContent;
    // End of variables declaration//GEN-END:variables

    private void loadAppointments() {
       try{
              DefaultTableModel model = (DefaultTableModel) tableContent.getModel();
              if( AgendamentoDaoImpl.agendamentosDisponiveis != null){
                  AgendamentoDaoImpl.agendamentosDisponiveis.forEach((u)->model.addRow(new Object[]{u.getVeiculo(),u.getServico(),formateDate(u.getDataAgendamento()),formateDate(u.getDataDeEntrega()),u.getStatus()}));      
              }
    }catch(Exception e){
              System.out.println("Nao foi possivel listar os veiculos." + e.getMessage());
     }
}
    private String formateDate(Date date){
         SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = formatter.format(date);
        return formattedDate;
    }

    private void initStyles() {
       //Alinhar o texto ao centro
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        
        // Aplica o alinhamento nas colunas
        for (int i = 0; i < tableContent.getColumnCount(); i++) {
            tableContent.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    private void changeStatus() {
       // Adiciona um MouseListener para capturar cliques
            tableContent.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int row = tableContent.rowAtPoint(e.getPoint()); // Linha clicada
                    int column = tableContent.columnAtPoint(e.getPoint()); // Coluna clicada

                    if (row >= 0 && column == 4) {
                       if(!tableContent.getValueAt(row, column).equals("FINALIZADO")){
                           int resposta = JOptionPane.showConfirmDialog(
                                   jpanel,
                                   "Deseja realmente alterar o status?",
                                   "Confirmação",
                                   JOptionPane.YES_NO_OPTION
                           );
                           if (resposta == JOptionPane.YES_OPTION) {
                               // Altera o valor da célula
                               if(tableContent.getValueAt(row, column).equals("AGENDADO")){
                                   String novoValor = "EM EXECUCAO";
                                   try {
                                       agendamentos.atualizarStatus(String.valueOf(tableContent.getValueAt(row, 0)), novoValor);
                                   } catch (Exception ex) {
                                       Logger.getLogger(TableAllAppointments.class.getName()).log(Level.SEVERE, null, ex);
                                   }
                                   if (novoValor != null && !novoValor.trim().isEmpty()) {
                                       tableContent.setValueAt(novoValor, row, column);
                                   }
                               }else{
                                   String novoValor = "FINALIZADO";
                                    try {
                                       agendamentos.atualizarStatus(String.valueOf(tableContent.getValueAt(row, 0)), novoValor);
                                   } catch (Exception ex) {
                                       Logger.getLogger(TableAllAppointments.class.getName()).log(Level.SEVERE, null, ex);
                                   }
                                   if (novoValor != null && !novoValor.trim().isEmpty()) {
                                       tableContent.setValueAt(novoValor, row, column);
                                   }
                               }
                           }
                       } else {
                       }
                    }
                }
            });

    }
}