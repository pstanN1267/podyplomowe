package zjazd2.Classes.Arrays;

public class ThreeDimensionalArrayLab8 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 5, 123, 54, 65, 64};
        int[] arr2 = {9, 14, 2, 23, 154, 12, 0};
        int[] arr3 = {0, 6, 8, 541, 54, 65, 23};

        int[][][] multiArray = {{arr1}, {arr2} , {arr3}};


        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                for (int k = 0; k < multiArray[i][j].length; k++) {
                    System.out.println("[" + i + "]" + "[" + j +  "]" +  "[" + k + "] = " + multiArray[i][j][k]);
                }
            }
        }


    }
}
