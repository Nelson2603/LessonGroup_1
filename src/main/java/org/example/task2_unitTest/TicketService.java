package org.example.task2_unitTest;

class TicketServise {
    public Ticket createTicket(long distance) {
        Ticket ticket = new Ticket();
        ticket.setPrice(distance*3);//стоимость за проезд
        return ticket;
    }
    public double createTicket2(long distance) {
        return distance*3;
    }

}


//public Ticket createTicketWithDiscount(long distance){
//    Ticket ticket = new Ticket();
//
//}