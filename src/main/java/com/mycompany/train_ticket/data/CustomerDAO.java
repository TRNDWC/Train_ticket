package com.mycompany.train_ticket.data;

import com.mycompany.train_ticket.controller.IOSystem;
import com.mycompany.train_ticket.model.Customer;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class CustomerDAO {
    public static Customer getCustomerByCode(String code) throws IOException, ClassNotFoundException {
        IOSystem io = IOSystem.getInstance();
        List<Customer> listCustomer = io.read("src/main/java/com/mycompany/train_ticket/data/CUSTOMER.DAT");
        for (Customer customer : listCustomer) {
            System.out.println(customer.getFullName());
            if (Objects.equals(customer.getCode(), code)) {
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
            if (Objects.equals(listCustomer.get(i).getCode(), customer.getCode())) {
                listCustomer.set(i, customer);
                break;
            }
        }
        io.write(listCustomer, "src/main/java/com/mycompany/train_ticket/data/CUSTOMER.DAT");
    }

    public static String getAvailableCode() throws IOException, ClassNotFoundException {
        List<Customer> listCustomer = getCustomers();
        String code = "00000";
        for (Customer customer : listCustomer) {
            if (Integer.parseInt(customer.getCode()) - Integer.parseInt(code) > 1) {
                break;
            } else {
                code = customer.getCode();
            }
        }
        return formatCode(String.valueOf(Integer.parseInt(code) + 1));
    }

    private static List<Customer> getCustomers() throws IOException, ClassNotFoundException {
        IOSystem io = IOSystem.getInstance();
        List<Customer> listCustomer = io.read("src/main/java/com/mycompany/train_ticket/data/CUSTOMER.DAT");
//        sort Customer by code
        listCustomer.sort((o1, o2) -> {
                    if (Integer.parseInt(o1.getCode()) > Integer.parseInt(o2.getCode())) {
                        return 1;
                    } else if (Integer.parseInt(o1.getCode()) < Integer.parseInt(o2.getCode())) {
                        return -1;
                    } else {
                        return 0;
                    }
                });
        return listCustomer;
    }

    private static String formatCode(String code) {
        String result = "";
        for (int i = 0; i < 5 - code.length(); i++) {
            result += "0";
        }
        return result + code;
    }
}
