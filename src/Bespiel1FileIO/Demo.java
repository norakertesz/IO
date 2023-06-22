package Bespiel1FileIO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Main starting...");
        Address a1 = new Address("Nora", "Kertesz", "06604545788", "bnnjkj@hmail.com");
        Address a2 = new Address("Joe", "Kertesz", "06604545788", "kbnkj@hmail.com");
        Address a3 = new Address("Lola", "Kertesz", "06644545788", "kdfg@hmail.com");
        Address a4 = new Address("Monika", "Martin", "06674545788", "kdfj@hmail.com");
        Address a5 = new Address("Kocos", "Kertesz", "06604867588", "bnmkj@hmail.com");

        //System.out.println(a1);

        AddressManager list = new AddressManager(new ArrayList<>());
        // System.out.println(list);

        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);
        list.printAllAddresses();
        try {
            list.exportToCsv("C:\\Users\\s53029\\Desktop\\Nora\\P3\\pupu.csv", ";");
        } catch (AddressExportException e) {
            throw new RuntimeException("sjudghfi");
        } catch (AddressExportFileAlreadyExistsException e) {
            System.out.println("Already exist");
        }
        try {
            list.loadFromCsv("C:\\Users\\s53029\\Desktop\\Nora\\P3\\pupu.csv", ";");
        } catch (AddressLoadWrongFormatException e) {
            throw new RuntimeException("sjudghfi");
        } catch (AddressLoadException e) {
            throw new RuntimeException("sjudghfi");
        }

    }
}
