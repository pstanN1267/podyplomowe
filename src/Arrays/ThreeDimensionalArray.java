package Arrays;

public class ThreeDimensionalArray {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 5, 123, 54, 65, 64};
//        System.out.println(arr1.length);

        int[] arr2 = {9, 14, 2, 23, 154, 12, 0};
//        System.out.println(arr1.length);

        int[] arr3 = {0, 6, 8, 541, 54, 65, 23};
//        System.out.println(arr1.length);

        int[][][] multiArray = {{arr1}, {arr2} , {arr3}};



//        int [][][]  multi = {{{1, 3,5,3}},{{71,124}},{{2,415,65}}}; // sprawdzic jak wyglada w rzeczywistosc tablica tablic
//
        for (int i = 0; i < multiArray.length; i++) {
            for (int j  = 0; j <multiArray[i].length ; j++) {
                for (int k = 0; k < multiArray[i][j].length; k++) {
                    System.out.print("arr[" + i + "]["+ j + "]["+ k + "] = ");
                    System.out.println(multiArray[i][j][k]);
                }
            }
        }
    }
}
