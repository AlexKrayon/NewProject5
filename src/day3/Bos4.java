package day3;

import java.util.Arrays;

public class Bos4 {
    public static void main(String[] args) {


        int[] nums1 = {1, 2, 3, 4, 5, 9, 7, 8, 6};
        int[] nums2 = {17, 12, 11, 13, 14, 15, 16, 10, 18};


        int [] num3 = merge1(nums1,nums2);
        System.out.println(Arrays.toString(num3));
        Arrays.sort(num3);
        System.out.println(Arrays.toString(num3));

        System.out.println("--------------------------------");
           // int[] temp1={};
        for (int i = 0; i < num3.length-1; i++) {

            for (int j = i+1; j < num3.length; j++) {
                if(num3[i]>num3[j]){
                    int temp1=num3[i];
                    num3[i]=num3[j];
                    num3[j]=temp1;
                }


                }

            }
        System.out.println(Arrays.toString(num3));







                        }






    public static int[] merge1(int[] nums1, int[] nums2) {
        int[]result= new int[nums1.length+nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            result[i]=nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            result[i+ nums1.length]=nums2[i];
        }
       return result;

    }


}
