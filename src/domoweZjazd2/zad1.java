package domoweZjazd2;

import java.util.Arrays;
import java.util.Scanner;

public class zad1 {


    public static int[] arrayMaker(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }

        System.out.println("Array: " + Arrays.toString(array));
        return array;
    }

    public static void reverseArray(int[] array, int n) {
        int[] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[n - i - 1];
        }

        System.out.println("Reversed array: " + Arrays.toString(reversedArray));

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość tablicy: ");
        int n = scanner.nextInt();
        arrayMaker(n);

        reverseArray(arrayMaker(n), n);
    }
}
