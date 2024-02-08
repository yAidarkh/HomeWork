package Abstract;

public abstract class Transport {
    private String name;
    private TransportType transportType;
    private int wheelCount;
    private int speed;

    public Transport(String name, int speed) {
        this.name = name;
        this.speed = speed;
        this.transportType = TransportType.TRANSPORT;
        this.wheelCount = TransportType.TRANSPORT.getWheelCount() ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TransportType getTransportType() {
        return transportType;
    }


    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
