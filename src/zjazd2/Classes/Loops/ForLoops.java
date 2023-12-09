package zjazd2.Classes.Loops;

import java.math.BigInteger;

public class ForLoops {

    public static void main(String[] args) {
        // wszystkei cyfry
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        // obliczanie silni

        int number = 17; // 5! = 1 * 2 * 3 * 4 * 5

        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));

        }

        System.out.printf("%d! = %s%n", number, factorial);

        // wartość poszczególnych bitów w bajcie
//       128    64  32  16  8   4   2   1
//        0     0   0   0   0   0   0   0

        for(int i = 1, sum = 1;i <= 128; i *= 2, sum += i){ // deklarowanie 2 zmiennych w pętli for
            System.out.printf("i = %d, sum = %d%n", i, sum); // % - typ danych
        }

    }
}
