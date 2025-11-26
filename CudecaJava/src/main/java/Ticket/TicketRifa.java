package Ticket;

public class TicketRifa extends Ticket {
    private int idBoleto;

    public TicketRifa(String nombre, String dniBeneficiario, int id, int idBoleto) {
        super(nombre, dniBeneficiario, id);
        this.idBoleto = idBoleto;
    }
}
