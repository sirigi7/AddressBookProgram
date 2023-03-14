package addressbook;

public class AddMultipleContact {
    public void addMultipleContact() {
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
        Contact contactList = new Contact(firstName, lastName, address, zip, city, state, phoneNumber, emailId);
        list.add(contactList);
        for (Contact c : list) {
            System.out.println(c.toString());
        }
    }
}

