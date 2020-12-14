package 5;

import java.util.Scanner;

public class Main {

    // Oblicza deltę dla a, b i c
    public static Double delta(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    // Oblicza miejsca zerowe dla delty, a i b
    public static void miejscaZerowe(double delta, double a, double b) {
        if(delta == 0) {
            double x0 = -b / (2 * a);
            System.out.println("x₀ wynosi: " + x0);
            return;
        }
        else if(delta > 0) {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("x₁ wynosi: " + x1);
            System.out.println("x₀ wynosi: " + x2);
            return;
        }
        System.out.println("Brak rozwiązań.");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj a: ");
        double a = scanner.nextDouble();

        System.out.print("Podaj b: ");
        double b = scanner.nextDouble();

        System.out.print("Podaj c: ");
        double c = scanner.nextDouble();

        // Liczenie delty
        double delta = delta(a, b, c);
        System.out.println("Delta wynosi: " + delta);

        // Liczenie miejsc zerowych
        miejscaZerowe(delta, a, b);
    }
}
