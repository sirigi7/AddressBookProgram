package addressbook;

public class UC3_EditContact {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the first name of the contact to edit :");
    String Name = scanner.next();
    if (contact.getFirstName().equalsIgnoreCase(Name))
        {
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
        }
    else
    {
        System.out.println("You entered a different name. ");
    }
}




