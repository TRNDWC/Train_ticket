package com.mycompany.train_ticket.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bill implements Serializable {
    private String billCode;
    private List<Ticket> tickets;
    private Customer customer;
    private long totalPrice;
    private LocalDate date;

    public Bill(List<Ticket> tickets, Customer customer, String billCode) {
        this.tickets = tickets;
        this.customer = customer;
        this.billCode = billCode;
        this.date = LocalDate.now();
        for (Ticket i : tickets) {
            this.totalPrice += i.getPrice();
        }
    }

    public Bill(List<Ticket> tickets, Customer customer, String billCode, LocalDate date) {
        this.tickets = tickets;
        this.customer = customer;
        this.billCode = billCode;
        this.date = date;
        for (Ticket i : tickets) {
            this.totalPrice += i.getPrice();
        }
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public long getTotalPrice() {
        this.totalPrice = 0;
        for (Ticket i : tickets) {
            this.totalPrice += i.getPrice();
        }
        return totalPrice;
    }

    public void addTickets(Ticket ticket) {
        this.tickets.add(ticket);
    }

    public void addTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }

    public void setTotalPrice(long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
