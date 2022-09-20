package L01_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class L11_MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        int result = 0;

        do {
            result = n * times;
            System.out.printf("%d X %d = %d%n", n, times, result);
            times++;
        } while (times <= 10);
    }
}
