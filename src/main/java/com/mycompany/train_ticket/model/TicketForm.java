/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.train_ticket.model;

import com.mycompany.train_ticket.controller.IOSystem;
import com.mycompany.train_ticket.data.TicketDAO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author LENOVO
 */
public class TicketForm extends javax.swing.JPanel {

    /**
     * Creates new form TicketForm
     */
    public TicketForm() {
        initComponents();
        showTable();
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
        txt_code = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lb_price = new javax.swing.JLabel();
        cbox_seat_type = new javax.swing.JComboBox<>();
        btn_remove = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setText("Code");

        txt_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codeActionPerformed(evt);
            }
        });

        jLabel2.setText("Seat Type");

        cbox_seat_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Seat 1", "Seat 2", "Bed"}));
        cbox_seat_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_seat_typeActionPerformed(evt);
            }
        });

        btn_remove.setText("REMOVE");
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });

        btn_save.setText("SAVE");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[]{
                        "Ticket Code", "Seat Type", "Price", "Owner"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_code, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lb_price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cbox_seat_type, 0, 149, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_remove)
                                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(txt_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn_remove))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(cbox_seat_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn_add))
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_save)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lb_price))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(148, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        removeTicket();
    }//GEN-LAST:event_btn_removeActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        addTicket();
        showTable();
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        updateTicket();
        JOptionPane.showMessageDialog(null, "Update\nticket code:"
                + txt_code.getText() + "\nseat type:" + cbox_seat_type.getSelectedItem().toString()
                + "\nprice:" + getPrice(cbox_seat_type.getSelectedItem().toString())
                + "\nsuccessfully!");
        txt_code.setText("");
        lb_price.setText("");

    }//GEN-LAST:event_btn_saveActionPerformed

    private void txt_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codeActionPerformed
        String code = txt_code.getText();
        if (code.equals("")) {
            lb_price.setText("");
        } else {
            Ticket ticket = getTicketByCode(code);
            if (ticket == null) {
                JOptionPane.showMessageDialog(null, "Ticket not found!");
                lb_price.setText("");
            } else {
                lb_price.setText(String.valueOf(ticket.getPrice()));
                cbox_seat_type.setSelectedItem(ticket.getSeatType());
            }
        }
    }//GEN-LAST:event_txt_codeActionPerformed

    private void cbox_seat_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_seat_typeActionPerformed
        String seatType = cbox_seat_type.getSelectedItem().toString();
        lb_price.setText(String.valueOf(getPrice(seatType)));
    }//GEN-LAST:event_cbox_seat_typeActionPerformed

    private void addTicket() {
        TicketDAO ticketDAO = new TicketDAO();
        try {
            String code = TicketDAO.getAvailableTicketCode();
            String seatType = Objects.requireNonNull(cbox_seat_type.getSelectedItem()).toString();
            Ticket ticket = new Ticket(code, seatType, getPrice(seatType));
            txt_code.setText(code);
            lb_price.setText(String.valueOf(ticket.getPrice()));
            JOptionPane.showMessageDialog(null, "Your ticket:\ncode:" + code
                    + "\nseat type:" + seatType
                    + "\nprice:" + getPrice(seatType) + "\nhas been added successfully!");
            ticketDAO.addTicket(ticket);
            txt_code.setText("");
            lb_price.setText("");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Ticket getTicketByCode(String code) {
        TicketDAO ticketDAO = new TicketDAO();
        try {
            return ticketDAO.getTicketsByCode(code);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void removeTicket() {
        String code = txt_code.getText();
        if (code.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter ticket code!");
            return;
        }
        TicketDAO ticketDAO = new TicketDAO();
        try {
            ticketDAO.removeTicket(code);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void updateTicket() {
        String code = txt_code.getText();
        String seatType = cbox_seat_type.getSelectedItem().toString();
        Ticket ticket = new Ticket(code, seatType, getPrice(seatType));
        TicketDAO ticketDAO = new TicketDAO();
        try {
            ticketDAO.updateTicket(ticket);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void showTable() {
        IOSystem io = IOSystem.getInstance();
        try {
            List<Ticket> tickets = io.read("src/main/java/com/mycompany/train_ticket/data/TICKET.DAT");
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            for (Ticket ticket : tickets) {
                if (ticket.getOwner() == null) {
                    model.addRow(new Object[]{ticket.getTicketCode(), ticket.getSeatType(), ticket.getPrice(), ""});
                } else {
                    model.addRow(new Object[]{ticket.getTicketCode(), ticket.getSeatType(), ticket.getPrice(), ticket.getOwner().getCode()});
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private long getPrice(String seatType) {
        if (seatType.equals("Seat 1")) {
            return 80000;
        } else if (seatType.equals("Seat 2")) {
            return 120000;
        } else {
            return 200000;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_remove;
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox<String> cbox_seat_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lb_price;
    private javax.swing.JTextField txt_code;
    // End of variables declaration//GEN-END:variables
}
