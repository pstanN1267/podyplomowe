package Loops;

public class Demo {
    public static void main(String[] args) { // początek bloku

/*
//        {
//            int x = 13;
//            {
//                int y = 10;
//                y += x;
//                System.out.println(y);
//            }
//        }
//        {
//            int a = 0;
//            if (a > 0) {
//                System.out.println(a + " jest większe od zera");
//            } else if (a < 0) {
//                System.out.println(a + " jest mniejsze od zera");
//            } else {
//                System.out.println("a jest równe zeru");
//            }
//        }
        int myScore = 34;
        int yourScore = 44;
        int ourBestScore = myScore > yourScore ? myScore : yourScore;
        System.out.println("Najlepszy wynik to: " + ourBestScore);
        if (myScore > yourScore) {
            System.out.println("Najlepszy wynik to: " + myScore);
        } else {
            System.out.println("Najlepszy wynik to: " + yourScore);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        int i = 101;
        do{
            System.out.println("i = " + i);

            i++;
        }while (i <= 100);


*/

//        wypisz cyfry parzyste

//        for (int i = 1; i < 10; i++) {
//            if (i % 2 == 0){
//                break;
//            }
//            System.out.print(i);
//            System.out.print(" ");
//        }

        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 50  ; j++) {
                System.out.println(i + j);
                break;
            }
        }


    } // koniec bloku
}
