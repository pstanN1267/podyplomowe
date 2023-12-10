package zjazd2.Loops;

public class MatrixLoop {
    public static void main(String[] args) {

        int n = 12;
        System.out.println("n = " + n + "   matrix");
        System.out.println("-----------------");
        for (int i = 1; i < n + 1; i++) { // najpierw zewnętrzna pętla się wykonuje pełną ilość razy, następnie wewnetrzna
            System.out.printf ("%3s",i + " ");
            for (int j = 1; j < n ; j++) {
                System.out.printf ("%3s", j + i + " ");
            }
            System.out.println();
        }

//        for (int i = 0; i < n; i++) { // najpierw zewnętrzna pętla się wykonuje pełną ilość razy, następnie wewnetrzna
//            for (int j = 1; j <= n ; j++) {
//                System.out.printf ("%3s", j + i + " ");
//            }
//            System.out.println();
//        }
    }
}
