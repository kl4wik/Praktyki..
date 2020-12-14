package 2;

public class Main {
    public static void main(String[] args) {
        // Zadanie: Posortuj tablicę rosnąco
        int[] tab = {4, 2, 5, 76, 8, 2, 14, 234, 346, 32, 1};
        // int[] num = new int[tab.length];
        int[] wynik = new int[tab.length];
        // Pętla przechodząca przez tablicę wyników
        for(int j = 0; j < wynik.length; j++) {
            int temp = tab[0];
            int pole = 0;
            // Pętla przechodząca przez tablicę liczb
            for (int i = 0; i < tab.length; i++) {
                if (temp > tab[i]) {
                    // Nadpisanie
                    temp = tab[i];
                    pole = i;
                }
            }
            wynik[j] = temp;
            tab[pole] = Integer.MAX_VALUE;
            System.out.print(wynik[j]);
        }
        // Losowa tablica int i dodanie i wyswietlenie



    }

}
