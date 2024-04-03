package NewYear;

public abstract class Contact {
    private String name;

    public Contact(String name) {
        this.name = name;
    }

    public void sendMessage() {
        System.out.println("Отправим сообщение");
    }

    public void print() {
        System.out.println("Contact name: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
