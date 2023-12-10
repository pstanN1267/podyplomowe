package zjazd2.Arrays;

public class Counter {
    public static void main(String[] args) {

//        String[] cyfry = {"4", "1", "1", "4", "2", "3", "4", "4", "1", "2", "4", "9", "3"};
//
//        int counter1 = 0;
//        int counter2 = 0;
//        int counter3 = 0;
//        int counter4 = 0;
//        int counter9 = 0;
//
//        for (int i = 0; i < cyfry.length; i++) {
//
//            switch (cyfry[i]){
//
//                case "1":
//                    counter1 +=1;
//                    break;
//                case "2":
//                    counter2 +=1;
//                    break;
//                case "3":
//                    counter3 += 1;
//                    break;
//                case "4":
//                    counter4 += 1;
//                    break;
//                case "9":
//                    counter9 +=1;
//                    break;
//
//            }
//        }
//
////        Math.max(counter3,(Math.max(counter1, counter2));
//        System.out.println(counter1);
//        System.out.println(counter2);
//        System.out.println(counter3);
//        System.out.println(counter4);
//        System.out.println(counter9);

//        Rozwiązanie miklas:

        int[] arr = {3, 6, 3, 5, 5, 2, 6, 8, 0, 1,4,2,1,5,521,34,1243,521,521,521}; // jeśli chcemy zwiekszyc zakres, tzn nie tylko cyfry ale tez liczby to treba
                                                                                    // zmienic zakres drugiego ciagu


        int[] counters = new int[1000000];

        for (int i = 0; i < arr.length; i++) {
            counters[arr[i]]++; // zwiększa odpowiedni wyraz tablicy jesli ona występuje
        }

        int mostFrequent = 0;
            for (int i = 0; i < counters.length; i++) {
            if(counters[i] > counters[mostFrequent]){ // przesuwa wskazanie na najczesciej wystepujący wyraz
                mostFrequent = i;
            }
        }

        System.out.println("Najczęściej występującą cyfrą w tablicy jest cyfra: " + mostFrequent+ ", wystąpiła " + counters[mostFrequent] + " razy");
    }
}
