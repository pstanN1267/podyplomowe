package objects;

public class EqualsTester {

    public static void main(String[] args) {
        String str1, str2;

        str1 = "Ale to się rozrasta.";

        str2 = str1;

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        System.out.println("Ten sam obiekt? " + (str1 == str2));

        str2 = new String(str1); // stworzenie nowego obiektu z tą samą informacją

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("Ten sam obiekt? " + (str1 == str2)); // sprawdzenie czy
        System.out.println("Ten sama wartość? " + (str1.equals(str2))); // sprawdzenie czy





    }
}
