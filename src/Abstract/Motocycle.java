package Abstract;

public class Motocycle extends Transport{
    private TransportType transportType;
    private TransportType wheelCount;
    public Motocycle(String name, int speed) {
        super(name, speed);
        this.wheelCount= TransportType.MOTOCYCLE;
        this.transportType = TransportType.MOTOCYCLE;
    }

    @Override
    public TransportType getTransportType() {
        return transportType;
    }
}
