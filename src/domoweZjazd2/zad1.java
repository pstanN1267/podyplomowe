package domoweZjazd2;

import java.util.Arrays;
import java.util.Scanner;

public class zad1 {
    //    Napisz program, który:
//    stworzy tablicę liczb typu int o rozmiarze, który będziemy podawać jako argument przy starcie programu,
//    wypełni tablicę kolejno liczbami od 1 do n, gdzie n to rozmiar tablicy,
//    wyświetli zawartość tablicy,
//    dokona konwersji tablicy tak, aby elementy ułożyły się odwrotnie (ciąg malejący: n, n-1, n-2… 1),
//    wyświetli zawartyość przekonwertowanej tablicy,
//    fragmenty programu odpowiadjące za konkretne zadania zostaną wyodrębnione jako oddzielne metody.

//    ad 1 metoda zwracająca tablicę z argumentem ilosci wyrazów tablicy

    public static int[] arrayMaker (int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));

        return array;
    }

    public static void reverseArray(int n) {
      int [] arrayToReverse = arrayMaker(n);
        int [] reverseArray =new int[arrayToReverse.length];

        for (int i = 0; i < reverseArray.length; i++) {
            reverseArray[arrayMaker(n).length - i] = arrayMaker(n)[i];
//            System.out.println((arrayMaker(n).length - i) + " = " + arrayMaker(n)[i] );
        }
        System.out.println(Arrays.toString(reverseArray));
//        return reverseArray;
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość tablicy: ");
        int n = scanner.nextInt();
        arrayMaker(n);
//        reverseArray(n);
    }
}
