package com.mycompany.train_ticket.model;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    private List<Ticket> tickets;
    private Customer customer;
    private long billCode;
    private long totalPrice;
    public Bill(ArrayList<Ticket> tickets, Customer customer, long billCode, long totalPrice){
        this.tickets=tickets;
        this.customer=customer;
        this.billCode=billCode;
        this.totalPrice=totalPrice;
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

    public long getBillCode() {
        return billCode;
    }

    public void setBillCode(long billCode) {
        this.billCode = billCode;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public void addTickets(Ticket ticket){
        this.tickets.add(ticket);
    }

    public void totalPrice(){
        for (Ticket i : tickets){
            this.totalPrice+=i.getPrice();
        }
    }
    public void addTicket(Ticket ticket){
        this.tickets.add(ticket);
    }
}