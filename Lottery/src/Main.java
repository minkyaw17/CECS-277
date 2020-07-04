import java.util.*;

public class Main {
    public static Set<Integer> generateWinningNumbers() {
        Set<Integer> WinningSet = new LinkedHashSet<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            WinningSet.add(rand.nextInt((40 - 1) + 1) + 1); // generating random integers from range 1-40 to add to the winning numbers
        }

        return WinningSet;

    }

    public static Set<Integer> getTicket() {
        Scanner in = new Scanner(System.in);

        Set<Integer> mySet = new LinkedHashSet<Integer>(); // using LinkedHashSet so it can be inputted with spaces

        System.out.println("Type 6 lotto numbers: "); // 6 lotto numbers from user
        for (int i = 0; i < 6; i++) {
            int input = in.nextInt();
            mySet.add(input);
        }

        return mySet;

//        System.out.println("Your ticket was: " + mySet);

    }

    public static void main(String[] args) {

//        Set<Integer> winningNumbers = generateWinningNumbers(); // generating random numbers 1-40 for the user to try and match
//        System.out.println("Winning numbers: " + winningNumbers);
//        HashSet<String> cats = new HashSet<String>();
        Set<String> cats = new HashSet<String>();
        
        Set<Integer> myTicket = getTicket(); // getting the ticket numbers from the user
        Set<Integer> winningNumbers = generateWinningNumbers(); // generating random numbers 1-40 for the user to try and match

        TreeSet<Integer> myTicketSorted = new TreeSet<Integer>(myTicket); // sorting my ticket
        TreeSet<Integer> winningNumbersSorted = new TreeSet<Integer>(winningNumbers); // sorting the winning numbers

        System.out.println("Your ticket was: " + myTicketSorted); // if it doesn't need to be sorted,
        // comment out the TreeSet and replace with myTicket
        System.out.println("Winning numbers: " + winningNumbersSorted); // if it doesn't need to be sorted,
        // comment out the TreeSet and replace it with winningNumbers

        myTicketSorted.retainAll(winningNumbersSorted); // if it doesn't need to be sorted, deleted the Sorted

        System.out.println("Match numbers: " + myTicketSorted);
        if (myTicketSorted.isEmpty()) {
            System.out.println("Sorry. No matching numbers.");
        }
        else {
            System.out.println("Your prize is $500.00");
        }
    }
}
