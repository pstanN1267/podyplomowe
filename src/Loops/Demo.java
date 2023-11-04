package Loops;

public class Demo {
    public static void main(String[] args) { // początek bloku

        {
            int x = 13;
            {
                int y = 10;
                y += x;
                System.out.println(y);
            }
        }
        {
            int a = 0;
            if (a > 0) {
                System.out.println(a + " jest większe od zera");
            } else if (a < 0) {
                System.out.println(a + " jest mniejsze od zera");
            } else {
                System.out.println("a jest równe zeru");
            }
        }




    } // koniec bloku
}
