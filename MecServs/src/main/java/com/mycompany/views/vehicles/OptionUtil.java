/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.views.vehicles;

/**
 *
 * @author Sirval
 */
public class OptionUtil extends javax.swing.JPanel {

    /**
     * Creates new form OptionUtil
     */
    public OptionUtil() {
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

        inputTipoTracao = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        inputCapacidadeCarga = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputNumeroEixos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        inputTipoTracao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4 X 2", "4 X 4", "6 X 2", "6 X 4", "8 X 2", "8 X 4" }));

        jLabel6.setText("Capacidade de Cargas (em toneladas)");

        jLabel4.setText("Número de Eixos");

        inputNumeroEixos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "7", "9" }));
        inputNumeroEixos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNumeroEixosActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo de Tração");

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
                                .addComponent(inputNumeroEixos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputCapacidadeCarga, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
                            .addComponent(inputTipoTracao, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 34, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCapacidadeCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputNumeroEixos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputTipoTracao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inputNumeroEixosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNumeroEixosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNumeroEixosActionPerformed
     public javax.swing.JTextField getCapacidadeCarga() {
        return inputCapacidadeCarga;
    }

    /**
     * @return the inputNumPortas
     */
    public javax.swing.JComboBox<String> getNumeroEixos() {
        return inputNumeroEixos;
    }

    /**
     * @return the inputTipoCombus
     */
    public javax.swing.JComboBox<String> getInputTipoTracao() {
        return inputTipoTracao;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField inputCapacidadeCarga;
    private javax.swing.JComboBox<String> inputNumeroEixos;
    private javax.swing.JComboBox<String> inputTipoTracao;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
