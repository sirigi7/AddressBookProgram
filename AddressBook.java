package addressbook;

import java.util.Scanner;

public class AddressBook {



        Contact contact = new Contact();

        void addContact() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter firstName: ");
            String firstName = scanner.next();
            System.out.println("Enter lastName: ");
            String lastName = scanner.next();
            System.out.println("Enter address: ");
            String address = scanner.next();
            System.out.println("Enter the city name: ");
            String city = scanner.next();
            System.out.println("Enter State name: ");
            String state = scanner.next();
            System.out.println("Enter zip code: ");
            String zip = scanner.next();
            System.out.println("Enter Phone number: ");
            String phoneNumber = scanner.next();
            System.out.println("Enter email id: ");
            String emailId = scanner.next();
            contact.setFirstName(firstName);
            contact.setLastName(lastName);
            contact.setAddress(address);
            contact.setCity(city);
            contact.setState(state);
            contact.setZip(zip);
            contact.setPhoneNumber(phoneNumber);
            contact.setEmailId(emailId);
        }
        public void editContact() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first name of the contact to edit :");
            String Name = scanner.next();
            if (contact.getFirstName().equalsIgnoreCase(Name)) {
                System.out.println("Enter firstName: ");
                String firstName = scanner.next();
                System.out.println("Enter lastName: ");
                String lastName = scanner.next();
                System.out.println("Enter address: ");
                String address = scanner.next();
                System.out.println("Enter the city name: ");
                String city = scanner.next();
                System.out.println("Enter State name: ");
                String state = scanner.next();
                System.out.println("Enter zip code: ");
                String zip = scanner.next();
                System.out.println("Enter Phone number: ");
                String phoneNumber = scanner.next();
                System.out.println("Enter email id: ");
                String emailId = scanner.next();
                Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, emailId);
                this.contact = contact;
            } else {
                System.out.println("You entered a different name. ");
            }
        }
        public void deleteContact() { //This method is to delete a contact by its first name.
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first name of the contact to delete the contact :");
            String Name = scanner.next();
            if (contact.getFirstName().equalsIgnoreCase(Name)) {
                System.out.println("The contact has deleted. ");
                contact.setFirstName(null);
                contact.setLastName(null);
                contact.setAddress(null);
                contact.setCity(null);
                contact.setState(null);
                contact.setZip(null);
                contact.setPhoneNumber(null);
                contact.setEmailId(null);

            }
        }
}
