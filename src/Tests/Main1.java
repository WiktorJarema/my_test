package Tests;

public class Main1 {

    public static void main(String[] args) {

        String s1 = new String("test");
        String s2 = "test";
        String s3 = "test";
        s1 = s1.intern();

        System.out.println("s1 = s2: " + (s1 == s2)); //false
        System.out.println("s2 = s3: " + (s2 == s3)); //true

    }

}
