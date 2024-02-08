package Abstract;

public class Auto extends Transport{
    private TransportType transportType;
    private TransportType wheelCount;
    public Auto(String name, int speed) {
        super(name, speed);
        this.wheelCount = TransportType.AUTO;
        this.transportType = TransportType.AUTO;
    }

    @Override
    public TransportType getTransportType() {
        return transportType;
    }
}


