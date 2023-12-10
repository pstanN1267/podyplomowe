package zjazd2.objects;

import java.util.StringTokenizer;

// Utwórz program, który zmienia datę urodzin w formacie DD/MM/RRRR (na przykład 29/04/2016) na trzy oddzielne teksty.
public class DateChanger {
    public static void main(String[] args) {
        StringTokenizer str1;
        String date = "29/05/1932";
        str1 = new StringTokenizer(date, "/");
        System.out.println("Urodziny: " + date);
        System.out.println("Dzień: " + str1.nextToken());
        System.out.println("Miesiąc: " + str1.nextToken());
        System.out.println("Rok: " + str1.nextToken());

//        String birthday = "29/04/2016";
//
//        String day = birthday.substring(0,2);
//        String month = birthday.substring(3, 5);
//        String year = birthday.substring(6, 10);
//        System.out.println("Urodziny: " + birthday);
//        System.out.println("Dzień: " + day + "\nMiesiąc:  " + month + "\nRok: " + year);
    }
}
