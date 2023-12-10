package zjazd2.Loops;

public class
LoopBinaryConverterLab7popr {
    public static void main(String[] args) {



            String binary = "1110000110000101100101000000";
        Long result = 0L;


        for (int i = 0; i < binary.length(); i++) {
            int reverseIndex = binary.length() - 1 - i;
            char c = binary.charAt(reverseIndex);
            int bit = Character.getNumericValue(c);


           result += bit * (long)Math.pow(2, i);

        }
        System.out.println(binary + " = " + result);
    }
}
