/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.train_ticket.model;

import com.mycompany.train_ticket.controller.IOSystem;
import com.mycompany.train_ticket.data.CustomerDAO;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author LENOVO
 */
public class CustomerForm extends javax.swing.JPanel {
    /**
     * Creates new form CustomerForm
     */
    public CustomerForm() {
        initComponents();
        editSetting();
        btn_edit.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_dob = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbox_type = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txt_code = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();

        jLabel1.setText("Full Name");

        jLabel2.setText("DOB");

        jLabel3.setText("Type");

        cbox_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Retail", "Team", "Online"}));

        jLabel4.setText("Code");

        txt_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codeActionPerformed(evt);
            }
        });

        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_save.setText("SAVE");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_edit.setText("EDIT");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel4))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txt_code, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                                                        .addComponent(txt_name)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel2))
                                                .addGap(46, 46, 46)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cbox_type, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                        .addComponent(btn_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(txt_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_edit))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_add))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_save))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(cbox_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(125, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        addSetting();
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        editSetting();
    }//GEN-LAST:event_btn_editActionPerformed

    private void txt_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codeActionPerformed
        String code = txt_code.getText();
        txt_name.requestFocus();
        if (code.length() != 5) {
            JOptionPane.showMessageDialog(this, "Code must be 5 characters");
            txt_code.requestFocus();
            return;
        } else {
            try {
                getCustomerById(code);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_txt_codeActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        try {
            if (txt_code.isEnabled()) {
                updateCustomer();
            } else {
                addCustomer();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        txt_code.setText("");
        txt_name.setText("");
        txt_dob.setText("");
        cbox_type.setSelectedIndex(0);
    }//GEN-LAST:event_btn_saveActionPerformed

    private void updateCustomer() throws IOException, ClassNotFoundException {
        String code = txt_code.getText();
        String name = txt_name.getText();
        String dob = txt_dob.getText();
        String type = cbox_type.getSelectedItem().toString();
        Customer customer = new Customer(code, name, dob, type);
        CustomerDAO.updateCustomer(customer);
        JOptionPane.showMessageDialog(this, "Customer updated:\ncode: " + code + "\nname: " + name + "\ndob: " + dob + "\ntype: " + type);
    }

    private void addCustomer() throws IOException, ClassNotFoundException {
        String code = CustomerDAO.getAvailableCode();
        String name = txt_name.getText();
        String dob = txt_dob.getText();
        String type = Objects.requireNonNull(cbox_type.getSelectedItem()).toString();
        Customer customer = new Customer(code, name, dob, type);
        CustomerDAO.addCustomer(customer);
        JOptionPane.showMessageDialog(this, "Customer added:\ncode: " + code + "\nname: " + name + "\ndob: " + dob + "\ntype: " + type);
    }

    private void getCustomerById(String code) throws IOException, ClassNotFoundException {
        Customer customer = CustomerDAO.getCustomerByCode(code);
        if (customer != null) {
            txt_name.setText(customer.getFullName());
            txt_dob.setText(customer.getBirth());
            cbox_type.setSelectedItem(customer.getType());
        } else {
            JOptionPane.showMessageDialog(this, "Customer not found");
        }
    }

    private void addSetting() {
        txt_name.setEditable(true);
        txt_dob.setEditable(true);
        cbox_type.setEditable(true);
        txt_code.setEnabled(false);
        btn_edit.setBackground(new java.awt.Color(240, 240, 240));
        btn_add.setBackground(new java.awt.Color(72, 202, 228));
        txt_name.setText("");
        txt_dob.setText("");
        txt_code.setText("");
        cbox_type.setSelectedIndex(0);
    }

    private void editSetting() {
        txt_name.setEditable(true);
        txt_dob.setEditable(true);
        cbox_type.setEditable(true);
        txt_code.setEnabled(true);
        btn_edit.setBackground(new java.awt.Color(72, 202, 228));
        btn_add.setBackground(new java.awt.Color(240, 240, 240));
        txt_code.setText("");
        txt_name.setText("");
        txt_dob.setText("");
        cbox_type.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox<String> cbox_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_code;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
