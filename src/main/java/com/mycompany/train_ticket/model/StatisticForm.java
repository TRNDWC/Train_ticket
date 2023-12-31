/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.train_ticket.model;

import com.mycompany.train_ticket.controller.IOSystem;

import javax.swing.table.DefaultTableModel;
import java.io.IOException;
import java.util.List;

/**
 * @author LENOVO
 */
public class StatisticForm extends javax.swing.JPanel {

    /**
     * Creates new form SortForm
     */
    public StatisticForm() {
        initComponents();
        sshow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String[]{
                        "Year", "Price"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean[]{
                    false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void sshow() {
        List<Bill> listBill = null;
        try {
            listBill = IOSystem.getInstance().read("src/main/java/com/mycompany/train_ticket/data/BILL.DAT");
            fillTableData(listBill);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public void fillTableData(List<Bill> bills) {
//        tính tổng các bill theo năm
        for (int i = 0; i < bills.size(); i++) {
            for (int j = i + 1; j < bills.size(); j++) {
                if (bills.get(i).getDate().getYear() == bills.get(j).getDate().getYear()) {
                    bills.get(i).setTotalPrice(bills.get(i).getTotalPrice() + bills.get(j).getTotalPrice());
                    System.out.println(bills.get(i).getTotalPrice());
                    System.out.println(bills.get(j).getTotalPrice());
                    System.out.println("-----");
                    bills.remove(j);
                    j--;
                }
            }
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (Bill a : bills) {
            model.addRow(new Object[]{a.getDate().getYear(), a.getTotalPrice()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
