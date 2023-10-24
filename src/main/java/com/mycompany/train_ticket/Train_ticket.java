/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.train_ticket;

import com.mycompany.train_ticket.controller.IOSystem;
import com.mycompany.train_ticket.model.Customer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author LENOVO
 */
public class Train_ticket {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Hello World!");
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1,"Nguyen Van A","01/01/2003","Vip"));
        String path = System.getProperty("user.dir") + "/src/Files/customer.dat";
        System.out.println(path);

        IOSystem.getInstance().write( customers , path);
        List<Customer> customers1 = IOSystem.getInstance().read(path);
        customers1.forEach(c -> System.out.println(c.getFullName()));
    }
}
