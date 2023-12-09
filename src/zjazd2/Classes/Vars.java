package zjazd2.Classes;

public class Vars {

    int i; // zmienna egzemplarza - pole klasy
    static int j = 2; // zmienna klasowa - pole statyczne, gdy ją zmienimy w jednym miejscu to zmieni  się we wszystkich


    public int change() {
        int k = 7;// zmienna lokalna

        return i + (k * j);
    }


    public static void main(String[] args) {
        int i = 77;

        Vars v1 = new Vars(); // zmienna lokalna
        v1.i = 9;

        System.out.println("Wyświetlamy zmienna egzemplarza dla v1: " + v1.i);
//        System.out.println("Wyświetlamy zmienna klasową i: " + i);

        Vars v2 = new Vars();
        v2.i = 5;
        System.out.println("Wyświetlamy zmienna egzemplarza dla v2: " + v2.i);

        System.out.println("Wyświetlamy zmienną klasową (statyczna): " + Vars.j);

        System.out.println("Wyświetlam zmienną lokalną: " + i);
    }
}
