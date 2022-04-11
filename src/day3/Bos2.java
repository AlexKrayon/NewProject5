package day3;

public class Bos2 {
    public static void main(String[] args) {

        double a = rectangle(2.5,4.5);

        System.out.println(a);

        int a2=rectanglePerimeter(4,2);




    }


    public static double rectangle(double length, double width){

        double result= length * width;
        return result;

    }

    public static int rectanglePerimeter (int length, int width){

        int result1 = 2*(length+width);
        System.out.println(result1);


        return result1;
    }




}
