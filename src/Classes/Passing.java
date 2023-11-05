package Classes;

import java.awt.*;

public class Passing {

    public static void main(String[] args) {
        int i = 10;
        System.out.println("i przed zmianą:" + i);
        Passing pass = new Passing();
        Passing.changeIt(i);
        System.out.println("i po zmianie:" + i);

        Point p = new Point(1, 1);

        System.out.println("x, y przed zmianą:" + p);
        changeIt(p);
        System.out.println("x, y po zmianie:" + p);
    }

    static void changeIt(int i) {
        System.out.println("Zmieniam i");
        i++;
    }

    static void changeIt(Point p) {
//        p = new Point(4, 4);
        System.out.println("Zmieniam to na co wskazuje p");
        p.x++;
        p.y++;

    }
}
