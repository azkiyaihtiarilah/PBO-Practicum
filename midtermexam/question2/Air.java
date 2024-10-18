package question2;

/**
 * Air
 */
public class Air extends Transportation{

    private int idLocation;
    private String airport;

    public Air(String type, String name, int idLocation, String airport) {
        super(type, name);
        this.idLocation = idLocation;
        this.airport = airport;
    }

    public void setIdLocation(int idLocation) {
        this.idLocation = idLocation;
    }

    public int getIdLocation() {
        return idLocation;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getAirport() {
        return airport;
    }
}