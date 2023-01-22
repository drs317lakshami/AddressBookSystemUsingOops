package com.bridgelabz.addressbookprogram;

import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook {
        static Scanner sc = new Scanner(System.in);
        static Contacts contacts=new Contacts();
     ArrayList<Contacts> list = new ArrayList<>();
     public void addNewContact() {
        System.out.println("----------------------------------");
        System.out.println("Enter the Contact Details :-");
        System.out.println("Enter the First Name :");
        contacts.setFirstname(sc.next());
        System.out.println("Enter the Last Name :");
        contacts.setLastname(sc.next());
        System.out.println("Enter the Address :");
        contacts.setAddress(sc.next());
        System.out.println("Enter the City :");
        contacts.setCity(sc.next());
        System.out.println("Enter the State :");
        contacts.setState(sc.next());
        System.out.println("Enter the PIN Code :");
        contacts.setPin(sc.nextInt());
        System.out.println("Enter the Phone Number :");
        contacts.setPhoneNumber(sc.nextInt());
        System.out.println("Enter the EMail ID :");
        contacts.setEmail(sc.next());
        System.out.println("Contacts Added Successfully------!!!");
        System.out.println("-----------------------------------------");
        list.add(contacts);
    }
    public void displayContact() {
        if (contacts.getFirstname() == null) {
            System.out.println("Contact Not Found");
        } else {
            for (Contacts cont : list) {
                System.out.println(cont);
            }
        }
    }
    public void editContact() {
        contacts=new Contacts();
        System.out.println("Enter the First Name : ");
        String firstName = sc.next();
        if (firstName.equalsIgnoreCase(contacts.getFirstname())) {
            System.out.println("Match Found--------!!!!");
            System.out.println("-----------------------");
            System.out.println("Enter the First Name :");
            contacts.setFirstname(sc.next());
            System.out.println("Enter the Last Name :");
            contacts.setLastname(sc.next());
            System.out.println("Enter the Address :");
            contacts.setAddress(sc.next());
            System.out.println("Enter the City :");
            contacts.setCity(sc.next());
            System.out.println("Enter the State :");
            contacts.setState(sc.next());
            System.out.println("Enter the PIN Code :");
            contacts.setPin(sc.nextInt());
            System.out.println("Enter the Phone Number :");
            contacts.setPhoneNumber(sc.nextInt());
            System.out.println("Enter the EMail ID :");
            contacts.setEmail(sc.next());
            System.out.println("-------------------------------");
            System.out.println("Contact Update Successfully-----!!");
            list.add(contacts);
        } else {
            System.out.println("The Entered Contact Name is Not Available in Address Book");
        }
    }
    public void deleteContact() {
        System.out.println("Enter the First Name : ");
        String firstName = sc.next();
        if (firstName.equalsIgnoreCase(contacts.getFirstname())) {
            list.remove(contacts);
            System.out.println("Contact Deleted Successfully-------!!!");
        }else {
            System.out.println("Not Found");
        }
    }
}