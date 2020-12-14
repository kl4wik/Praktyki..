package 4;

public class Main {

    // Liczy funkcję kwadratową dla x
    public static float funkcjaKwadratowa(float x) {
        return 2 * x * x - 3 * x + 4;
    }

    // Wypluwa tablicę int
    public static void printTable(int[] arr) {
        for(int i : arr) {
            System.out.println(arr[i]);
        }
    }

    // Funkcja rekurencyjna
    public static int rekur(int x) {
        if(x > 0) {
            return rekur(x - 1);
        }
        return x;
    }

    // Ciąg jakiś tam
    public static int fibb(int x) {
        if(x == 0) {
            return 0;
        }
        if(x == 1) {
            return 1;
        }
        if(x > 1) {
            return fibb(x - 1) + fibb(x - 2);
        }
        return 0;
    }

    public static void main(String[] args) {
        // Testowanie funkcji funkcjaKwadratowa(int x) z argumentem 5
        System.out.println(funkcjaKwadratowa(5));
        // Testowanie funkcji printTable()
        int[] arr = {3, 17, 26, 8, 10, 9, 6, 2, 4, 12, 7};
        printTable(arr);
        // Testowanie funkcji rekurencyjnej rekur(int x)
        System.out.println(rekur(65));
        // Testowanie funkcji rekurencyjnej fibb(int x)
        System.out.println(fibb(9));
    }
}
