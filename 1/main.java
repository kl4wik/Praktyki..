package 1;

public class Main {
    public static void main(String[] args) {
        int ii = 30;
        long l = 20;
        float f = 1.0F;
        double d = 30.3;
        boolean b = true;

        char c = 's';
        String s = "Hello World";
        String ss = new String("Hello World");

        char[] charTable = new char[5];
        charTable[0] = 'H';
        charTable[1] = 'e';
        charTable[2] = 'l';
        charTable[3] = 'l';
        charTable[4] = 'o';

        int[] intTable = {6, 344, 64, 23, 853, 341};

        // Pętla for - przykład 1
        System.out.println("Pętla for - przykład 1:");
        for(int i = 0; i < 30; i++) {
            if (ii > 0) {
                ii = -1;
            } else {
                ii = 30;
            }
            System.out.println(ii);
        }

        // Pętla for - przykład 2
        System.out.println("Pętla for - przykład 2:");
        for(int i = 0; i < charTable.length; i++) {
            System.out.println(charTable[i]);
        }

        // Pętla while - przykład 1
        System.out.println("Pętla while - przykład 1:");
        int iteration = 0;
        while(iteration > 15) {
            System.out.println(iteration);
            iteration += 1;
        }

        // Pętla while - przykład 2
        System.out.println("Pętla while - przykład 2:");
        boolean stopLoop = true;
        do {
            stopLoop = false;
            System.out.println("Wykonanie pętli");
        } while(stopLoop);

        // Pokazuje znak ASCII dla litery f
        System.out.println((int) 'f');

        // Operator modulo - reszta z dzielenia;
        System.out.println("Operator modulo:");
        int x = 40;
        System.out.println(x % 3);


    }
}