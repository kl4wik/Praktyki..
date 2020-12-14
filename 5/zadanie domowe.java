package 5;

import java.util.Scanner;

public class ZadanieDomowe {
    // Oblicza miejsce zerowe funkcji liniowej
    public static double mz(double a, double b) {
        return -b/a;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Pobieranie zmiennych od uzytkownika
        System.out.print("Podaj a: ");
        double a = s.nextDouble();
        System.out.print("Podaj b: ");
        double b = s.nextDouble();
        // Liczenie miejsca zerowego dla funkcji liniowej i wyświetlenie wyniku
        System.out.println("Miejsce zerowe funkcji linowej: " + mz(a, b));
    }
}