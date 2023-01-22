package com.bridgelabz.addressbookprogram;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book program");//display welcome message
        AddressBook addressBook = new AddressBook();//creating object of address book
        Scanner sc = new Scanner(System.in);//create an object of scanner class

        boolean flag1 = true;
        while (flag1) {
            System.out.println("*************\n"+addressBook.addressBookList.keySet());
            System.out.println("current AddressBook Name: "+addressBook.currentAddressBookName);
            System.out.println("************\nSelect Option :\n1.Add Contact\n2.Edit Contact\n3.Delete Contact\n4.Display contact\n5.Add New Address Book\n6.Select Address Book\n7.Exit");
            int option = sc.nextInt();
            switch (option) { //select option
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    addressBook.deleteContact();
                    break;
                case 4:
                    addressBook.displayContact();
                    break;
                case 5:
                    addressBook.addNewAddressBook();
                    break;
                case 6:
                    addressBook.selectAddressBook();
                    break;
                case 7:
                    flag1 = false;
                    break;
                default:
                    System.out.println(option + " is not valid option");
                    break;
            }
        }
    }
}