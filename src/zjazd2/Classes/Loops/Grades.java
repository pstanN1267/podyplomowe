package zjazd2.Classes.Loops;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        char grade;


        /*
         * Instrukcja warunkowa obsługuje:
         * char and Character
         * byte and Byte(obiektowe)
         * short and Shrt
         * int and Integer
         * String
         * enum
         * */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz otrzymany stopień:");
        char ocena = scanner.next().charAt(0);
        switch (ocena) {
            case 'A':
                System.out.println("Wspaniale");
                break;
            case 'B':
                System.out.println("Dobrze");
                break;
            case 'C':
                System.out.println("Mogło być lepiej");
                break;
            default:
                System.out.println("Pomyśl nad innym sposobem");
        }
    }
}
