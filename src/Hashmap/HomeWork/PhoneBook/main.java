package Hashmap.HomeWork.PhoneBook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("IVAN", "01");
        Contact contact2 = new Contact("ANTON", "02");
        Contact contact3 = new Contact("ANDREY", "03");
        Contact contact4 = new Contact("ALESHA", "04");
        Contact contact5 = new Contact("DANTES", "05");
        HashMap<String, List<Contact>> contacts = new HashMap<>();
        PhoneBook phoneBook = new PhoneBook(contacts);
        phoneBook.createGroup("Friends", List.of(contact1, contact4, contact2));
        phoneBook.createGroup("Work", List.of(contact1, contact5));
        phoneBook.createGroup("Travel", List.of(contact3));
        phoneBook.addToGroup(contact4, "Travel");
        phoneBook.addToGroup(contact3, "Work");
        System.out.println(phoneBook.findContactByContact(contact4));
        System.out.println(phoneBook.findContactByPhoneNumber(contact3.getPhoneNumber()));
    }
}
