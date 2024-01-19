package recusividad;

public class Ticket {
    private String nombrePasajero;
    private double totalTicket;

    public Ticket(String nombrePasajero, double totalTicket) {
        this.nombrePasajero = nombrePasajero;
        this.totalTicket = totalTicket;
    }

    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public double getTotalTicket() {
        return totalTicket;
    }
    
    
}
