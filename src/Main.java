import factorial.FactorialMain;
import fibonacci.FibonacciMain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CHOOSE FUNCTION:");
        System.out.println("1. FACTORIAL NUMBER");
        System.out.println("2. FIBONACCI SEQUENCE");

        int method = scanner.nextInt();

        System.out.println("CHOOSE NUMBER OF ELEMENT");

        int n = scanner.nextInt();

        switch (method) {
            case 1:
                try {
                    new FactorialMain().calculate(n);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 2:
                try {
                    new FibonacciMain().calculate(n);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("WRONG METHOD NUMBER!");
                break;
        }
    }
}
