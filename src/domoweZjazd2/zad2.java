package domoweZjazd2;

import java.util.Random;
import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {
        System.out.println("Podaj liczbę wierszy w choince:");
        Scanner scanner = new Scanner(System.in);


        int wiersze = scanner.nextInt();
        scanner.nextLine();

        if (wiersze < 1) {
            wiersze = 18;
        }
        char[] choinka = {'+', '.', '*', '~', '^', 'o'};



        for (int i = 1; i < wiersze; i++) {
            for (int j = wiersze - i; j > 1; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                int  index = new Random().nextInt(choinka.length);
                System.out.print(choinka[index] + " ");
            }
            System.out.println();
        }

//
//        int row = scanner.nextInt();
//        scanner.nextLine();
//
//        if (row < 1) {
//            row = 18;
//        }
//        char[] choinka = {'+', '.', '*', '~', '^', 'o'};
//
//
//
//        int space = row - 1;
//        for (int j = 1; j <= row; j++) {
//            for (int i = 1; i <= space; i++) {
//                System.out.print(" ");
//            }
//            space--;
//            for (int i = 1; i <= 2 * j - 1; i++) {
//                int index = new Random().nextInt(choinka.length);
//                System.out.print(choinka[index]);
//            }
//            System.out.println();
//        }
    }
}

