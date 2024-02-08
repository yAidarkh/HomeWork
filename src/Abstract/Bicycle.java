package Abstract;

public class Bicycle extends Transport{
    private TransportType transportType;
    private TransportType wheelCount;

    public Bicycle(String name, int speed) {
        super(name, speed);
        this.transportType = TransportType.BICYCLE;
        this.wheelCount= TransportType.BICYCLE;
    }

    @Override
    public TransportType getTransportType() {
        return transportType;
    }
}

