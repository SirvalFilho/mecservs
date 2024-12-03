/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.views.vehicles;

import com.mycompany.mecservs.Dashboard;
import com.mycompany.models.Carro;

/**
 *
 * @author Sirval
 */
public class OptionCar extends javax.swing.JPanel {

    /**
     * Creates new form OptionCar
     */
    public OptionCar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        inputCapacidadePort = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputTipoCombus = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        inputNumPortas = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Capacidade do Porta Malas (em Litros)");

        jLabel4.setText("Tipo do Combustivel");

        inputTipoCombus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasolina", "Álcool", "Diesel", "Elétrico", "Flex", "Hibrído" }));
        inputTipoCombus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTipoCombusActionPerformed(evt);
            }
        });

        jLabel5.setText("Número de portas");

        inputNumPortas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(inputTipoCombus, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputCapacidadePort, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
                            .addComponent(inputNumPortas, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 34, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCapacidadePort, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputTipoCombus, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNumPortas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inputTipoCombusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTipoCombusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTipoCombusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField inputCapacidadePort;
    private javax.swing.JComboBox<String> inputNumPortas;
    private javax.swing.JComboBox<String> inputTipoCombus;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the inputCapacidadePort
     */
    public javax.swing.JTextField getInputCapacidadePort() {
        return inputCapacidadePort;
    }

    /**
     * @return the inputNumPortas
     */
    public javax.swing.JComboBox<String> getInputNumPortas() {
        return inputNumPortas;
    }

    /**
     * @return the inputTipoCombus
     */
    public javax.swing.JComboBox<String> getInputTipoCombus() {
        return inputTipoCombus;
    }
}
