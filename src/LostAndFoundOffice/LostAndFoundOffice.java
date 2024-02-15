package LostAndFoundOffice;

public class LostAndFoundOffice {
    // создайте список things
    private Object[] things;

    public LostAndFoundOffice(Object[] things) {
        this.things = things;
    }

    // реализуйте метод put()
    public void put(Object obj) {
        for (int i = 0; i < things.length; i++) {
            if (things[i] == null) {
                things[i] = obj;
                return;
            }
        }
    }


    // реализуйте метод check()
    public Boolean check(Object target) {
        for (Object object : things) { // логика проверки вещи в списке
            if (object.equals(target)) {
                return true;
            }
        }
        return false;
    }

    public Object[] getThings() {
        return things;
    }

    public void setThings(Object[] things) {
        this.things = things;
    }
}
