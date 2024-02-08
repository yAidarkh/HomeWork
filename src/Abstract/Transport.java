package Abstract;

public abstract class Transport {
    private String name;
    private String transportType;
    private int wheelCount;
    private int speed;

    public Transport(String name, String transportType, int wheelCount, int speed) {
        this.name = name;
        this.transportType = transportType;
        this.wheelCount = wheelCount;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
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
