package Loops;

public class LoopBinaryConverterLab7 {

    // function for converting binary to decimal number
    public static long  getDecimalNumber(String binaryNumber) {
        long decimalNumber = 0L;
//        int power = 0;
//       int i = 0;
        System.out.println(binaryNumber.length());
        int[] array = new int[binaryNumber.length()];
        boolean quit = false;
        while (quit){


            quit = true;

        }
        // pętla po wyrach stringa i kazdy do odpowiedniej potęgi, ale od najwyższej potęgi -1;

return decimalNumber;

//        while (binaryNumber > 0) {
//            //taking the rightmost digit from binaryNumber
//            int temp = binaryNumber % 10;
//            System.out.println(temp);
//            //now multiplying the digit and adding it to decimalNumber variable
//            decimalNumber += temp * Math.pow(2, power);
//            //removing the rightmost digit from binaryNumber variable
//            binaryNumber = binaryNumber / 10;
//            //incrementing the power variable by 1 to be used as power for 2
//            power++;
//        }
//        return decimalNumber;
    }


    public static void main(String[] args) {
//        System.out.println("Decimal value is: "+getDecimalNumber(111010)); // 0 + 2 + 0 + 8 + 16 + 32
        System.out.println("Decimal value is: " + getDecimalNumber("001010"));

    }
}
