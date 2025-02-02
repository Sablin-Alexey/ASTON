package org.example;

import java.util.ArrayList;
import java.util.Set;

import static org.example.TelephoneBook.get;

public class Main {
    public static void main(String[] args) {

        String[] collectionWord = {"осень", "зима", "апрель", "май", "лето", "осень", "октябрь", "январь", "весна", "осень", "май"};
        Set<String> noDuplicates = NoDuplicate.antiduplicate(collectionWord);
        System.out.println("список слов без дублей: " + noDuplicates);

        TelephoneBook telephoneBookPage1 = new TelephoneBook(87978, "Ivanov");
        TelephoneBook telephoneBookPage2 = new TelephoneBook(877777, "Petrov");
        TelephoneBook telephoneBookPage3 = new TelephoneBook(87900008, "Sidorov");
        TelephoneBook telephoneBookPage4 = new TelephoneBook(8037009, "Ivanov");
        TelephoneBook telephoneBookPage5 = new TelephoneBook(87978, "Ivanov");
        ArrayList<TelephoneBook> telephoneBooks = new ArrayList<>();
        telephoneBooks.add(telephoneBookPage1);
        telephoneBooks.add(telephoneBookPage2);
        telephoneBooks.add(telephoneBookPage3);
        telephoneBooks.add(telephoneBookPage4);
        telephoneBooks.add(telephoneBookPage5);

        get("Ivanov", telephoneBooks);
    }
}