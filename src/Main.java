import java.util.Scanner;
import java.util.LinkedList;
public class Main {
    //This program creates a contact book
    public static void main(String[] args)
    {
        //Create Linked Lists for the name, phone number, and email.
        LinkedList<String> name = new LinkedList<String>();
        LinkedList<Long> phoneNumber = new LinkedList<Long>();
        LinkedList<String> email = new LinkedList<String>();

        //Create scanner and declare temp variables that will be used later.
        Scanner scanner = new Scanner(System.in);
        String tempName;
        long tempNum;
        String tempEmail;
        int index;

        //This boolean will be used to exit the while loop.
        boolean done = false;

        //While loop will print menu and execute command depending on input.
        //Will keep looping until user inputs "Q".
        while(done == false) {
            //This  prints the menu
            System.out.println("*********************");
            System.out.println("(A)dd");
            System.out.println("(D)elete");
            System.out.println("(E)mail Search");
            System.out.println("(P)rint List");
            System.out.println("(S)earch");
            System.out.println("(Q)uit");
            System.out.println("*********************");

            //This takes input from user for a command.
            System.out.println("Enter a command: ");
            String menu = scanner.nextLine();

            //Switch case for different commands.
            switch (menu) {
                case "A":
                    //This adds a name to the name linked list
                    System.out.println("Enter Name: ");
                    tempName = scanner.nextLine();
                    name.add(tempName);

                    //This adds a phone number to the phoneNumber linked list
                    System.out.println("Enter Phone Number: ");
                    tempNum = scanner.nextLong();
                    phoneNumber.add(tempNum);
                    //This clears the scanner
                    scanner.nextLine();

                    //This adds an email to the email linked list
                    System.out.println("Enter Email Address: ");
                    tempEmail = scanner.nextLine();
                    email.add(tempEmail);

                    break;
                case "D":
                    //This searches a name that the user inputs and deletes the name, and also
                    //the phone number and email associated with the name.
                    System.out.println("Enter Name: ");
                    tempName = scanner.nextLine();
                    if (name.contains(tempName)) {
                        index = name.indexOf(tempName);
                        name.remove(tempName);
                        phoneNumber.remove(index);
                        email.remove(index);
                        break;
                    }
                    //If the inputted name doesn't exist, display "Error".
                    System.out.println("Error");
                    break;
                case "E":
                    //This searches an email that the user inputs and prints the email and also
                    //the name and phone number associated with it.
                    System.out.println("Search Email: ");
                    tempEmail = scanner.nextLine();
                    if (email.contains(tempEmail)) {
                        index = email.indexOf(tempEmail);
                        System.out.println("Name: " + name.get(index));
                        System.out.println("Phone Number: " + phoneNumber.get(index));
                        System.out.println("Email: " + email.get(index));
                        break;
                    }
                    //If no email is found, display "Error".
                    System.out.println("Error");
                    break;
                case "P":
                    //Print name, phoneNumber, and email linked lists.
                    System.out.println(name);
                    System.out.println(phoneNumber);
                    System.out.println(email);
                case "S":
                    //This searches a name that the user inputs and prints out the name
                    //and also the phone number and email associated with the name.
                    System.out.println("Enter name: ");
                    tempName = scanner.nextLine();
                    if (name.contains(tempName)) {
                        index = name.indexOf(tempName);
                        System.out.println("Name: " + name.get(index));
                        System.out.println("Phone Number: " + phoneNumber.get(index));
                        System.out.println("Email: " + email.get(index));
                    }
                    //Display "Error" if name not found.
                    System.out.println("Error");
                    break;
                case "Q":
                    //Break the while loop by changing "done" boolean into true.
                    done = true;
                    break;
                default:
                    //If the user inputs a command that doesn't exist,
                    //display "Error".
                    System.out.println("Error");
                    break;
            }
        }
    }
}