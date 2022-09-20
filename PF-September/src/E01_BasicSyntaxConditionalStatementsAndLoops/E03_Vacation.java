package E01_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class E03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();

        double price = 0;

        if (dayOfTheWeek.equals("Friday")) {
            if (typeOfGroup.equals("Students")) {
                if (numberOfPeople >= 30) {
                    price = 8.45 * numberOfPeople * 0.85;
                } else {
                    price = 8.45 * numberOfPeople;
                }
            } else if (typeOfGroup.equals("Business")) {
                if (numberOfPeople >= 100) {
                    price = 10.90 * (numberOfPeople - 10);
                } else {
                    price = 10.90 * numberOfPeople;
                }
            } else if (typeOfGroup.equals("Regular")) {
                if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                    price = 15.00 * numberOfPeople * 0.95;
                } else {
                    price = 15.00 * numberOfPeople;
                }
            }
        } else if (dayOfTheWeek.equals("Saturday")) {
            if (typeOfGroup.equals("Students")) {
                if (numberOfPeople >= 30) {
                    price = 9.80 * numberOfPeople * 0.85;
                } else {
                    price = 9.80 * numberOfPeople;
                }
            } else if (typeOfGroup.equals("Business")) {
                if (numberOfPeople >= 100) {
                    price = 15.60 * (numberOfPeople - 10);
                } else {
                    price = 15.60 * numberOfPeople;
                }
            } else if (typeOfGroup.equals("Regular")) {
                if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                    price = 20.00 * numberOfPeople * 0.95;
                } else {
                    price = 20.00 * numberOfPeople;
                }
            }
        } else if (dayOfTheWeek.equals("Sunday")) {
            if (typeOfGroup.equals("Students")) {
                if (numberOfPeople >= 30) {
                    price = 10.46 * numberOfPeople * 0.85;
                } else {
                    price = 10.46 * numberOfPeople;
                }
            } else if (typeOfGroup.equals("Business")) {
                if (numberOfPeople >= 100) {
                    price = 16.00 * (numberOfPeople - 10);
                } else {
                    price = 16.00 * numberOfPeople;
                }
            } else if (typeOfGroup.equals("Regular")) {
                if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                    price = 22.50 * numberOfPeople * 0.95;
                } else {
                    price = 22.50 * numberOfPeople;
                }
            }
        }
        System.out.printf("Total price: %.2f", price);
    }
}
