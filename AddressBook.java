import java.util.*;

public class AddressBook {
    public static void main(String[] args) {


        Contact contact = null;

        List<Contact> contactList = new ArrayList<>();
        for(int i =0;i<3;i++)
        {
            contactList.add(getContact());
        }


        Comparator<Contact> compareByName =
                (Contact o1, Contact o2) -> o1.getFirstName().compareTo( o2.getFirstName() );

        Collections.sort(contactList, compareByName);
        System.out.println(contactList);
    }


    private static Contact getContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName=scanner.nextLine();
        System.out.println("Enter Last Name");
        String lastName=scanner.nextLine();
        System.out.println("Enter Phone No");
        String phoneNo=scanner.nextLine();
        System.out.println("Enter Address");
        String addr=scanner.nextLine();
        return new Contact(firstName,lastName,phoneNo,addr);
    }
}
