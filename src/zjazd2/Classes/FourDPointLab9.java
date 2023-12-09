package zjazd2.Classes;

import java.awt.*;

public class FourDPointLab9 extends Point {

    int z;
    int t;

    public static void main(String[] args) {
        FourDPointLab9 fourDPoint = FourDPointLab9.create(1, 2, 3, 4);
        fourDPoint.show(); // dostęp do metody nie statycznej poprzed obiekt
    }

    static FourDPointLab9 create(int x, int y, int z, int t) {

        FourDPointLab9 fourDPoint = new FourDPointLab9();
        fourDPoint.x = x;
        fourDPoint.y = y;
        fourDPoint.z = z;
        fourDPoint.t = t;

        return fourDPoint;

    }

    void show() {
        System.out.println("x wynosi: " + this.x);
        System.out.println("y wynosi: " + this.y);
        System.out.println("z wynosi: " + this.z);
        System.out.println("t wynosi: " + this.t);
    }


}
