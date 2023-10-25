package com.mycompany.train_ticket.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bill implements Serializable {
    private List<Ticket> tickets;
    private Customer customer;
    private String billCode;
    private long totalPrice;
    private LocalDate date;

    public Bill(List<Ticket> tickets, Customer customer, String billCode, long totalPrice) {
        this.tickets = tickets;
        this.customer = customer;
        this.billCode = billCode;
        this.totalPrice = totalPrice;
        this.date = LocalDate.now();
    }

    public Bill(List<Ticket> tickets, Customer customer, String billCode, long totalPrice, LocalDate date) {
        this.tickets = tickets;
        this.customer = customer;
        this.billCode = billCode;
        this.totalPrice = totalPrice;
        this.date = date;
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
        return totalPrice;
    }

    public void addTickets(Ticket ticket) {
        this.tickets.add(ticket);
    }

    public void totalPrice() {
        for (Ticket i : tickets) {
            this.totalPrice += i.getPrice();
        }
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
