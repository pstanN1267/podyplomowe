package zjazd3.Construktor;

import java.awt.*;

public class Box {

    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

    public Box() {
    }

    public Box(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

    }

    public Box(Point topLeft, Point bottomRight) {
        this.x1 = topLeft.x;
        this.y1 = topLeft.y;
        this.x2 = bottomRight.x;
        this.y2 = bottomRight.y;
    }

    public Box(Point topLeft, int w, int h) {
        this.x1 = topLeft.x;
        this.y1 = topLeft.y;
        this.x2 = x1 + w;
        this.y2 = y1 + h;
    }

    void printBox() {
        System.out.print("Box: < " + this.x1 + ", " + this.y1);
        System.out.print("; " + this.x2 +", " +  this.y2 + ">");
    }

    public static void main(String[] args) {
        System.out.println("\n \n Tworzymy box ze współrzędnymi (25,25) i (50, 50) ");
      Box  rect = new Box(25, 25, 50, 50);
        rect.printBox();

        System.out.println("\n \n Tworzymy box z punktami (10, 10) i (20, 20) ");
        Point topleft = new Point(10, 10);
        Point bottomLeft = new Point(20, 20);
        rect = new Box(topleft, bottomLeft);
        rect.printBox();

        System.out.println("\n \n Tworzymy box ze punktem (7,9) i szerokości 50 i wysokości 20     ");
        rect = new Box(new Point(7,9), 50, 20);
        rect.printBox();
    }
}
