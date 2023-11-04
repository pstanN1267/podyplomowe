package Operators;

public class WyrażenieLogiczne {
    public static void main(String[] args) {

        int liczba = 35;

        boolean result = (liczba % 5 )== 0 && (liczba % 7) == 0;
        System.out.println(liczba + " jest podzielna przez 5 i 7 bez reszty: " + result);

    }
}
