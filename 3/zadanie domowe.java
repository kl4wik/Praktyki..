package 4;

import java.util.HashSet;
import java.util.Set;


public class ZadanieDomowe {

    // Zawraca liczby parzyste z podanej tablicy
    public static Set<Integer> wywalNieparzyste(int[] tablica) {
        Set<Integer> liczbyParzyste = new HashSet<Integer>();
        for (int i : tablica) {
            if (i % 2 == 0) {
                liczbyParzyste.add(i);
            }
        }
        return liczbyParzyste;
    }

    // Zwraca sumę liczb w tablicy
    public static int sumujTablice(int[] tablica) {
        // Dodanie do siebie wszystkich liczb w tablicy
        int suma = 0;
        for(int j : tablica) {
            suma = suma + j;
        }
        return suma;
    }

    public static void main(String[] args) {
        // Testowanie funkcji
        int[] t = {1, 4, 6, 2, 7, 12, 36, 9};
        System.out.println(wywalNieparzyste(t));
        System.out.println(sumujTablice(t));
    }
}