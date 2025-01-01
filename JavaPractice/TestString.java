package JavaPractice;

public class TestString {
    public static void main(String[] args) {


        String str1 = new String("This is Bond");
        String str3 = new String("This is Bond");
        System.out.println(str1==str3);

        String str2 = "this is Bond";
        System.out.println(str1==str2);


        String str4 = "this is Bond";
        System.out.println(str2==str4);

    }
}
