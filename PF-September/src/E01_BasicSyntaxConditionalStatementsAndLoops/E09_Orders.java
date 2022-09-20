package E01_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class E09_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfOrders = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.0;

        for (int i = 1; i <= countOfOrders ; i++) {
            double pricePerOrders = 0.0;
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());

            pricePerOrders = days * capsuleCount * pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n", pricePerOrders);

            totalPrice += pricePerOrders;
        }
        System.out.printf("Total: $%.2f%n", totalPrice);
    }
}
