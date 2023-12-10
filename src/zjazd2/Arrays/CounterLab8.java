package zjazd2.Arrays;

public class CounterLab8 {
    public static void main(String[] args) {

        int[] cyfry = {1, 2, 3, 4, 7, 8, 0, 9, 5, 2, 5, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6};

        int[] counter = new int[cyfry.length];

        for (int i = 0; i < cyfry.length; i++) {

            switch (cyfry[i]) {

                case 0:
                    counter[0] += 1;
                    break;
                case 1:
                    counter[1] += 1;
                    break;
                case 2:
                    counter[2] += 1;
                    break;
                case 3:
                    counter[3] += 1;
                    break;
                case 4:
                    counter[4] += 1;
                    break;
                case 5:
                    counter[5] += 1;
                    break;
                case 6:
                    counter[6] += 1;
                    break;
                case 7:
                    counter[7] += 1;
                    break;
                case 8:
                    counter[8] += 1;
                    break;
                case 9:
                    counter[9] += 1;
                    break;

            }
        }

        int max = counter[0];
        for (int i = 1; i < counter.length; i++) {
            if (counter[i] > max) {
                System.out.println("Max: " + max);
                System.out.println("Int[i]" + counter[i]);
                max = counter[i];

            }
        }

        System.out.println("Najczęściej występującą liczbą jest liczba " + counter[max] + " ,wystąpiła " + max + " razy");

    }
}