package Shooter;

public class RPG extends Weapon{
    private String name;
    @Override
    public void shot() {
        // TODO override me!
        System.out.println("РПГ стреляет");
        System.out.println("Бах");
    }

    public RPG() {
        super("РПГ");
    }
}
