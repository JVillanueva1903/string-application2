public class Receipt {
    public static void main(String[] args) {
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {

        // 1. Item name and price
        String itemName = "apples";
        double itemPrice = 7.10;

        // 2. Quantity
        int quantity = 3;

        // 3. Build and print the message
        System.out.println("You bought " + quantity + " " + itemName + " for $" + itemPrice);
    }