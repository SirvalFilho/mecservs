/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.views.vehicles;

/**
 *
 * @author Sirval
 */
public class OptionMoto extends javax.swing.JPanel {

    /**
     * Creates new form OptionMoto
     */
    public OptionMoto() {
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

        inputTipoPartida = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        inputCilindradas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputTipoFreio = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        inputTipoPartida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eletrica", "Pedal", "Mista" }));

        jLabel6.setText("Cilindradas");

        jLabel4.setText("Tipo do Freio");

        inputTipoFreio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disco", "Tambor", "ABS" }));
        inputTipoFreio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTipoFreioActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo da Partida");

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
                                .addComponent(inputTipoFreio, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputCilindradas, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
                            .addComponent(inputTipoPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 34, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCilindradas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputTipoFreio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputTipoPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inputTipoFreioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTipoFreioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTipoFreioActionPerformed
    public javax.swing.JTextField getInputCilindradas() {
        return inputCilindradas;
    }

    /**
     * @return the inputNumPortas
     */
    public javax.swing.JComboBox<String> getInputTipoFreio() {
        return inputTipoFreio;
    }

    /**
     * @return the inputTipoCombus
     */
    public javax.swing.JComboBox<String> getInputTipoPartida() {
        return inputTipoPartida;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField inputCilindradas;
    private javax.swing.JComboBox<String> inputTipoFreio;
    private javax.swing.JComboBox<String> inputTipoPartida;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
