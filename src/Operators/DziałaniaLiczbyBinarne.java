package Operators;



public class DziałaniaLiczbyBinarne {
    public static void main(String[] args) {

        // 11001
        // 11101
        // &
        // 11001
        // 00011
        // ^
        // 11010

        int a = 0b11001;
        int b = 0b11101;
        int c = 0b00011;
        int result = 0b11010;

        boolean isCorrect = (a & b ^ c) == result;
        System.out.println("Sprawdzam czy podane działanie jest poprawne: " + isCorrect);


    }

}
