package com.mycompany.train_ticket.model;

import java.util.Date;

public class Ticket {
    private int ticketCode;
    private String seatType;
    private long price;
    private Date ticketSold;
    public Ticket(int code, String seatType,long price){
        this.ticketCode=code;
        this.seatType= seatType;
        this.price=price;
    }

    public int getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(int ticketCode) {
        this.ticketCode = ticketCode;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Date getTicketSold() {
        return ticketSold;
    }

    public void setTicketSold(Date ticketSold) {
        this.ticketSold = ticketSold;
    }
}
