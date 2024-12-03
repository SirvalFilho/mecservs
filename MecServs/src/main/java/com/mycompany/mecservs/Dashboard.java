/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mecservs;


import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import com.mycompany.db.DataBase;
import com.mycompany.views.appointments.AllAppointments;
import com.mycompany.views.services.AllServices;
import com.mycompany.views.vehicles.AllVehicles;
import com.mycompany.views.start.Start;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

/**
 *
 * @author Sirval
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard(){
        initComponents();
        initStyles();
        setDate();
        renderPage();
        DataBase.CriarTabelas();
    }
    private void initStyles(){
        message.putClientProperty( "FlatLaf.style", "font: 14 $light.font" );
        message.setForeground(Color.BLACK);
        appName.putClientProperty("FlatLaf.style", "font: bold $h1.regular.font");
        appName.setForeground(Color.white);
        dateText.putClientProperty("FlatLaf.style", "font: 26 $light.font");
        dateText.setForeground(Color.white);
        
        //Configuração dos botões do menu
        btnInicio.putClientProperty( "FlatLaf.style", "font: 22 $light.font" );
        btnCarros.putClientProperty( "FlatLaf.style", "font: 22 $light.font" );
        btnServicos.putClientProperty( "FlatLaf.style", "font: 22 $light.font" );
        btnAgendamentos.putClientProperty( "FlatLaf.style", "font: 22 $light.font" );
        
        btnInicio.setBorder(null);
        btnCarros.setBorder(null);
        btnServicos.setBorder(null);
        btnAgendamentos.setBorder(null);
        
        btnInicio.setForeground(Color.BLACK);
        btnCarros.setForeground(Color.BLACK);
        btnServicos.setForeground(Color.BLACK);
        btnAgendamentos.setForeground(Color.BLACK);
        
        
        btnInicio.setBackground(Color.WHITE);
        btnCarros.setBackground(Color.WHITE);
        btnServicos.setBackground(Color.WHITE);
        btnAgendamentos.setBackground(Color.WHITE);
        
        
        ButtonGroup group = new ButtonGroup();
        group.add(btnInicio);
        group.add(btnCarros);
        group.add(btnServicos);
         group.add(btnAgendamentos);
        
        ActionListener listener = e -> {
            
            JToggleButton selectedButton = (JToggleButton) e.getSource();

            // Reseta a cor de todos os botões
           btnInicio.setBorder(null);
           btnCarros.setBorder(null);
           btnServicos.setBorder(null);
           btnAgendamentos.setBorder(null);
           
           btnInicio.setBackground(Color.WHITE);
           btnCarros.setBackground(Color.WHITE);
           btnServicos.setBackground(Color.WHITE);
           btnAgendamentos.setBackground(Color.WHITE);
           
           btnInicio.setForeground(Color.BLACK);
           btnCarros.setForeground(Color.BLACK);
           btnServicos.setForeground(Color.BLACK);
           btnAgendamentos.setForeground(Color.BLACK);
           
            // Define uma cor ativa para o botão selecionado
            if (selectedButton.isSelected()) {
                selectedButton.setBackground(new Color(15,7,55));
                selectedButton.setForeground(Color.WHITE);
            }

        };
        
        btnInicio.addActionListener(listener);
        btnCarros.addActionListener(listener);
        btnServicos.addActionListener(listener);
        btnAgendamentos.addActionListener(listener);
    }
    
    //Função para apresentar a data no dashboard
    private void setDate() {
        LocalDate now = LocalDate.now();
        dateText.setText(now.format(DateTimeFormatter.ofPattern("'Hoje é' dd 'de' MMMM 'de' yyyy")));
    }
    
    public void renderPage(){
        ShowJPanel(new Start());
    }
    
   public static void ShowJPanel(JPanel p) {
        p.setSize(750, 490);
        p.setLocation(0,0);
        
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        appName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnInicio = new javax.swing.JToggleButton();
        btnCarros = new javax.swing.JToggleButton();
        btnServicos = new javax.swing.JToggleButton();
        btnAgendamentos = new javax.swing.JToggleButton();
        header = new javax.swing.JPanel();
        dateText = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        message = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));

        menu.setBackground(new java.awt.Color(110, 77, 244));

        appName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appName.setText("MECSERVS");

        btnInicio.setText("Inicio");
        btnInicio.setBorder(null);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInicioMouseExited(evt);
            }
        });
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnCarros.setText("Veículos");
        btnCarros.setBorder(null);
        btnCarros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCarrosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCarrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarrosMouseExited(evt);
            }
        });
        btnCarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarrosActionPerformed(evt);
            }
        });

        btnServicos.setText("Serviços");
        btnServicos.setBorder(null);
        btnServicos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnServicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnServicosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnServicosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnServicosMouseExited(evt);
            }
        });
        btnServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicosActionPerformed(evt);
            }
        });

        btnAgendamentos.setText("Agendamentos");
        btnAgendamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendamentosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(appName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(55, 55, 55))
            .addComponent(btnInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCarros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnServicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addComponent(btnAgendamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(appName, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgendamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        header.setBackground(new java.awt.Color(43, 19, 133));

        dateText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateText.setText("Hoje é dia {dia} do {mes} de {ano}.");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        content.setBackground(new java.awt.Color(204, 204, 255));
        content.setLayout(new javax.swing.OverlayLayout(content));

        message.setText("MecServs - Agendamento de Serviços");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseEntered

    }//GEN-LAST:event_btnInicioMouseEntered

    private void btnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseExited

    }//GEN-LAST:event_btnInicioMouseExited

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked

    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnCarrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarrosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCarrosMouseClicked

    private void btnCarrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarrosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCarrosMouseEntered

    private void btnCarrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarrosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCarrosMouseExited

    private void btnCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarrosActionPerformed
       ShowJPanel(new AllVehicles());
    }//GEN-LAST:event_btnCarrosActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        ShowJPanel(new Start());
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnServicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServicosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnServicosMouseClicked

    private void btnServicosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServicosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnServicosMouseEntered

    private void btnServicosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServicosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnServicosMouseExited

    private void btnServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicosActionPerformed
        ShowJPanel(new AllServices());
    }//GEN-LAST:event_btnServicosActionPerformed

    private void btnAgendamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendamentosActionPerformed
        ShowJPanel(new AllAppointments());
    }//GEN-LAST:event_btnAgendamentosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         FlatMaterialLighterIJTheme.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appName;
    private javax.swing.JPanel background;
    private javax.swing.JToggleButton btnAgendamentos;
    private javax.swing.JToggleButton btnCarros;
    private javax.swing.JToggleButton btnInicio;
    private javax.swing.JToggleButton btnServicos;
    private static javax.swing.JPanel content;
    private javax.swing.JLabel dateText;
    private javax.swing.JPanel header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel message;
    // End of variables declaration//GEN-END:variables
}
