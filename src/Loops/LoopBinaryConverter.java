package Loops;

import java.util.StringTokenizer;

public class LoopBinaryConverter {
    public static void main(String[] args) {

////                long binary = Long.parseLong(strBinary);
//        System.out.println(binary);
//// tokenizer i nastepnie kazdy osobny string na działanie
//
//        StringTokenizer strBinary = "00111111";
        //

            String binary = "1101101111100";
        Long result = 0L;

        // 1 1 0 1
        // 0 1 2 3 - indeks
        // 3 2 1 0 - odwrócony indeks (Długość - 1 - i)

        for (int i = 0; i < binary.length(); i++) {
            int reverseIndex = binary.length() - 1 - i;
            char c = binary.charAt(reverseIndex);
            int bit = Character.getNumericValue(c);

            result += bit * (int)Math.pow(2, i);

        }
        System.out.println(binary + " = " + result);
    }
}