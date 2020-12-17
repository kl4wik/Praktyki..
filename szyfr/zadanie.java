package szyfr;
import java.util.Scanner;
public class Main {

         //funkcja kodujaca tekst do szyfru cezara
    public static String code(String szyfrowanie

        char[] tab = szyfrowanie.CharArray();

              //petla ktora przechodzi przez wszystkie elementy tablicy char
        for (int i = 0; i < szyfrowanie.length() ; i++) {

                 //argument pokazujacy wielkie i male litery
            if ((tab[i] >= 65 && tab[i] <= 90) || (tab[i] >= 97 && tab[i] <= 122)) {

                     //wielkie y zamienia sie na wielkie
                if (tab[i] == 'Y') {
                    tab[i] = 'B';
                }
                     //wielkie x zamienia sie na wielkie a
                else if (tab[i] == 'X') {
                    tab[i] = 'A';
                }
                       //wielkie z zamienia sie na wielkie c
                else if (tab[i] == 'Z') {
                    tab[i] = 'C';
                }
                      //małe x zamienia się na małe a
                else if (tab[i] == 'x') {
                    tab[i] = 'a';
                }
                     //male y zamienia się na male b
                else if (tab[i] == 'y') {
                    tab[i] = 'b';
                }
                      //male z zamienia się na male c
                else if (tab[i] == 'z') {
                    tab[i] = 'c';
                }
                     //kazda litera inna od powyzszych "przechodzi o 3 dalej
                else {
                    tab[i] += 3;
                }
            }
        }
              //tablica char konwertuje sie na stringa
        String result = String.valueOf(tab);
        return result;
    }

    public static void main(String[] args) {

               //informacja o tym do czego sluzy program
        System.out.println("program szyfrujacy tekst");

             //prosba o wpisanie tekstu ktory mamy zaszyfrowac
        System.out.println("wpisz swoj tekst do szyfrowania");

              //ustawienie skanera ktory czyta nasze dane
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();

        String result = code(txt);

             //tutaj otrzymujemy zaszyfrowany tekst
        System.out.println("oto twoj zaszyfrowany tekst: " + result);

    }
}