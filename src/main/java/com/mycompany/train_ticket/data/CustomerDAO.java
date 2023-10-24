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
            System.out.println(customer.getFullName());
            if (customer.getCode() == code) {
                return customer;
            }
        }
        return null;
    }

    public static void addCustomer(Customer customer) throws IOException, ClassNotFoundException {
        IOSystem io = IOSystem.getInstance();
        List<Customer> listCustomer = io.read("src/main/java/com/mycompany/train_ticket/data/CUSTOMER.DAT");
        listCustomer.add(customer);
        io.write(listCustomer, "src/main/java/com/mycompany/train_ticket/data/CUSTOMER.DAT");
    }

    public static void updateCustomer(Customer customer) throws IOException, ClassNotFoundException {
        IOSystem io = IOSystem.getInstance();
        List<Customer> listCustomer = io.read("src/main/java/com/mycompany/train_ticket/data/CUSTOMER.DAT");
        for (int i = 0; i < listCustomer.size(); i++) {
            if (listCustomer.get(i).getCode() == customer.getCode()) {
                listCustomer.set(i, customer);
                break;
            }
        }
        io.write(listCustomer, "src/main/java/com/mycompany/train_ticket/data/CUSTOMER.DAT");
    }
}
