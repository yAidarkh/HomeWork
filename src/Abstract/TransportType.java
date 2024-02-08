package Abstract;

public enum TransportType {
    TRANSPORT (null,0),
    BICYCLE ("Велосипед",2),
    BOAT ("Лодка",0),
    AUTO ("Машина",4),
    MOTOCYCLE ("Мотоцикл",2);
    private final String type;
    private final int wheelCount;

    TransportType(String type, int wheelCount) {
        this.type = type;
        this.wheelCount = wheelCount;
    }

    public String getType() {
        return type;
    }

    public int getWheelCount() {
        return wheelCount;
    }


}
