package Abstract;

public class Manager {
    public void getTypesList(){
        int count = 1;
        for (TransportType value : TransportType.values()) {
            if(value.getType() != null) {
                System.out.printf("%d. %s\n", count, value.getType());
                count++;
            }
        }
    }
    public void menu(){
        System.out.println("Меню:");
        System.out.println("1. Добавить транспорт");
        System.out.println("2. Вывести транспорт определленного типа.");
        System.out.println("3. Поменять местами транспорт");
        System.out.println("4. Выход");
    }
}
