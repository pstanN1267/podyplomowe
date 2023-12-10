package zjazd3.OverloadingAndRidding;

public class CalculatorLab10 {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        CalculatorLab10 cal = new CalculatorLab10();
        int res1 = cal.add(1, 2);
        int res2 = cal.add(1, 2, 3);
        double res3 = cal.add(1.23, 1.54);
        double res4 = cal.add((1.05), 2.01, 3.01);

        System.out.println("suma dwóch liczb całkowitych: " + res1);
        System.out.println("suma trzech liczb całkowitych: " + res2);
        System.out.println("suma dwóch liczb dziesiętnych: " + res3);
        System.out.println("suma trzech liczb dziesiętnych: " + res4);

    }
}
