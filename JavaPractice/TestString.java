package JavaPractice;

public class TestString {
    public static void main(String[] args) {

         // string class is final and immutable class
        //all object by default storing in heap area
        //in heap area there is one moreplace
        // {heap area(string constant pool)}
        //string litral--->in scp
        //string constructor ---> one in heap and one in scp


        String str1 = new String("This is Bond");
        String str3 = new String("This is Bond");
        System.out.println(str1==str3);

        String str2 = "this is Bond";
        System.out.println(str1==str2);


        String str4 = "this is Bond";
        System.out.println(str2==str4);

    }
}
