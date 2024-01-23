package Shooter;

public class Automate extends Weapon{
    private String name;
    @Override
    public void shot() {
        // TODO override me!
        System.out.println("Автомат стреляет");
        System.out.println("Тра-та-та-та");
    }

    public Automate() {
        super("Автомат");
    }
}
