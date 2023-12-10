package zjazd2.objects;

import java.awt.*;
import java.util.Locale;

public class Demo {
    public static void main(String[] args) {
//        Object object = new Object();
        String name = new String("Ala");
        Point point = new Point(0, 0);

        System.out.println(Math.max(324234, 123));

        String s1, s2;
        s1 = String.valueOf(1254); // zmiana liczby na stringa
        s2 = s1.valueOf(1254);

        System.out.println(s1);
        System.out.println(s2);

        int accountBalance = 15005;

        System.out.println(accountBalance);
        System.out.printf("Saldo: %,d zł%n", accountBalance);

//        s - strings
//        d - decimal integers
//        f - floating point
//        t - date/time
//        n - new line
//        bB - boolean

        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf(new Locale("us"), "%.20f%n", pi);


        //        byte a = 7;
//        short b;
//        int c;
//
//        c = a;// konwersja niejawna
//        b = (short) c; // konwersja jawna - rzutowanie (casting)
//

        int a = 5;
        double b = 13.5;
//        double c = b/(double)a; // konwersja jawna - rzutowanie

        int c = (int) b / a; // rzutowanie - utrata danych na życzenie (double na int)


        Float f1 = 12.5F;
        Float f2 = 27.2F;

        System.out.println("Mniejsza z liczb: " + Math.min(f1, f2));

        String str1 = "Jakiś napis";
        System.out.println(str1.getClass().getName()); // pełna nazwa klasy
        System.out.println(str1.getClass().getSimpleName());

        boolean check1 = "Teksas" instanceof String; // sprawdzenie czy dany napis jest instacją(obiektem) danej klasy)
        System.out.println(check1);

        Object object = new Object();

        boolean check2 = object instanceof String;
        System.out.println(check2);

        boolean check3 = "Ala ma kota" instanceof Object;
        System.out.println(check3); // Klasa dziedziczy po obiekcie
    }
}
