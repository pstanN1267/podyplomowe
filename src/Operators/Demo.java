package Operators;

public class Demo {
    public static void main(String[] args) {


        /*
        * system dziesiętny 0 , 1, 2, 3, 4, 5 ,6 ,7 ,8 ,9
        *
        * 154 => 1 * 10^2 + 5 * 10^1 + 4 * 10^0 = 154
        *
        * system dwójkowy 0, 1
        *  101 = 1 * 2^2 + 0 * 2^1 + 1 * 2^0 = 4 + 0 + 1 = 5
        *
        * system ósemkowy 0 , 1 , 2 , 3 , 4 ,5, 6 , 7
        *
        * w systemie ósemkowy ->47 -> 4 * 8^1 + 7 * 8^0 = 49
        * 126 ->  x * 8^2 + y * 8^1 + z * 8^0 = 1 * 64 + 7 * 8  + 6 * 1 =
        *
        * system szesnastkowy 0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f
        *
        * 3af -> 3 x 16^2 + 10 * 16^1  + 15 *16^0 = 3 * 256 + 160 + 15 = 943
        *
        *
        * */

        /*System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toOctalString(47));
        System.out.println(Integer.toHexString(943));
*/
/*
        int a = 11; // 00000000 00000000 00000000 00001011
        System.out.println(Integer.toBinaryString(a));

        int x = 0xabcdef;// 0b - binary , 0 - ósemkowy, 0x - szesnastkowy
        System.out.println(x);
*/
        /*

        * & - iloczy bitowy
        * | - suma bitowa
        * ^ - XOR
        * ~ - negacja
        * << - przesuniecie bitowe w lewo
        * >> - przesunięcie bitowe w prawo
        *
        * */

        int a = 1;
        int b = 5;

        System.out.println(b << 6);

        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(' ', '0'));
        System.out.println("----------------------------");
        System.out.println(String.format("%32s", Integer.toBinaryString(b << 6)).replace(' ', '0'));


        /*
        *  1 1 -> 0
        *  1 0 -> 1
        *  0 1 -> 1
        *  0 0 -> 0
        * */



    }
}
