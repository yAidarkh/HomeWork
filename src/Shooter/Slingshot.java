package Shooter;

public class Slingshot extends Weapon{
    private String name;
    @Override
    public void shot() {
        // TODO override me!
        System.out.println("Рогатка стреляет");
        System.out.println("Сьууу");
    }

    public Slingshot() {
        super("Рогатка");
    }
}
