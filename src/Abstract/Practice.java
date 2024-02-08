package Abstract;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Garage garage = new Garage(new Transport[]{
                new Motocycle("Мото",300),
                new Motocycle("Мото2",300),
                new Motocycle("Мото3",300),
                new Bicycle("Велик",40),
                new Bicycle("Велик2",40),
                new Boat ("Лодка",30),
                new Auto("Седан",300),
                new Auto("Седан2",300),
                null,
                null
        });
//        garage.addTransportToGarage(new Boat("Лодка2",30));
//        garage.addTransportToGarage(new Boat("Седан3",300));
//        garage.addTransportToGarage(new Boat("Лодка3",30));
//        garage.getGrageList();
//        garage.showAllTransportOneType("Лодка");
//        garage.changeTransportPositionInGarage(3,1);
//        garage.getGrageList();
        Manager manager = new Manager();
        while (true){
            manager.menu();
            System.out.print("Выберите пункт: \n");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            switch (answer){
                case 1:
                    manager.getTypesList();
                    System.out.print("Выберите тип: ");
                    int transportType = scanner.nextInt();
                    switch (transportType){
                        case 1:
                            System.out.print("Напишите название: \n");
                            String name = scanner.next();
                            System.out.print("Напишите скорость: ");
                            int speed = scanner.nextInt();
                            Bicycle bicycle =new Bicycle(name,speed);
                            garage.addTransportToGarage(bicycle);
                            break;
                        case 2:
                            System.out.print("Напишите название: ");
                            String name2 = scanner.nextLine();
                            System.out.print("Напишите скорость: ");
                            int speed2 = scanner.nextInt();
                            Boat boat =new Boat(name2,speed2);
                            garage.addTransportToGarage(boat);
                            break;
                        case 3:
                            System.out.print("Напишите название: ");
                            String name3 = scanner.nextLine();
                            System.out.print("Напишите скорость: ");
                            int speed3 = scanner.nextInt();
                            Auto auto =new Auto(name3,speed3);
                            garage.addTransportToGarage(auto);
                            break;
                        case 4:
                            System.out.print("Напишите название: ");
                            String name4 = scanner.nextLine();
                            System.out.print("Напишите скорость: ");
                            int speed4 = scanner.nextInt();
                            Motocycle motocycle =new Motocycle(name4,speed4);
                            garage.addTransportToGarage(motocycle);
                            break;
                    }

                    break;
                case 2:
                    manager.getTypesList();
                    System.out.print("Выберите тип: ");
                    int transportType2 = scanner.nextInt();
                    garage.showAllTransportOneType(TransportType.values()[transportType2].getType());
                    break;
                case 3:
                    garage.getGrageList();
                    System.out.print("Выберите какой транспорт переместить: ");
                    int before = scanner.nextInt();
                    System.out.print("Куда переместить: ");
                    int after = scanner.nextInt();
                    garage.changeTransportPositionInGarage(before,after);
                    garage.getGrageList();
                    break;
                case 4:
                    System.out.println("Вы вышли");
                    break;

            }
            if (answer==4){
                break;
            }
        }
    }


}
