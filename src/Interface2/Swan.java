package Interface2;

public class Swan extends Animal implements Flyable,Swimable{
    @Override
    public void makesound() {

    }

    @Override
    public void soarHigh() {

    }

    @Override
    public void startSwimming() {

    }

    @Override
    public void stopSwimming() {

    }

    @Override
    public void gracefulSwim() {
        System.out.println("Изящно плавает!");
    }
}
