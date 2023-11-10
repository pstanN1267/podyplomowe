package Loops;

public class MatrixLoopLab7 {
    public static void main(String[] args) {

        int n =30;
        System.out.println("n = " + n + "   matrix");
        System.out.println("-----------------");
        for (int i = 1; i < n + 1; i++) {
            System.out.printf ("%3s",i + " ");
            for (int j = 1; j < n ; j++) {
                System.out.printf ("%3s", j + i + " ");
            }
            System.out.println();
        }
    }
}
