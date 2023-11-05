package Loops;

public class MatrixLoop {
    public static void main(String[] args) {

        int n = 10;
        System.out.println("n = " + n + "   matrix");
        System.out.println("-----------------");
        for (int i = 1; i < n + 1; i++) { // najpierw zewnętrzna pętla się wykonuje pełną ilość razy, następnie wewnetrzna
            System.out.print(" " + i + "  ");

            for (int j = 1; j < n ; j++) {
                System.out.printf ("%4s", j + i + " ");
            }
            System.out.println();
        }
    }
}
