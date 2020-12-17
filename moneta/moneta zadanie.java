package moneta;

import java.security.SecureRandom;

public class Moneta {
    // inicjujemy zmienne
    private final int liczbaStron;
    private final SecureRandom random;

    // Konstruktor obiektu Moneta; nie przyjmuje żadnych wartości ponieważ w tym przypadku nie jest to wymagane
    public Moneta() {
        // Ustawienie zmiennej liczbaStron dla każdego nowego obiektu na 2
        liczbaStron = 2;
        // Przypisanie zmiennej random obiektu SecureRandom, używanego później do losowania liczb z określonego zakresu
        random = new SecureRandom();
    }

    public String rzut() {
        // Losowanie liczby 0 lub 1
        int i = random.nextInt(liczbaStron);
        switch(i) {
            // W przypadku gdy wylosowana liczba wynosi 0, zwróć string 'Orzeł'
            case 0:
                return "Orzeł";
            // W przypadku gdy wylosowana liczba wynosi 0, zwróc string 'Reszka'
            case 1:
                return "Reszka";
            // Zwrócenie pustego stringa jeżeli żaden warunek nie zostanie spełniony (niemożliwe w tym przypadku)
            default:
                return "";
        }
    }
}