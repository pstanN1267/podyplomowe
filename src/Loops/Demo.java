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

        int a =7 ;
        if (a > 10 ){
            System.out.println(a + " jest większe od 10");
        }


    } // koniec bloku
}
