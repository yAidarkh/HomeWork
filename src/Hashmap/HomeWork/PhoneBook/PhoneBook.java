package Hashmap.HomeWork.PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<Contact>> groups;

    public PhoneBook(Map<String, List<Contact>> groups) {
        this.groups = groups;
    }

    public void addToGroup(Contact contact, String groupName) {
        Map<String, List<Contact>> temp = new HashMap<>();
        temp = getGroups();
        List<Contact> temp2 = new ArrayList<>();
        temp2.addAll(temp.get(groupName));
        temp2.add(contact);
        temp.put(groupName, temp2);
        System.out.println(temp);
        setGroups(temp);
    }

    public void createGroup(String groupName, List<Contact> contacts) {
        Map<String, List<Contact>> temp;
        temp = getGroups();
        temp.put(groupName, contacts);
        setGroups(temp);
    }

    public List<String> findContactByPhoneNumber(String phoneNumber) {
        List<String> answer = new ArrayList<>();
        for (Map.Entry<String, List<Contact>> entry : getGroups().entrySet()) {
            for (Contact contact : entry.getValue()) {
                if (contact.getPhoneNumber().equals(phoneNumber)) {
                    answer.add(entry.getKey());
                }
            }
        }
        return answer;
    }

    public List<String> findContactByContact(Contact contact) {
        List<String> answer = new ArrayList<>();
        for (Map.Entry<String, List<Contact>> entry : getGroups().entrySet()) {
            if (entry.getValue().contains(contact)) {
                answer.add(entry.getKey());
            }
        }
        return answer;
    }

    public Map<String, List<Contact>> getGroups() {
        return groups;
    }

    public void setGroups(Map<String, List<Contact>> groups) {
        this.groups = groups;
    }
}
