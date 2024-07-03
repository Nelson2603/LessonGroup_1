package org.example.task2_shopTicket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketServiceTest {
    TicketService ticketService = new TicketService();


    @Test
    public void testCreateTicket() {
        long kilometers = 100;
        Ticket ticket = ticketService.createTicket(kilometers);
        assertEquals(300.0, ticket.getPrice());
    }

    @Test
    public void testCreateTicketWithDiscountLessThat1000() {//если меньше 1000 км
        long kilometers = 100;
        Ticket ticket = ticketService.createTicketWithDiscount(kilometers);
        assertEquals(kilometers, ticket.getDistance());
        assertEquals(300, ticket.getPrice());
    }

    @Test
    public void testCreateTicketWithDiscountMore1000() {//если больше 1000 км
        long kilometers = 1001;
        Ticket ticket = ticketService.createTicketWithDiscount(kilometers);
       // assertEquals(kilometers, ticket.getDistance());
        assertEquals(2002, ticket.getPrice());
    }

    @Test
    public void testCreateTicketWithDiscountMore2000() {//если больше 2000 км
        long kilometers = 2001;
        Ticket ticket = ticketService.createTicketWithDiscount(kilometers);
        assertEquals(kilometers, ticket.getDistance());
        assertEquals(2001, ticket.getPrice());
    }
}
