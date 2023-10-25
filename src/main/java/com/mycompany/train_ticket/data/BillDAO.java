package com.mycompany.train_ticket.data;

import com.mycompany.train_ticket.controller.IOSystem;
import com.mycompany.train_ticket.model.Bill;

import java.io.IOException;
import java.util.List;

public class BillDAO {
    public static String getAvailableBillCode() throws IOException, ClassNotFoundException {
        IOSystem io = IOSystem.getInstance();
        return io.read("src/main/java/com/mycompany/train_ticket/data/BILL.DAT").size() + 1 + "";
    }

    public static void addBill(Bill bill) throws IOException, ClassNotFoundException {
        IOSystem io = IOSystem.getInstance();
        List<Bill> listBill = io.read("src/main/java/com/mycompany/train_ticket/data/BILL.DAT");
        listBill.add(bill);
        io.write(listBill, "src/main/java/com/mycompany/train_ticket/data/BILL.DAT");
    }
}
