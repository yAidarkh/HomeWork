package Hashmap.HomeWork.PhoneBook;

import java.util.Objects;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

// Я пытался но с помощью equals и hashcode проверку сделать не удалось

//    @Override
//    public int hashCode() {
//        return (name.hashCode() * 31 + phoneNumber.hashCode());
//    }

//    @Override
//    public boolean equals(Object obj) {
//        return super.hashCode() == obj.hashCode();
//    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
