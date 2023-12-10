package Kolokwium;

public class Zjazd3 {

    //              Piotr Stanik

//    Napisz program, który oblicza iloczyn trzech, podanych jako argumenty programu, liczb.
//
//    Przykład:
//    Multiply 1 2 3
//            6

    int a;
    int b;
    int c;

    public Zjazd3(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        Zjazd3 mult = new Zjazd3(3,5,7);
        int mnozenie = mult.multiply(3, 5, 7);
//        System.out.println("Pomnożone liczby dają wynik: " + );
    }
}
