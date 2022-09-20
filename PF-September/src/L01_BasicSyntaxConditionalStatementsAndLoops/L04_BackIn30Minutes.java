package L01_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class L04_BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputHours = Integer.parseInt(scanner.nextLine());
        int inputMinutes = Integer.parseInt(scanner.nextLine());

        int allMinutes = (inputHours * 60) + inputMinutes + 30;
        int hours = allMinutes / 60;
        int minutes = allMinutes % 60;

        if (hours > 23) {
            hours = 0;
        }
        System.out.printf("%d:%02d", hours, minutes);
    }
}
