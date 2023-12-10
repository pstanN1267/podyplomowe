package zjazd2.Loops;

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

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 50; j++) {
//                System.out.println(i + j);
//            }
//        }

        //i for rows and j for columns
//row denotes the number of rows you want to print
        int i, j, row = 6;
//Outer loop work for rows
        for (i = 0; i < row; i++) {
//inner loop work for space
            for (j = row - i; j > 1; j--) {
//prints space between two stars
                System.out.print(" ");
            }
//inner loop for columns
            for (j = 0; j <= i; j++) {
//prints star
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();

        } // koniec bloku


    }
}

