package com.mycompany.train_ticket.data;

import com.mycompany.train_ticket.controller.IOSystem;
import com.mycompany.train_ticket.model.Ticket;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class TicketDAO {
    public void addTicket(Ticket ticket) throws IOException, ClassNotFoundException {
        IOSystem io = IOSystem.getInstance();
        List<Ticket> tickets = io.read("src/main/java/com/mycompany/train_ticket/data/TICKET.DAT");
        tickets.add(ticket);
        io.write(tickets, "src/main/java/com/mycompany/train_ticket/data/TICKET.DAT");
    }

    public void removeTicket(String code) throws IOException, ClassNotFoundException {
        IOSystem io = IOSystem.getInstance();
        List<Ticket> tickets = io.read("src/main/java/com/mycompany/train_ticket/data/TICKET.DAT");
        for (int i = 0; i < tickets.size(); i++) {
            if (Objects.equals(tickets.get(i).getTicketCode(), code)) {
                tickets.remove(i);
                break;
            }
        }
        io.write(tickets, "src/main/java/com/mycompany/train_ticket/data/TICKET.DAT");
    }

    public Ticket getTicketsByCode(String code) throws IOException, ClassNotFoundException {
        IOSystem io = IOSystem.getInstance();
        List<Ticket> tickets = io.read("src/main/java/com/mycompany/train_ticket/data/TICKET.DAT");
        for (Ticket ticket : tickets) {
            if (Objects.equals(ticket.getTicketCode(), code)) {
                return ticket;
            }
        }
        return null;
    }

    public void updateTicket(Ticket ticket) throws IOException, ClassNotFoundException {
        IOSystem io = IOSystem.getInstance();
        List<Ticket> tickets = io.read("src/main/java/com/mycompany/train_ticket/data/TICKET.DAT");
        for (int i = 0; i < tickets.size(); i++) {
            if (Objects.equals(tickets.get(i).getTicketCode(), ticket.getTicketCode())) {
                tickets.set(i, ticket);
                break;
            }
        }
        io.write(tickets, "src/main/java/com/mycompany/train_ticket/data/TICKET.DAT");
    }

    public static String getAvailableTicketCode() throws IOException, ClassNotFoundException {
        IOSystem io = IOSystem.getInstance();
        List<Ticket> tickets = io.read("src/main/java/com/mycompany/train_ticket/data/TICKET.DAT");
        tickets.sort(Comparator.comparing(Ticket::getTicketCode));
        String code = "000";
        for (Ticket ticket : tickets) {
            if (!Objects.equals(ticket.getTicketCode(), code)) {
                return code;
            }
            code = formatCode(String.valueOf(Integer.parseInt(code) + 1));
        }
        return code;
    }

    private static String formatCode(String code) {
        if (code.length() == 1) {
            code = "00" + code;
        } else if (code.length() == 2) {
            code = "0" + code;
        }
        return code;
    }


    public List<Ticket> getAllTickets() throws IOException, ClassNotFoundException {
        IOSystem io = IOSystem.getInstance();
        return io.read("src/main/java/com/mycompany/train_ticket/data/TICKET.DAT");
    }
}
