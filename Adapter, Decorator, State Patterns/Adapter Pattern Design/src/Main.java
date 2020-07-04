public class Main {
public static void main(String[] args) {
    SimpleName simple = new SimpleName();
    simple.setName("Min Kyaw");
    FullNameInterface fullName = new SimpleNameToFullNameAdapter(simple); //passing in the whole name to be converted into first and last name
    System.out.println("First Name: " + fullName.getFirstName()); // Display the first name
    System.out.println("Last Name: " + fullName.getLastName()); // Display the last name
    }
}

