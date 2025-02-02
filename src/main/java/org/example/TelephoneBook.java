package org.example;

import java.util.ArrayList;

public class TelephoneBook {
    private int phoneNumber;
    private String surname;

    public TelephoneBook(int phoneNumber, String surname) {
        this.phoneNumber = phoneNumber;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public static void get(String surname, ArrayList<TelephoneBook> list) {
        int count = 0;
        System.out.println("По фамилии " + surname);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSurname().equals(surname)) {
                count++;
                System.out.print("Найден телефонный номер ");
                System.out.println(list.get(i).getPhoneNumber());
            }
        }
        if (count == 0) {
            System.out.println("телефонные номера не найдены.");
        }
    }
}
