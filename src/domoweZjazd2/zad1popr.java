package domoweZjazd2;

import java.util.Arrays;
import java.util.Scanner;

public class zad1popr {


    public static int[] arrayMaker(int n) {
        int[] array = new int[n];

        if (n < 1) {
            System.out.println("Invalid array lenght");
            return null;
        }
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }

        return array;
    }

    public static void reverseArray(int[] array, int n) {
        if (n < 1) {
            System.out.println("Invalid value");
        } else {
            int[] reversedArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                reversedArray[i] = array[n - i - 1];
            }
            System.out.println("Base array: " + Arrays.toString(array));
            System.out.println("Reversed array: " + Arrays.toString(reversedArray));
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość tablicy: ");
        int n = scanner.nextInt();
        arrayMaker(n);


        reverseArray(arrayMaker(n), n);
    }
}
