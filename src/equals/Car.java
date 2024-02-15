package equals;

import java.util.Objects;

public class Car {
    private String type;
    private String name;

    public Car(String type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj==null||this.getClass()!=obj.getClass()) return false;
        Car car = (Car) obj;
        return Objects.equals(name,car.name) && Objects.equals(type,car.type);
    }

    @Override
    public String toString() {
        return "Car{name=\"%s\",type = \"%s\"}".formatted(name, type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
