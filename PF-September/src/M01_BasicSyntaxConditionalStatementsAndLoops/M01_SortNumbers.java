package M01_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class M01_SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        if (n1 < n2) {
            int o = n1;
            n1 = n2;
            n2 = o;
        }
        if (n2 < n3) {
            int o = n3;
            n3 = n2;
            n2 = o;
        }
        if (n1 < n2) {
            int o = n1;
            n1 = n2;
            n2 = o;
        }

        System.out.printf("%d%n%d%n%d%n", n1, n2, n3);
    }
}

