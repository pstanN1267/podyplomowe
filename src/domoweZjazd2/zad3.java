package domoweZjazd2;

public class zad3 {

    public static void main(String[] args) {

        long summ = 0;
        for (int i = 0; i <= 64; i++) {
            summ += (long) Math.pow(2, i);
        }

        System.out.println("Ilość ziaren na wszystkich polach szachownicy: " + summ);
    }
}
