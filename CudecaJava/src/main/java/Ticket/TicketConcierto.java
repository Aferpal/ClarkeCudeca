package Ticket;

public class TicketConcierto extends Ticket{
    private int dorsal;

    public TicketConcierto(String nombre, String dniBeneficiario, int id, int dorsal) {
        super(nombre, dniBeneficiario, id);
        this.dorsal = dorsal;
    }
}
