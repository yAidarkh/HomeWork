package auto;

public class VehicleTypeByFuelTypes extends VehicleType{

    public VehicleTypeByFuelTypes() {
        super("Vehicle type by purpose");
    }
    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        VehicleTypeByFuelTypes that = (VehicleTypeByFuelTypes) object;
        return attribute != null ? attribute.equals(that.attribute) : false;
    }
}
