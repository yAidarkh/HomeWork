package Abstract;

public class Boat extends Transport{
    private TransportType transportType;
    private TransportType wheelCount;
    public Boat(String name, int speed) {
        super(name, speed);
        this.transportType = TransportType.BOAT;
        this.wheelCount= TransportType.BOAT;
    }

    @Override
    public TransportType getTransportType() {
        return transportType;
    }
}

