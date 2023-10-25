package com.mycompany.train_ticket.model;

import java.io.Serializable;
import java.util.Date;

public class Ticket implements Serializable {
    private String ticketCode;
    private String seatType;
    private long price;
    private Date ticketSold;
    private Customer owner = null;

    public Ticket(String code, String seatType, long price) {
        this.ticketCode = code;
        this.seatType = seatType;
        this.price = price;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(String ticketCode) {
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

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }
}
