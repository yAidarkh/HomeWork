package Shooter;

public class WaterGun extends Weapon{
    private String name;
    @Override
    public void shot() {
        // TODO override me!
        System.out.println("Водный пистолет стреляет");
        System.out.println("Пшых");
    }

    public WaterGun() {
        super("Вводный пистолет");
    }
}
