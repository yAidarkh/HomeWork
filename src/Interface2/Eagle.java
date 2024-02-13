package Interface2;

public class Eagle extends BirdOfPrey implements Flyable{
    @Override
    public void soarHigh() {
        System.out.println("Парить высоко в воздухе!");
    }

    @Override
    public void makesound() {

    }
}
