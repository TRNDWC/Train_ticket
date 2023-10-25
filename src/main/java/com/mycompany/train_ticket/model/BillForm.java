/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.train_ticket.model;

import com.mycompany.train_ticket.controller.IOSystem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author LENOVO
 */
public class BillForm extends javax.swing.JPanel {
    /**
     * Creates new form BillForm
     */
    public BillForm() {
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

        txt_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_customer_code = new javax.swing.JTextField();
        btn_add_to_bill = new javax.swing.JButton();
        btn_add_bill = new javax.swing.JButton();
        btn_save_bill = new javax.swing.JButton();
        lb_tickets = new javax.swing.JLabel();
        price = new javax.swing.JLabel();

        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });

        jLabel1.setText("Ticker Code");

        jLabel4.setText("Customer Code");

        txt_customer_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_customer_codeActionPerformed(evt);
            }
        });

        btn_add_to_bill.setText("+");
        btn_add_to_bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_to_billActionPerformed(evt);
            }
        });

        btn_add_bill.setText("Add");
        btn_add_bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_billActionPerformed(evt);
            }
        });

        btn_save_bill.setText("Save");
        btn_save_bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_save_billActionPerformed(evt);
            }
        });

        lb_tickets.setText("jLabel2");

        price.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_add_bill)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btn_save_bill)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(lb_tickets)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(price))
                                                                .addComponent(txt_name, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                                                .addComponent(txt_customer_code)))
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_add_to_bill)))
                                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(txt_customer_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_add_to_bill))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lb_tickets)
                                        .addComponent(price))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_add_bill)
                                        .addComponent(btn_save_bill))
                                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_add_to_billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_to_billActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_add_to_billActionPerformed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_customer_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_customer_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_customer_codeActionPerformed

    private void btn_add_billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_billActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_add_billActionPerformed

    private void btn_save_billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_save_billActionPerformed
    }//GEN-LAST:event_btn_save_billActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_bill;
    private javax.swing.JButton btn_add_to_bill;
    private javax.swing.JButton btn_save_bill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lb_tickets;
    private javax.swing.JLabel price;
    private javax.swing.JTextField txt_customer_code;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables


}
