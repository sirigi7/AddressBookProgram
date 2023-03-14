package addressbook;

public class DeleteContactFromAddressBook {
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

