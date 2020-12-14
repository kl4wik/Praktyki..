package 7;

public class Main {

    public static int roll(int amountOfFaces) {
        return new Dice(amountOfFaces).draw();
    }

    public static void main(String[] args) {
        // Rzut kośćmi i wyświetlenie wyniku
        System.out.println("Rzut kością K8: " + roll(8));
        System.out.println("Rzut kością K20: " + roll(20));
        System.out.println("Rzut kością K100: " + roll(100));
    }
}