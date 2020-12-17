package moneta;

public class Main {
    public static void main(String[] args) {
        // Stworzenie nowego obiektu
        Moneta moneta = new Moneta();
        // wyświetlamy wynik rzutu () dla wcześniej stworzonego obiektu moneta; zwraca string 'orzeł' lub 'reszka
        System.out.println(moneta.rzut());
    }
}