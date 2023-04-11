import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {


    static Scanner scanner = new Scanner(System.in);
    static HashMap<String, ArrayList> map = new HashMap<>();

    public static void addressBookOperations() {
        AddressBook addressBookObj = new AddressBook();
        System.out.println("Enter how many addressBook you want to add: ");
        int addressBookNumber = scanner.nextInt();
        for (int i = 1; i <= addressBookNumber; i++) {
            ArrayList<Contact> list = new ArrayList<>();
            System.out.println("Enter the name of your AddressBook: ");
            String addressBookName = scanner.next();
            boolean reRun = true;
            do {
                System.out.println("Enter the operation number to perform the task. ");
                System.out.println(" 1. Add Contact \n 2. Edit Contact \n 3. Delete Contact \n 4. Add Multiple Contact \n 5. Display Contact \n 0. To terminate the program and add another Addressbook to the Hashmap. \n");
                int select = scanner.nextInt();
                switch (select) {
                    case 1:  //Add contact to the list
                        Contact contact = new Contact();
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
                        list.add(contact);
                        break;
                    case 2: // edit contact from the list
                        System.out.println("Enter the first name of the contact to edit :");
                        Scanner scanner1 = new Scanner(System.in);
                        String name = scanner1.next();
                        for (Contact item : list) {
                            if (item.getFirstName().equalsIgnoreCase(name)) {
                                System.out.println("Enter firstName: ");
                                firstName = scanner1.next();
                                System.out.println("Enter lastName: ");
                                lastName = scanner1.next();
                                System.out.println("Enter address: ");
                                address = scanner1.next();
                                System.out.println("Enter the city name: ");
                                city = scanner1.next();
                                System.out.println("Enter State name: ");
                                state = scanner1.next();
                                System.out.println("Enter zip code: ");
                                zip = scanner1.next();
                                System.out.println("Enter Phone number: ");
                                phoneNumber = scanner1.next();
                                System.out.println("Enter email id: ");
                                emailId = scanner1.next();
                                item.setFirstName(firstName);
                                item.setLastName(lastName);
                                item.setAddress(address);
                                item.setCity(city);
                                item.setState(state);
                                item.setZip(zip);
                                item.setPhoneNumber(phoneNumber);
                                item.setPhoneNumber(phoneNumber);
                                item.setEmailId(emailId);
                            } else {
                                System.out.println("Entered contact is not available in the address book: ");
                            }
                        }
                        break;
                    case 3: // Delete contact from the list
                        System.out.println("Enter the first name of the contact to delete the contact :");
                        Scanner scanner2 = new Scanner(System.in);
                        name = scanner2.next();
                        for (Contact item : list) {
                            if (item.getFirstName().equalsIgnoreCase(name)) {
                                list.remove(item);
                                System.out.println("The contact with name : " + name + " is deleted from the address book:");
                                return;
                            }
                        }
                        break;
                    case 4:  //Add multiple contacts in the addressbook
                        System.out.println("How many contact you want to add ? Enter number: ");
                        Scanner scanner4 = new Scanner(System.in);
                        int number = scanner4.nextInt();
                        for (int j = 1; j <= number; j++) {
                            contact = new Contact();
                            System.out.println("Enter firstName: ");
                            firstName = scanner4.next();
                            System.out.println("Enter lastName: ");
                            lastName = scanner4.next();
                            System.out.println("Enter address: ");
                            address = scanner4.next();
                            System.out.println("Enter the city name: ");
                            city = scanner4.next();
                            System.out.println("Enter State name: ");
                            state = scanner4.next();
                            System.out.println("Enter zip code: ");
                            zip = scanner4.next();
                            System.out.println("Enter Phone number: ");
                            phoneNumber = scanner4.next();
                            System.out.println("Enter email id: ");
                            emailId = scanner4.next();
                            contact.setFirstName(firstName);
                            contact.setLastName(lastName);
                            contact.setAddress(address);
                            contact.setCity(city);
                            contact.setState(state);
                            contact.setZip(zip);
                            contact.setPhoneNumber(phoneNumber);
                            contact.setEmailId(emailId);
                            list.add(contact);
                        }
                        break;
                    case 5:
                        for (Contact items : list) {
                            System.out.println(items.toString());
                        }
                        break;
                    case 0:
                        reRun = false;
                    default:
                        System.out.println("The program is terminated. Thank you for using Address Book Program ! ");
                }
            } while (reRun);
            map.put(addressBookName, list);
        }
    }

    public static void displayMap() { //To display the hashmap of multiple addressbooks.
        for (Map.Entry<String, ArrayList> entry : map.entrySet()) {
            String key = entry.getKey();
            ArrayList value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }
}