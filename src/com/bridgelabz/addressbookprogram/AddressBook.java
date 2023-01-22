package com.bridgelabz.addressbookprogram;

/**
 * 
 * @author dev
 *
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {

    private static final Contacts[] addressBook1 = null;
	Scanner sc = new Scanner(System.in);
    static HashMap<String,ArrayList> addressBookList = new HashMap<>();// create an object of hashmap
    static ArrayList <Contacts> currentAddressBook;// declare variable
    static String currentAddressBookName;//declare variable

    /*
    create contacts
     */
    public Contacts createContact() {
    	Contacts person = new Contacts();//creating object of ContactPerson class
        System.out.print("Enter First Name: ");
        person.setFirstName(sc.next());//using object reference calling setFirstName method to set first name
        System.out.print("Enter Last Name: ");
        person.setLastName(sc.next());
        System.out.print("Enter Address: ");
        person.setAddress(sc.next());
        System.out.print("Enter City: ");
        person.setCity(sc.next());
        System.out.print("Enter State: ");
        person.setState(sc.next());
        System.out.print("Enter email: ");
        person.setEmail(sc.next());
        System.out.print("Enter ZipCode: ");
        person.setZipCode(sc.nextInt());
        System.out.print("Enter Phone Number: ");
        person.setPhoneNumber(sc.nextLong());
        System.out.println("created new contact");
        return person;
    }

    // Add new contacts to address book
    public void addContact() {
    	Contacts contactPerson = createContact();//call createContact method and store in contactPerson
        currentAddressBook.add(contactPerson);//using hashmap object reference call add method
        System.out.println(contactPerson);//print contact details of person
        System.out.println("Contact added successfully");
    }

    /*
    Edit existing contact using person`s name
    if contact found then edit otherwise no contact found message will be display
     */
    public void editContact() {
        boolean isContactFound = false;
        System.out.println("Enter Name to edit Contact");
        String name = sc.next();
        for (Contacts contactPerson : addressBook1) { //iterate over the arraylist
            if (name.equalsIgnoreCase(contactPerson.getFirstName())) {
                isContactFound = true;
                System.out.print("Enter First Name :");
                contactPerson.setFirstName(sc.next());
                System.out.print("Enter Last Name :");
                contactPerson.setLastName(sc.next());
                System.out.print("Enter Address :");
                contactPerson.setAddress(sc.next());
                System.out.print("Enter City :");
                contactPerson.setCity(sc.next());
                System.out.print("Enter State :");
                contactPerson.setState(sc.next());
                System.out.print("Enter email :");
                contactPerson.setEmail(sc.next());
                System.out.print("Enter ZipCode :");
                contactPerson.setZipCode(sc.nextInt());
                System.out.print("Enter Phone Number :");
                contactPerson.setPhoneNumber(sc.nextLong());
                System.out.println(contactPerson);
                break;
            }
        }
        if (isContactFound) {
            System.out.println("Contact Updated Successfully..");
        } else {
            System.out.println("Oops...Contact not found");
        }
    }

    /*
    Delete contact using person`s name
    if contact found then delete that contact
     if no contact found then message will be display as oops....contact not found
     */
    public void deleteContact(){
        boolean isContactFound = false;
        System.out.println("enter name to delete contact");
        String name = sc.next();
        for (Contacts contactPerson : currentAddressBook){
            if (contactPerson.getFirstName().equalsIgnoreCase(name)) {
                System.out.println("contact found:");
                isContactFound = true;
                System.out.println(contactPerson);
                System.out.println("confirm to delete (y/n)");
                if (sc.next().equalsIgnoreCase("y")) {
                    currentAddressBook.remove(contactPerson);
                    System.out.println("contact deleted");
                }
                break;
            }
        }
        if (!isContactFound) {
            System.out.println("Opps... contact not found");
        }
    }

    /*
    add multiple address book
    each address book has unique name
     */
    void addNewAddressBook(){
        System.out.println("Enter name for AddressBook: ");
        String addressBookName = sc.next();
        ArrayList <Contacts> addressBook = new ArrayList();//creating object of arraylist
        //using object reference of hashmap calling put method and passing key as addressBookName and value as addressBook
        addressBookList.put(addressBookName,addressBook);
        System.out.println("new AddressBook created");
        currentAddressBook = addressBookList.get(addressBookName);//retrieve addressBookName using get method
        currentAddressBookName = addressBookName;//addressBookName store in current addressBookName
    }

    /*
    select address book
    if we want to add more contact in existing address book then select that address book
     */
    void selectAddressBook(){
        System.out.println(addressBookList.keySet());
        System.out.println("Enter name of address book:");
        String addressBookName = sc.next();
        
        for (String key : addressBookList.keySet()) {
            if (key.equalsIgnoreCase(addressBookName)){
                currentAddressBook = addressBookList.get(key);
                currentAddressBookName = key;
            }
        }
        System.out.println("current AddressBook is: "+currentAddressBookName);
    }

    /*
    Display contact
    */
    void displayContact(){
        System.out.println("Contacts: ");
        for (Object p : currentAddressBook) {
        	Contacts person = (Contacts) p;
            System.out.println(person);
        }
    }
}