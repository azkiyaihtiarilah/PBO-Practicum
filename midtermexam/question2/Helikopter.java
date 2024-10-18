package question2;

/**
 * Helikopter
 */
public class Helikopter extends Air{

    private double ticketPrice;

    public Helikopter(String type, String name, int locationId, String airport, double ticketPrice) {
        super(type, name, locationId, airport);
        this.ticketPrice = ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void HelikopterInfo() {
        System.out.println("Type of Transportation : " + getType());
        System.out.println("Name of Transportation : " + getName());
        System.out.println("Location ID            : " + getIdLocation());
        System.out.println("Airport Name           : " + getAirport());
        System.out.println("Ticket Price           : " + getTicketPrice());
    }
}