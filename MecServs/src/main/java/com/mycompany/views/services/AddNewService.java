/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.views.services;

import com.mycompany.dao.CarroDao;
import com.mycompany.dao.ServicoDao;
import com.mycompany.impl.CarroDaoImpl;
import com.mycompany.impl.ServicoDaoImpl;
import com.mycompany.mecservs.Dashboard;
import com.mycompany.models.Carro;
import com.mycompany.models.Servico;
import static com.mycompany.views.vehicles.AddNewVehicle.formatarInputs;
import javax.swing.JOptionPane;

/**
 *
 * @author Sirval
 */
public class AddNewService extends javax.swing.JPanel {

    private AllServices allServices = new AllServices();
    private String valorRegex = "^\\d+(\\.\\d+)?$";
    
    
    public AddNewService() {
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

        jSeparator1 = new javax.swing.JSeparator();
        btnCadastrar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        inputValor = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JToggleButton();
        inputDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputTipoServico = new javax.swing.JComboBox<>();

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Descrição (opcional)");

        jLabel2.setText("Valor do Serviço");

        jLabel7.setText("Nome");

        message.setText("Cadastrar um Novo Serviço");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/placeholder.png"))); // NOI18N

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo do Serviço");

        inputTipoServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manutenção Preventiva", "Reparo Mecânico", "Reparo Elétrico", "Troca de Peças", "Diagnóstico", "Limpeza", "Outros", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(inputDescricao)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(inputTipoServico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(inputValor)
                    .addComponent(inputNome))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputTipoServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if(checkFields()){
        Servico newServico = new Servico();
         
       
        String nome =formatarInputs(inputNome.getText());
        String descricao = formatarInputs(inputDescricao.getText());
        Double valor = Double.valueOf(inputValor.getText());
        String tipoServico = inputTipoServico.getItemAt(inputTipoServico.getSelectedIndex());
        
       

        //Setar valores
        newServico.setNome(nome);
        newServico.setDescricao(descricao);
        newServico.setValor(valor);
        newServico.setTipoServico(tipoServico);
  
        
        //Limpando os campos
        cleanAllFields();
        
        //Salvando Valores
        try{
            ServicoDao dao = new ServicoDaoImpl();
            dao.registrar(newServico);
            JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!", "Confirmação",JOptionPane.INFORMATION_MESSAGE);
            allServices.loadServices();
        }catch(Exception e){
            System.out.println("Nao foi possivel cadastrar o novo carro no banco." + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao realizar o cadastro! Por favor, tente novamente.",   "Erro", JOptionPane.ERROR_MESSAGE);
        }
       }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Dashboard.ShowJPanel(new AllServices());
    }//GEN-LAST:event_btnVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCadastrar;
    private javax.swing.JToggleButton btnVoltar;
    private javax.swing.JTextField inputDescricao;
    private javax.swing.JTextField inputNome;
    private javax.swing.JComboBox<String> inputTipoServico;
    private javax.swing.JTextField inputValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel message;
    // End of variables declaration//GEN-END:variables

    private boolean checkFields() {
         if (inputNome.getText().isEmpty()) {
         JOptionPane.showMessageDialog(null, "O campo de nome não pode estar vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
         inputNome.requestFocus(); 
         return false;
         } 
         if(inputNome.getText().length() > 20) {
         JOptionPane.showMessageDialog(null, "O campo de nome aceita até 20 caracteres.", "Erro", JOptionPane.ERROR_MESSAGE);
         inputValor.requestFocus(); 
         return false;
         }
         if(inputDescricao.getText().length() > 51) {
         JOptionPane.showMessageDialog(null, "O campo de descrição aceita até 50 caracteres.", "Erro", JOptionPane.ERROR_MESSAGE);
         inputValor.requestFocus(); 
         return false;
         }
         if (inputValor.getText().isEmpty()) {
         JOptionPane.showMessageDialog(null, "O campo de valor não pode estar vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
         inputValor.requestFocus(); 
         return false;
         }
         if (!inputValor.getText().matches(valorRegex)) {
         JOptionPane.showMessageDialog(null, "Apenas são permitidos valor inteiros ou decimais.", "Erro", JOptionPane.ERROR_MESSAGE);
         inputValor.requestFocus(); 
         return false;
         }
         
         
         return true;
    }

    private void cleanAllFields() {
       inputNome.setText("");
       inputDescricao.setText("");
       inputValor.setText("");
       inputTipoServico.setSelectedIndex(0);
    }
}
