package Shooter;

public class Weapon {
    private String name;
    public void shot() {
        // TODO override me!
    }

    public Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
