package phoneBookLab;
import java.util.*;

public class Main {

    public static void main(String[] args) {

    PhoneBook phoneBook = new PhoneBook();

    //Add phone numbers
        phoneBook.add("Cesar", "302-123-4567");
        phoneBook.add("Joe", "987-654-3210");
        phoneBook.addAll("Walter", "111-222-3333");

    //Remove a person
        phoneBook.remove("Walter");
        System.out.println(phoneBook);

    //Check if an entry exists
        System.out.println("Does Cesar exist in this phone book?: " + phoneBook.hasEntry("Cesar"));

    //Look up phone numbers
        System.out.println("Joe's phone number: " + phoneBook.lookup("Joe"));

    //Reverse lookup
        System.out.println("987-654-3210 belongs to: " + phoneBook.reverseLookUp("987-654-3210"));

    //Get all contact names
        System.out.println("All contact names: " + phoneBook.getAllContactNames());

    //Print the phone book
        System.out.println("Phone book contents: " + phoneBook);
}

}

