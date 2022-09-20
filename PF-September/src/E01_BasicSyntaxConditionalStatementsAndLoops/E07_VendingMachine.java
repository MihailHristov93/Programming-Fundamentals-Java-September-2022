package E01_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class E07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double money = 0.0;
        double sumOfMoney = 0.0;

        while (!input.equals("Start")) {
            money = Double.parseDouble(input);

            if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1.0 || money == 2.0) {
                sumOfMoney += money;
            } else {
                System.out.printf("Cannot accept %.2f%n", money);
            }

            input = scanner.nextLine();
        }

        double priceOfProducts = 0.0;
        input = scanner.nextLine();

        while (!input.equals("End")) {

            if (input.equals("Nuts")) {
                double nuts = 2.0;
                priceOfProducts += nuts;
                if (priceOfProducts > sumOfMoney) {
                    priceOfProducts -= nuts;
                    System.out.println("Sorry, not enough money");
                } else {
                    System.out.printf("Purchased %s%n", input);
                }
            } else if (input.equals("Water")) {
                double water = 0.7;
                priceOfProducts += water;
                if (priceOfProducts > sumOfMoney) {
                    priceOfProducts -= water;
                    System.out.println("Sorry, not enough money");
                } else {
                    System.out.printf("Purchased %s%n", input);
                }
            } else if (input.equals("Crisps")) {
                double crisps = 1.5;
                priceOfProducts += crisps;
                if (priceOfProducts > sumOfMoney) {
                    priceOfProducts -= crisps;
                    System.out.println("Sorry, not enough money");
                } else {
                    System.out.printf("Purchased %s%n", input);
                }
            } else if (input.equals("Soda")) {
                double soda = 0.8;
                priceOfProducts += soda;
                if (priceOfProducts > sumOfMoney) {
                    priceOfProducts -= soda;
                    System.out.println("Sorry, not enough money");
                } else {
                    System.out.printf("Purchased %s%n", input);
                }
            } else if (input.equals("Coke")) {
                double coke = 1.0;
                priceOfProducts += coke;
                if (priceOfProducts > sumOfMoney) {
                    priceOfProducts -= coke;
                    System.out.println("Sorry, not enough money");
                } else {
                    System.out.printf("Purchased %s%n", input);
                }
            } else {
                System.out.println("Invalid product");
            }

            input = scanner.nextLine();
        }

        double leftMoney = sumOfMoney - priceOfProducts;
        System.out.printf("Change: %.2f%n", leftMoney);
    }
}

