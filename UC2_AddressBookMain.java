package addressbook;

public class UC2_AddressBookMain {
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");
        EditContact addressBook1 = new EditContact();
        addressBook1.addContact();
        System.out.println(addressBook1.contact.getFirstName());
        System.out.println(addressBook1.contact.getLastName());
        System.out.println(addressBook1.contact.getAddress());
        System.out.println(addressBook1.contact.getCity());
        System.out.println(addressBook1.contact.getState());
        System.out.println(addressBook1.contact.getZip());
        System.out.println(addressBook1.contact.getPhoneNumber());
        System.out.println(addressBook1.contact.getEmailId());
    }
}

