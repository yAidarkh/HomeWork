package auto;

public class Main {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(),
                new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(),
                new PickupType(), new DieselType());
        VehicleAd someCar = new VehicleAd("someCar","111",new CarType(),
                new SedanType(),new PetrolType());

        adsService.setAdList(new VehicleAd[] {volvoAd, kamazAd, someCar});

        //adsService.filterByVehicleTypeByPurpose(new PassengerType());

        //adsService.filterByVehicleTypeByPurpose(new TruckType());

        adsService.filterByVehicleTypeByFuelTypes(new PetrolType());

        //TODO Создайте объявление с типами CAR, SEDAN, PETROL и отфильтруйте объявления с бензиновым топливом
    }
}
