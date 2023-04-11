package org.example;

import org.example.PhoneBook;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();

        phonebook.add(new PhoneBook.Record("John Smith", "0999966999"));
        phonebook.add(new PhoneBook.Record("Jane Smith", "0669966999"));
        phonebook.add(new PhoneBook.Record("John Doe", "0996699666"));

        PhoneBook.Record record = phonebook.find("John Smith");
        if (record != null) {
            System.out.println("Found record: " + record.getName() + " - " + record.getPhoneNumber());
        } else {
            System.out.println("Record not found.");
        }

        List<PhoneBook.Record> records = phonebook.findAll("John Smith");
        if (records != null) {
            System.out.println("Found " + ((List<?>) records).size() + " records:");
            for (PhoneBook.Record r : records) {
                System.out.println(r.getName() + " - " + r.getPhoneNumber());
            }
        } else {
            System.out.println("No records found.");
        }
    }

}
