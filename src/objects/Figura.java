package objects;

/*Utwórz klasę ze zmiennymi egzemplarza height, width, depth, będącymi liczbami całkowitymi.
Utwórz aplikację, która korzysta z nowej klasy, ustawia zmienne w obiekcie a następnie je wyświetla.*/
public class Figura {

    public static void main(String[] args) {

        FiguraDane figura = new FiguraDane();

        figura.height = 10;
        figura.widht = 213;
        figura.depth = 30;

        System.out.println("Wysokość " + figura.height + "\nSzerokość: " + figura.widht +  "\nGłębokość " + figura.depth);


    }
}
