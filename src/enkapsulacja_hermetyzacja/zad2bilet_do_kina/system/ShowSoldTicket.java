package enkapsulacja_hermetyzacja.zad2bilet_do_kina.system;

import enkapsulacja_hermetyzacja.zad2bilet_do_kina.model.Ticket;

public class ShowSoldTicket {
    public void show(Ticket ticket) {
        if (ticket != null) {
            System.out.println(ticket.getInfo());
        }
    }
}
