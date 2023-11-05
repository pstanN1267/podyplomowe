package Arrays;

import java.awt.*;

public class Demo {
    public static void main(String[] args) {
/*
        String[] requests;
        Point[] points;
        float[] donations;

        String targets[];*/

//        int[] temps = new int[99];
//        temps[4] = 77;
//
//        System.out.println(temps[4]);
//        System.out.println(temps[87]);


        /*Integer[] series = new Integer[3];

        series[0] = 10;
        series[1] = 3;
        series[2] = 5;

        System.out.println(series[0] + " " + series[1] + " " + series[2]);
        */


//        Integer[] series = {10, 3, 5};
//        System.out.println(series[2]);

        char[] letters = {'a', 'b', 'c'};


//        Point[] points = {new Point(0, 0), new Point(1, 2), new Point(23, 54)};
//        Point point = new Point(1, 1);
//        Point[] points = new Point[3];
//
//        points[0] = point;
//        points[1] = new Point(1, 1);
//        points[2] = new Point(1, 1);
//
//        points[1].x = 50;
//
//        System.out.println(points[0]);
//        System.out.println(points[1]);
//        System.out.println(points[2]);
//
//
//        String[] citys = new String[80];
//        String[] countrys = new String[236];
//        String[] powiaty = new String[58];


//        int[] array = {1, 2, 3, 4, 5, 41, 87,};
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i] + " " + i);
//        }
//
//        for (int number : array) {
//            System.out.println(number);
//        }

        String[] dogs = {"Burek", "Pluto", "Łajka"};
        String[] people = {"Ania", "Wojtek", "Dorota"};

        String[][] names = {dogs, people};

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        int [][][]  multi = {{{1}},{{1},{2}}};
    }

}
