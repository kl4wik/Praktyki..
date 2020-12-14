
package cwiczenia2;

public class ZadanieDomowe {
    // Dodanie wszystkich liczb z tablicy do siebie i wyświetlenie wyniku
    public static void main(String[] args) {
        // Utworzenie tablicy z losowymi liczbami od 1 do 100
        int[] tab = new int[10];
        System.out.print("Tablica składa się z liczb: ");
        for(int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * 100);
            System.out.print(i != tab.length - 1 ? tab[i] + ", " : tab[i]);
        }
        // Dodanie do siebie wszystkich liczb w tablicy
        int n = 0;
        for(int j : tab) {
            n = n + j;
        }
        // Wyświetlenie wyniku
        System.out.println("\nSuma tych liczb to: " + n);
    }
}