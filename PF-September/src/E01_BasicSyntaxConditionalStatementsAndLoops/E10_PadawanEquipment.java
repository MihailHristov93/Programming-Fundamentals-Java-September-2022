package E01_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class E10_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightSabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());

        double priceForLightSabers = Math.ceil((countOfStudents + (countOfStudents * 0.1))) * priceOfLightSabers;
        double priceForRobes = countOfStudents * priceOfRobes;
        double priceForBelts = (countOfStudents - countOfStudents / 6) * priceOfBelts;

//        if (countOfStudents / 6 >= 1) {
//            int beltsDiscount = countOfStudents / 6;
//            priceForBelts = priceForBelts - (beltsDiscount * priceOfBelts);
//        }

        double totalPrice = priceForLightSabers + priceForRobes + priceForBelts;

        if (totalPrice <= amountOfMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.%n", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.%n", totalPrice - amountOfMoney);
        }
    }
}
