package day3;

import java.util.Arrays;

public class Bos6 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int [] result2 = reverse1(arr);
        System.out.println(Arrays.toString(result2));

    }

    private static int[] reverse1(int[] arr) {
        int[] result2 = new int[arr.length];
        for (int i = arr.length -1, j=0; i >= 0 ; i--,j++) {
            result2[j]=arr [i];
        }
        return result2;
    }


}
