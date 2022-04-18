package day3;

import java.util.Arrays;

public class Bos5 {
    public static void main(String[] args) {
        int [] arr=new int[5];
        arr[0]=4;
        arr[1]=6;
        arr[2]=2;
        arr[3]=8;
        arr[4]=3;

        System.out.println(Arrays.toString(arr));

        bos(arr);

        //System.out.println(bos(arr));

       // int a =bos(arr);
       // System.out.println(a*2);


    }

    public static void bos(int []arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
        //return sum;
    }


}
