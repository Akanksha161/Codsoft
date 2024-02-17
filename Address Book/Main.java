import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final MobilePhone mobilePhone = new MobilePhone("123456789");

    public static void main(String[] args){
    System.out.println("Welcome to Address Book System");
    System.out.println("===============================");

        boolean exitRequested = false;
        while(!exitRequested) {
            PrintService.printMenu();
            int options = Integer.parseInt(sc.nextLine());
            switch (options) {
                case 1:
                    mobilePhone.printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    searchContact();
                    break;
                case 5:
                    changeContact();
                    break;
                case 6:
                    exitRequested = true;
                    break;
            }
        }
    }
    private static void addContact() {
        System.out.println("Name?");
        String name = sc.nextLine();
        System.out.println("Phone number:");
        String phoneNumber = sc.nextLine();
        if (phoneNumber.length() != 10) {
            System.out.println("Wrong input!");
        } else {
            mobilePhone.addContact(name, phoneNumber);
        }
    }
    private static void removeContact(){
        System.out.println("Which contact would you like to remove?" +"\n" +
                        "Please type phone number.");
        String phoneNumber = sc.nextLine();
        mobilePhone.removeContact(phoneNumber);
    }

    private static void searchContact(){

        System.out.println("Please enter phone number ");
        String phoneNumber = sc.nextLine();
        if(mobilePhone.searchContactByPhoneNumber(phoneNumber) == -1) {
            System.out.println("No contact found with phone number " + phoneNumber);
        } else {
            mobilePhone.searchContactByPhoneNumber(phoneNumber);
        }
    }

    private static void changeContact(){
        System.out.println("Which contact would you like to modify?");
        String currentName = sc.nextLine();
        System.out.println("Enter your modify");
        String updatedName = sc.nextLine();
        mobilePhone.changeContact(currentName,updatedName);
    }
}