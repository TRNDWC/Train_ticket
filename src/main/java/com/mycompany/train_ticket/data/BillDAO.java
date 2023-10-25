package com.mycompany.train_ticket.data;

import com.mycompany.train_ticket.controller.IOSystem;
import com.mycompany.train_ticket.model.Bill;
import com.mycompany.train_ticket.model.Customer;
import com.mycompany.train_ticket.model.Ticket;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.train_ticket.controller.IOSystem;
import com.mycompany.train_ticket.model.Bill;

import java.io.IOException;
import java.util.List;

public class BillDAO {
    private static BillDAO billDAOInstance;

    public BillDAO() {
    }
    public static String getAvailableBillCode() throws IOException, ClassNotFoundException {
        IOSystem io = IOSystem.getInstance();
        return io.read("src/main/java/com/mycompany/train_ticket/data/BILL.DAT").size() + 1 + "";
    }

    public static BillDAO getInstance(){
        if (billDAOInstance == null){
            billDAOInstance = new BillDAO();
        }
        return billDAOInstance;
    }
    public List<Bill> getBills() {
        try {
            return IOSystem.getInstance().read("src/main/java/com/mycompany/train_ticket/data/BILL.DAT");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Bill> getBillsSortedByDate() {
        List<Bill> bills = null;
        try {
            bills = IOSystem.getInstance().read("src/main/java/com/mycompany/train_ticket/data/BILL.DAT");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        bills.sort((o1, o2) -> -o1.getDate().compareTo(o2.getDate()));
        return bills;
    }

    public List<Bill> getBillsSortedByTotalPrice() {
        List<Bill> bills = null;
        try {
            bills = IOSystem.getInstance().read("src/main/java/com/mycompany/train_ticket/data/BILL.DAT");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        bills.sort((o1, o2) -> (int) (o1.getTotalPrice() - o2.getTotalPrice()));
        return bills;
    }
    public static void addBill(Bill bill) throws IOException, ClassNotFoundException {
        IOSystem io = IOSystem.getInstance();
        List<Bill> listBill = io.read("src/main/java/com/mycompany/train_ticket/data/BILL.DAT");
        listBill.add(bill);
        io.write(listBill, "src/main/java/com/mycompany/train_ticket/data/BILL.DAT");
    }
}
