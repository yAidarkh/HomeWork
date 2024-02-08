package Abstract;

public class Practice {
    public static void main(String[] args) {
        Garage garage = new Garage(new Transport[]{
                new Motocycle("Мото","Мотоцикл",2,300),
                new Motocycle("Мото2","Мотоцикл",2,300),
                new Motocycle("Мото3","Мотоцикл",2,300),
                new Bicycle("Велик","Велосипед",2,40),
                new Bicycle("Велик2","Велосипед",2,40),
                new Boat ("Лодка","Лодка",0,30),
                new Auto("Седан","Автомобиль",4,300),
                new Auto("Седан2","Автомобиль",4,300),
                null,
                null
        });
        garage.addTransportToGarage(new Boat("Лодка2","Лодка",0,30));
        garage.addTransportToGarage(new Boat("Седан3","Автомобиль",4,300));
        garage.addTransportToGarage(new Boat("Лодка3","Лодка",0,30));
        garage.getGrageList();
        garage.showAllTransportOneType("Лодка");
        garage.changeTransportPositionInGarage(3,1);
        garage.getGrageList();
    }
}
