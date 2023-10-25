package com.mycompany.train_ticket.data;

import com.mycompany.train_ticket.controller.IOSystem;
import com.mycompany.train_ticket.model.Bill;
import com.mycompany.train_ticket.model.Customer;
import com.mycompany.train_ticket.model.Ticket;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BillDAO {
    private static BillDAO billDAOInstance;

    public BillDAO() {
    }

    public static BillDAO getInstance(){
        if (billDAOInstance == null){
            billDAOInstance = new BillDAO();
        }
        return billDAOInstance;
    }
    public List<Bill> getBills() {
        List<Bill> bills = new ArrayList<>();
        Bill bill = new Bill(List.of(new Ticket("1", "VIP", 1000)), new Customer("1", "Minh", "10/10/2022", "Regular"), "1");
        Bill bill1 = new Bill(List.of(new Ticket("1", "VIP", 3000)), new Customer("1", "Minh", "10/10/2022", "Regular"), "1");
        Bill bill2 = new Bill(List.of(new Ticket("1", "VIP", 2000)), new Customer("1", "Minh", "10/10/2022", "Regular"), "1",LocalDate.of(2021, 10, 10));

        bills.add(bill);
        bills.add(bill1);
        bills.add(bill2);
        try {
            IOSystem.getInstance().write(bills, "src/main/java/com/mycompany/train_ticket/data/BILL.DAT");

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
        bills.sort((o1, o2) -> o1.getDate().compareTo(o2.getDate()));
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
}
