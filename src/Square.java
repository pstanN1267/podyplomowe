public class Square {
    public static void main(String[] args) {
        pole(5);
        obwod(5);
    }

    public static void   pole(int bok){
        int pole = bok * bok;
        System.out.println("Pole kwadratu o boku " + bok + " wynosi: " + pole);
    }

    public static void obwod(int bok){
        int obwod = 4 * bok;
        System.out.println("Obwód kwadratu o boku " + bok + " wynosi: " + obwod);
    }

}
