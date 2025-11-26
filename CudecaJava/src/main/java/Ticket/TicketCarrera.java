package Ticket;

public class TicketCarrera extends Ticket {
    private int dorsal;

    public TicketCarrera(String nombre, String dniBeneficiario, int id, int dorsal) {
        super(nombre, dniBeneficiario, id);
        this.dorsal = dorsal;
    }
}
