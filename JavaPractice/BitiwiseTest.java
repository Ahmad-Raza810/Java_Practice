package JavaPractice;

public class BitiwiseTest {
    public static void main(String[] args) {
        //to perform manipulation on bit level

        //operands -->byte,short,int,long

        //operators
        //Bitiwise and (&)
        int testVariable=2;
        System.out.println(testVariable & 3);

       // Bitiwise or  (|)
        System.out.println(testVariable | 3);

        // Bitiwise xor (^)
        System.out.println(testVariable ^ 3);

        // Bitiwise not (~)  0 -->1  and  1 -->0
        System.out.println(Integer.toBinaryString(~testVariable));

        // Bitiwise left Shift (<<) --> its shift bits to left
        short anotherTestVariable=5;
        System.out.println("number binary:"+Integer.toBinaryString(anotherTestVariable));

        System.out.println("Left shift :"+Integer.toBinaryString(anotherTestVariable<<2));

        // Bitiwise right shift (>>) --> its shift bits to right
        System.out.println("Right Shift: "+Integer.toBinaryString(anotherTestVariable>>2));


        // Bitiwise unsigned right shift (>>>)
        //no addin bit after right shifting
        System.out.println("Unsigned Right Shift"+Integer.toBinaryString(anotherTestVariable>>>2));



    }

}
