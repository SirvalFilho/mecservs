/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.views.vehicles;

import com.mycompany.impl.MotoDaoImpl;
import com.mycompany.dao.CarroDao;
import com.mycompany.dao.MotoDao;
import com.mycompany.dao.UtilitarioDao;
import com.mycompany.impl.CarroDaoImpl;
import com.mycompany.impl.UtilDaoImpl;
import com.mycompany.mecservs.Dashboard;
import com.mycompany.models.Carro;
import com.mycompany.models.Moto;
import com.mycompany.models.Utilitario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Sirval
 */
public class AddNewVehicle extends javax.swing.JPanel {

    /**
     * Creates new form AddNewCar
     */
    private OptionCar optionCar = new OptionCar();
    private OptionMoto optionMoto = new OptionMoto();
    private OptionUtil optionUtil = new OptionUtil();
    private String placaRegex = "^[A-Z]{3}[0-9][A-Z0-9][0-9]{2}$";

    
    public AddNewVehicle() {
        initComponents();
        initStyles();
        changeOption(optionCar);
        changeOptionalPainel();
    }

    private void initStyles(){
       message.putClientProperty( "FlatLaf.style", "font: 26 $light.font" );
       message.setForeground(Color.BLACK);
    }
    public void changeOption(JPanel p){
        p.setSize(375, 375);
        p.setLocation(0,0);
        
        option.removeAll();
        option.add(p, BorderLayout.CENTER);
        option.revalidate();
        option.repaint();
    }
    public void changeOptionalPainel(){
         inputTipo.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
           if (inputTipo.getSelectedItem().equals("Carro")) {
               changeOption(optionCar);
               cleanAllFields();
           } else if (inputTipo.getSelectedItem().equals("Moto")) {
              changeOption(optionMoto);
               cleanAllFields();
           }
           else if (inputTipo.getSelectedItem().equals("Utilitário")) {
              changeOption(optionUtil);
              cleanAllFields();
           }
      }
       });
    }
     public static String formatarInputs(String input) {
        StringBuilder placaFormatada = new StringBuilder();
        
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                placaFormatada.append(Character.toUpperCase(c));
            } else {
                placaFormatada.append(c);
            }
        }
        
        return placaFormatada.toString();
    }

    public void cleanAllFields(){
        inputPlaca.setText("");
        inputModelo.setText("");
        inputAnoFabri.setText("");
        optionCar.getInputCapacidadePort().setText("");
        optionCar.getInputNumPortas().setSelectedIndex(0);
        optionCar.getInputTipoCombus().setSelectedIndex(0);
        optionMoto.getInputCilindradas().setText("");
        optionMoto.getInputTipoFreio().setSelectedIndex(0);
        optionMoto.getInputTipoPartida().setSelectedIndex(0);
        optionUtil.getCapacidadeCarga().setText("");
        optionUtil.getInputTipoTracao().setSelectedIndex(0);
        optionUtil.getNumeroEixos().setSelectedIndex(0);
    }
    
    public boolean checkCarFields(){
         if (inputPlaca.getText().isEmpty()) {
         JOptionPane.showMessageDialog(null, "O campo de placa não pode estar vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
         inputPlaca.requestFocus(); // Foca no campo de placa para correção
         return false;
         } 
         if (inputPlaca.getText().length() != 7) {
          JOptionPane.showMessageDialog(null, "A placa deve ter exatamente 7 caracteres.", "Erro", JOptionPane.ERROR_MESSAGE);
          inputPlaca.requestFocus();
          return false;
         } 
          if(!inputPlaca.getText().matches(placaRegex)) {
           JOptionPane.showMessageDialog(null, "Formato de placa inválido. Use o formato ABC1234 ou ABC1D23.", "Erro", JOptionPane.ERROR_MESSAGE);
           inputPlaca.requestFocus();
           return false;
         } 
         if (inputModelo.getText().isEmpty()) {
         JOptionPane.showMessageDialog(null, "O campo de modelo não pode estar vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
         inputModelo.requestFocus(); // Foca no campo de placa para correção
         return false;
         } 
         if (inputAnoFabri.getText().isEmpty()) {
         JOptionPane.showMessageDialog(null, "O campo de ano de fabricação não pode estar vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
         inputAnoFabri.requestFocus(); // Foca no campo de placa para correção
         return false;
         } 
         if (Integer.parseInt(inputAnoFabri.getText())<1950) {
         JOptionPane.showMessageDialog(null, "Só são aceitos carros a partir de 1950", "Erro", JOptionPane.ERROR_MESSAGE);
         inputAnoFabri.requestFocus(); // Foca no campo de placa para correção
         return false;
         } 
          if (optionCar.getInputCapacidadePort().getText().isEmpty()) {
         JOptionPane.showMessageDialog(null, "O campo de capacidade do porta-malas não pode estar vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
         optionCar.getInputCapacidadePort().requestFocus(); // Foca no campo de placa para correção
         return false;
         } 
         return true;
    }
    public boolean checkMotoFields(){
         if (inputPlaca.getText().isEmpty()) {
         JOptionPane.showMessageDialog(null, "O campo de placa não pode estar vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
         inputPlaca.requestFocus(); // Foca no campo de placa para correção
         return false;
         } 
         if (inputPlaca.getText().length() != 7) {
          JOptionPane.showMessageDialog(null, "A placa deve ter exatamente 7 caracteres.", "Erro", JOptionPane.ERROR_MESSAGE);
          inputPlaca.requestFocus();
          return false;
         } 
         if (inputModelo.getText().isEmpty()) {
         JOptionPane.showMessageDialog(null, "O campo de modelo não pode estar vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
         inputModelo.requestFocus(); // Foca no campo de placa para correção
         return false;
         } 
         if (inputAnoFabri.getText().isEmpty()) {
         JOptionPane.showMessageDialog(null, "O campo de ano de fabricação não pode estar vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
         inputAnoFabri.requestFocus(); // Foca no campo de placa para correção
         return false;
         } 
         if (Integer.parseInt(inputAnoFabri.getText())<1950) {
         JOptionPane.showMessageDialog(null, "Só são aceitos carros a partir de 1950", "Erro", JOptionPane.ERROR_MESSAGE);
         inputAnoFabri.requestFocus(); // Foca no campo de placa para correção
         return false;
         } 
          if (optionMoto.getInputCilindradas().getText().isEmpty()) {
         JOptionPane.showMessageDialog(null, "O campo de cilindradas não pode estar vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
         optionCar.getInputCapacidadePort().requestFocus(); // Foca no campo de placa para correção
         return false;
         } 
         return true;
    }
    public boolean checkUtilFields(){
         if (inputPlaca.getText().isEmpty()) {
         JOptionPane.showMessageDialog(null, "O campo de placa não pode estar vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
         inputPlaca.requestFocus(); // Foca no campo de placa para correção
         return false;
         } 
         if (inputPlaca.getText().length() != 7) {
          JOptionPane.showMessageDialog(null, "A placa deve ter exatamente 7 caracteres.", "Erro", JOptionPane.ERROR_MESSAGE);
          inputPlaca.requestFocus();
          return false;
         } 
         if (inputModelo.getText().isEmpty()) {
         JOptionPane.showMessageDialog(null, "O campo de modelo não pode estar vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
         inputModelo.requestFocus(); // Foca no campo de placa para correção
         return false;
         } 
         if (inputAnoFabri.getText().isEmpty()) {
         JOptionPane.showMessageDialog(null, "O campo de ano de fabricação não pode estar vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
         inputAnoFabri.requestFocus(); // Foca no campo de placa para correção
         return false;
         } 
         if (Integer.parseInt(inputAnoFabri.getText())<1950) {
         JOptionPane.showMessageDialog(null, "Só são aceitos carros a partir de 1950", "Erro", JOptionPane.ERROR_MESSAGE);
         inputAnoFabri.requestFocus(); // Foca no campo de placa para correção
         return false;
         } 
          if (optionUtil.getCapacidadeCarga().getText().isEmpty()) {
         JOptionPane.showMessageDialog(null, "O campo de capacidade de carga não pode estar vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
         optionCar.getInputCapacidadePort().requestFocus(); // Foca no campo de placa para correção
         return false;
         } 
         return true;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        message = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        inputPlaca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputModelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputAnoFabri = new javax.swing.JTextField();
        inputTipo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        option = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JToggleButton();
        btnCadastrar = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(255, 255, 255));

        message.setText("Cadastrar um Novo Veículo");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setText("Placa");

        jLabel2.setText("Modelo");

        jLabel3.setText("Ano de Fabricação");

        inputTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro", "Moto", "Utilitário" }));
        inputTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTipoActionPerformed(evt);
            }
        });
        inputTipo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                inputTipoPropertyChange(evt);
            }
        });

        jLabel7.setText("Tipo de Veículo");

        option.setPreferredSize(new java.awt.Dimension(375, 430));

        javax.swing.GroupLayout optionLayout = new javax.swing.GroupLayout(option);
        option.setLayout(optionLayout);
        optionLayout.setHorizontalGroup(
            optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        optionLayout.setVerticalGroup(
            optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
        );

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(inputAnoFabri, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(inputTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(inputPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(option, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(8, 8, 8)
                        .addComponent(inputTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputAnoFabri, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(option, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Dashboard.ShowJPanel(new AllVehicles());
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        inputPlaca.setText(formatarInputs(inputPlaca.getText()));
        if(inputTipo.getSelectedItem().equals("Carro")){
           if(checkCarFields()){
             Carro newCarro = new Carro();
         
       
        String placa =inputPlaca.getText();
        String modelo = formatarInputs(inputModelo.getText());
        Integer anoDeFabri = Integer.valueOf(inputAnoFabri.getText());
        Integer capacidadePort = Integer.valueOf(optionCar.getInputCapacidadePort().getText());
        String tipoCombustivel = optionCar.getInputTipoCombus().getItemAt(optionCar.getInputTipoCombus().getSelectedIndex());
        Integer numPortas = Integer.valueOf(optionCar. getInputNumPortas().getItemAt(optionCar. getInputNumPortas().getSelectedIndex()));
        
        //Fazer validação dos campos
       

        //Setar valores
        newCarro.setPlaca(placa);
        newCarro.setModelo(modelo);
        newCarro.setAnoFabric(anoDeFabri);
        newCarro.setCapacidadePortaMalas(capacidadePort);
        newCarro.setTipoCombustivel(tipoCombustivel);
        newCarro.setNumPortas(numPortas);
        
        //Limpando os campos
        cleanAllFields();
        
        //Salvando Valores
        try{
            CarroDao dao = new CarroDaoImpl();
            dao.registrar(newCarro);
            JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!", "Confirmação",JOptionPane.INFORMATION_MESSAGE);
            //AllVehicles.loadVehicles();
        }catch(Exception e){
            System.out.println("Nao foi possivel cadastrar o novo carro no banco." + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao realizar o cadastro! Por favor, tente novamente.",   "Erro", JOptionPane.ERROR_MESSAGE);
        }
        }
 }
       
        
        //Adicionando moto
        if(inputTipo.getSelectedItem().equals("Moto")){
            if(checkMotoFields()){
                Moto newMoto = new Moto();
         
        
                String placa = inputPlaca.getText();
                String modelo = formatarInputs(inputModelo.getText());
                Integer anoDeFabri = Integer.valueOf(inputAnoFabri.getText());
                Integer capacidadeCarga = Integer.valueOf(optionMoto.getInputCilindradas().getText());
                String tipoFreio = optionMoto.getInputTipoFreio().getItemAt(optionMoto.getInputTipoFreio().getSelectedIndex());
                String tipoPartida =optionMoto.getInputTipoPartida().getItemAt(optionMoto.getInputTipoPartida().getSelectedIndex()) ;
        

        //Setar valores
                newMoto.setPlaca(placa);
                newMoto.setModelo(modelo);
                newMoto.setAnoFabric(anoDeFabri);
                newMoto.setCilindradas(capacidadeCarga);
                newMoto.setTipoFreio(tipoFreio);
                newMoto.setTipoPartida(tipoPartida);

       //Limpando os campos
            cleanAllFields();
            
        //Salvando Valores
         try{
            MotoDao dao = new MotoDaoImpl(); 
            dao.registrar(newMoto);
            JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!", "Confirmação",JOptionPane.INFORMATION_MESSAGE);
             //AllVehicles.loadVehicles();
        }catch(Exception e){
            System.out.println("Nao foi possivel cadastrar o novo carro no banco." + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao realizar o cadastro! Por favor, tente novamente.",   "Erro", JOptionPane.ERROR_MESSAGE);
        }
      }
    }
        
        
        //Adicionando Utilitario
        if(inputTipo.getSelectedItem().equals("Utilitário")){
            if(checkUtilFields()){
                Utilitario newUtil = new Utilitario();
         
        //Fazer validação dos campos
        String placa = inputPlaca.getText();
        String modelo = formatarInputs(inputModelo.getText());
        Integer anoDeFabri = Integer.valueOf(inputAnoFabri.getText());
        Integer capacidadeCarga = Integer.valueOf(optionUtil.getCapacidadeCarga().getText());
        Integer numeroEixos = Integer.valueOf(optionUtil.getNumeroEixos().getItemAt(optionUtil.getNumeroEixos().getSelectedIndex()));
        String tipoTracao =optionUtil.getInputTipoTracao().getItemAt(optionUtil.getInputTipoTracao().getSelectedIndex()) ;

        //Setar valores
        newUtil.setPlaca(placa);
        newUtil.setModelo(modelo);
        newUtil.setAnoFabric(anoDeFabri);
        newUtil.setCapacidadeCarga(capacidadeCarga);
        newUtil.setNumeroEixos(numeroEixos);
        newUtil.setTipoTração(tipoTracao);
        
        //Limpando os campos
        cleanAllFields();

        //Salvando Valores
        try{
            UtilitarioDao dao = new UtilDaoImpl(); 
            dao.registrar(newUtil);
            JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!", "Confirmação",JOptionPane.INFORMATION_MESSAGE);
            //AllVehicles.loadVehicles();
        }catch(Exception e){
            System.out.println("Nao foi possivel cadastrar o novo carro no banco." + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao realizar o cadastro! Por favor, tente novamente.",   "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
  }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void inputTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTipoActionPerformed

    }//GEN-LAST:event_inputTipoActionPerformed

    private void inputTipoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_inputTipoPropertyChange

    }//GEN-LAST:event_inputTipoPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCadastrar;
    private javax.swing.JToggleButton btnVoltar;
    private javax.swing.JTextField inputAnoFabri;
    private javax.swing.JTextField inputModelo;
    private javax.swing.JTextField inputPlaca;
    private javax.swing.JComboBox<String> inputTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel message;
    private javax.swing.JPanel option;
    // End of variables declaration//GEN-END:variables
}
