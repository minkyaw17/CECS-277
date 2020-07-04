import java.util.Scanner;
import java.util.ArrayList;

public class VendingMachineInputMenu {

    Scanner in = new Scanner(System.in);
    Coin c = new Coin();
    Product p = new Product();
    ArrayList<Double> myList = new ArrayList<Double>();

    /**
     * Scanner for user input to set the Product, Price, and Quantity
     * @return Product
     */
    public Product inputProduct() {
        Scanner in = new Scanner(System.in);
        System.out.println("Description:");
        String dscrp = in.next();
        p.setName(dscrp);
        System.out.println("Price:");
        double Price = in.nextDouble();
        p.setPrice(Price);
        System.out.println("Quantity:");
        int Quantity = in.nextInt();
        p.setQuantity(Quantity);

        return new Product(p.getName(), p.getPrice(), p.getQuantity());
    }

    /**
     * Adding Coins into the Vending Machine
     * @return Coin
     */
    public Coin inputCoin() {
        Scanner in = new Scanner(System.in);
        System.out.println("A) Nickel @ $0.05");
        System.out.println("B) Dime @ $0.10");
        System.out.println("C) Quarter @ $0.25");
        System.out.println("D) Dollar @ $1.00");

        char input = in.next().charAt(0);

        switch (input) {
            case 'A':
            case 'a':
                return new Coin("Nickel", 0.05);

            case 'B':
            case 'b':
                return new Coin("Dime", 0.10);

            case 'C':
            case 'c':
                return new Coin("Quarter", 0.25);

            case 'D':
            case 'd':
                return new Coin("Dollar", 1.00);

            default:
                return null;
        }

    }

    /**
     * Displaying the products
     * @param Products
     */
    public void displayProducts(ArrayList<Product> Products) {
        for (Product p: Products) {
            System.out.println(p.getName() + " @ $" + p.getPrice());
        }
    }

    /**
     * Displaying the products menu
     * @param Products
     */
    public void displayProductsMenu(ArrayList<Product> Products) {
        char A = 'A';
        for (Product p: Products) {
            System.out.println(A + ") " + p.getName() + " @ $" + p.getPrice());
            A++; // counter to increment the ASCII of the character
        }
    }

    double sum = 0;

    /**
     * Method to buy the Product
     * @param Products
     * @param input
     * @param cS
     */
    public void purchaseProduct(ArrayList<Product> Products, char input, CoinSet cS) {
        int inputIndex = 0;
        if (input >= 65 && input <= 90) {
            inputIndex = input - 65;
        } else if (input >= 97 && input <= 122) {
            inputIndex = input - 97;
        } else {
            System.out.println("Invalid Input.");
        }

        Product p = Products.get(inputIndex); // getting the index of the character to match the ASCII
        double temp = cS.getTotal();
        double temp2 = cS.getTotal();
            if (p.getQuantity() >= 1) {
                //check for sufficient amount
                if (p.getPrice() <= cS.getTemp()) {
                    temp = temp - p.getPrice();
                    myList.add(temp2 - temp);
                    sum += (temp2 - temp);
                    p.decrement();
                    cS.emptyCoins();
                    if (p.getQuantity() == 0) {
                        Products.remove(p);
                    }
                    System.out.println("Purchased: " + p.getName() + " @ $" + p.getPrice());
                    System.out.println("Change: $" + temp);
                    // need to have an arraylist of some sort to put the total amount of money put into the vending machine
                } else {
                    System.out.println("Insufficient money");
                }
            } else {
                System.out.println("Insufficient quantity");
            }

    }

    /**
     * The Main Program
     * @param VM
     */
    public void program(VendingMachine VM) {
        char input;
        do {
            System.out.println("S)how products I)nsert coin B)uy A)dd product R)emove coins Q)uit");
            input = in.next().charAt(0);

            switch (input) {
                case 'S':
                case 's':
                    if (VM.Products.size() > 0) {
                        displayProducts(VM.Products);
                    } else {
                        System.out.println("No Products!");
                    }
                    break;

                case 'I':
                case 'i':
                    c = inputCoin();
                    VM.myCoinSet.addCoin(c);
                    break;

                case 'B':
                case 'b':
                    if (VM.Products.size() > 0) { // if there are products in the Vending Machine, you will be able to buy it
                        displayProductsMenu(VM.Products);
                        char input2 = in.next().charAt(0);
                        purchaseProduct(VM.Products, input2, VM.myCoinSet);
                        System.out.println();
                    } else {
                        System.out.println("No Products!"); // can't buy products with no products in the Vending Machine
                    }
                    break;

                case 'A':
                case 'a':
                    Product p = inputProduct(); // calling the method for user input and setting it to the object
                    VM.addProduct(p); // adding the product into the Vending Machine from the Vending Machine Class
                    break;

                case 'R':
                case 'r':
                    System.out.println("Removed $" + sum);
                    break;

                case 'Q':
                case 'q':
                    break;

                default:
                    break;

            }
        }
        while (input != 'Q' && input != 'q');
    }
}
