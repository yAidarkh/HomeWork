package NewYear;

import java.util.List;

public class ContactBook<T extends Contact> {
    // Объявите поле класса contacts - список контактов книги
    private List<T> contacts;

    public ContactBook(List<T> contacts) {
        this.contacts = contacts;
    }

    public void addContact(T contact) {
        contacts.add(contact);
    }

    public void printList() {
        // Выведите на экран весь список контактов книги
        for (T contact : contacts) {
            System.out.println("Имя: " + contact.getName());
            contact.print();
        }
    }

    public void congratulate(String name) {
        boolean contactPresented = false; //проверяем есть ли контакт в базе
        // Найдите контакт в книге по имени, и отправьте ему сообщение с помощью метода sendMessage()
        T contact = null;
        for (T c : contacts) {
            if (c.getName().equals(name)) {
                contactPresented = true;
                contact = c;
                break;
            }
        }

        if (contactPresented) {
            System.out.println("Поздравим с Новым годом ваш контакт из записной книжки: " + name);
            contact.sendMessage();
        } else {
            // Если контакт не найден, выведите соответсвующее сообщение
            System.out.println("Не найден контакт с указанным именем.");
        }
    }
}
