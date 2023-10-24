package com.mycompany.train_ticket.data;

import com.mycompany.train_ticket.controller.IOSystem;
import com.mycompany.train_ticket.model.Customer;

import java.io.IOException;
import java.util.List;

public class CustomerDAO {
    public static Customer getCustomerByCode(Integer code) throws IOException, ClassNotFoundException {
        IOSystem io = IOSystem.getInstance();
        List<Customer> listCustomer = io.read("src/main/java/com/mycompany/train_ticket/data/CUSTOMER.DAT");
        for (Customer customer : listCustomer) {
            System.out.println("hello");
            if (customer.getCode() == code) {
                return customer;
            }
        }
        return null;
    }

    public static void addCustomer(List<Customer> listCustomer) throws IOException, ClassNotFoundException {
        IOSystem io = IOSystem.getInstance();
        io.write(listCustomer, "src/main/java/com/mycompany/train_ticket/data/CUSTOMER.DAT");
    }
}
