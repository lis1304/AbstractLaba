package Abstr;

public abstract class Transport {
    private String type;
    private String destination;

    public abstract void runTypr();

    @Override
    public String toString() {
        return "Transport{" +
                "type='" + type + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Transport(String type, String destination) {

        this.type = type;
        this.destination = destination;
    }
}
