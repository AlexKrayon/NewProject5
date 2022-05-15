package day3;

public class Bos8 {
    public static void main(String[] args) {
        String a= "I love Java";

        String reverse = a.substring(a.indexOf("l"), a.lastIndexOf(" "));

        System.out.println(reverse);
        String b = "";
        for (int i = reverse.length()-1; i >=0 ; i--) {
            b += reverse.charAt(i);
        }
        System.out.println(b);


        String c= a.replaceFirst("love",b);

        System.out.println(c);




    }
}
