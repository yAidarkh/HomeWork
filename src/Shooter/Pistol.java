package Shooter;

public class Pistol extends Weapon{
    private String name;
    @Override
    public void shot() {
        // TODO override me!
        System.out.println("Пистолет стреляет");
        System.out.println("Пив-Пав.");
    }

    public Pistol() {
        super("Пистолет");

    }
}
