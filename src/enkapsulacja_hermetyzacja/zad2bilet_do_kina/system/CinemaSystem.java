package enkapsulacja_hermetyzacja.zad2bilet_do_kina.system;

import enkapsulacja_hermetyzacja.zad2bilet_do_kina.model.Client;
import enkapsulacja_hermetyzacja.zad2bilet_do_kina.model.MovieShow;
import enkapsulacja_hermetyzacja.zad2bilet_do_kina.model.Ticket;

public class CinemaSystem {
    public static void main(String[] args) {
        MovieShow movie1 = new MovieShow("Omen", "horror", 128, 16, 72, 72);
        Client client1 = new Client("Jan", "Kowalski", 15);
        TicketSystem ticketSystem = new TicketSystem();
        ShowSoldTicket show = new ShowSoldTicket();
        Ticket ticket1 = ticketSystem.createTicket(movie1, client1);

        Client client2 = new Client("Anna", "Zalewska", 19);
        Ticket ticket2 = ticketSystem.createTicket(movie1, client2);

        Client client3= new Client("Roman", "Grzelak", 29);
        Ticket ticket3 = ticketSystem.createTicket(movie1, client3);



        System.out.println("Sprzedane bilety");
        show.show(ticket1);
        show.show(ticket2);
        show.show(ticket3);

        System.out.println("Liczba pozostałych miejsc: " + movie1.getFreeSeats());
        System.out.println("Liczba sprzedanych biletów: " + (movie1.getMaxSeats() - movie1.getFreeSeats()));
    }
}
