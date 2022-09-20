package L01_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class L10_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int result = 0;

        for (int i = 1; i <= 10 ; i++) {
            result = n * i;
            System.out.printf("%d X %d = %d%n", n, i, result);
        }
    }
}

//package L01_BasicSyntaxConditionalStatementsAndLoops;
//
//        import java.util.Scanner;
//
//public class L10_MultiplicationTable {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = Integer.parseInt(scanner.nextLine());
//
//        int times = 1;
//        while (times <= 10) {
//            int product = n * times;
//
//            System.out.printf("%d X %d = %d%n", n, times, product);
//
//            times++;
//        }
//    }
//}
