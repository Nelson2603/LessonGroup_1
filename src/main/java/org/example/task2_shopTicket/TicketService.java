package org.example.task2_shopTicket;

class TicketService {

    public Ticket createTicket(long distance) {
        Ticket ticket = new Ticket();
        ticket.setPrice(distance * 3);//стоимость за проезд
        return ticket;
    }
    public Ticket createTicketWithDiscount(long kilometers) {
        Ticket ticket = new Ticket();
        ticket.setDistance(kilometers);
        ticket.setPrice(kilometers > 2000 ? kilometers*1 : kilometers > 1000 ? kilometers*2: kilometers*3);
        return ticket;
    }
}


