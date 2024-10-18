package question2;

/**
 * Transportation
 */
public class Transportation {

    private int idTransportation;
    private String type;
    private String name;

    public Transportation(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setidTransportation(int idTransportation) {
        this.idTransportation = idTransportation;
    }

    public int getidTransportation() {
        return idTransportation;
    }
}