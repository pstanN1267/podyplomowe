package vars;

public class Lab3 {



    public static int pole(int bokKwadratu){
        int pole = bokKwadratu * bokKwadratu;
        System.out.println("Pole kwadratu: " + pole);
        return pole;

    }

    public static int obwód (int bokKwadratu){
        int obwód = 4 * bokKwadratu;
        System.out.println("Obwód kwadartu: " + obwód);
        return obwód;
    }

    public static double przekątna(int bokKwadratu){
        double przekątna = (Math.sqrt(2) * bokKwadratu);
        System.out.println("Przekątna kwadratu: " + przekątna);
        return przekątna;
    }
        public static void printData(int bokKwadratu){
            System.out.println("Bok kwadratu: " + bokKwadratu);
        pole(bokKwadratu);
        obwód(bokKwadratu);
        przekątna(bokKwadratu);


        }


    public static void main(String[] args) {
        int a = 2;

        printData(a);
        a = 7;
        printData(a);
        a = 11;
        printData(a);
        a = 19;
        printData(a);



        /*System.out.println("Długość boku kwadratu: " + a + " \nPole powierzchni: " + pole(a) +
                "\nObwód: " + obwód(a) + "\nDługość przekątnej: " + przekątna(a));
        System.out.println(" ");

        System.out.println("Długość boku kwadratu: " + b + " \nPole powierzchni: " + pole(b) +
                "\nObwód: " + obwód(b) + "\nDługość przekątnej: " + przekątna(b));
        System.out.println(" ");

        System.out.println("Długość boku kwadratu: " + c + " \nPole powierzchni: " + pole(c) +
                "\nObwód: " + obwód(c) + "\nDługość przekątnej: " + przekątna(c));
        System.out.println(" ");

        System.out.println("Długość boku kwadratu: " + d + " \nPole powierzchni: " + pole(d) +
                "\nObwód: " + obwód(d) + "\nDługość przekątnej: " + przekątna(d));
*/
    }
}
