
public class DataType {
    public static void main(String[] args) {

        //1.integers numbers
        //byte
        //short
        //int
        //long

        System.out.println(Long.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        //2.pointing
        //float   ----> around 7 digit after decimal
        //double   ----> around 10-15digit after decimal

        //use scientific notation for large numbers
        float s1=1004384604846584384360.43793f;
        double s2=1000.68953574844030035;
        System.out.println(s1+"\n"+s2);
        System.out.println("Double minimum and maximum value:");
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        System.out.println("float minimum and maximum value:");
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MIN_VALUE);

        //3.char
        char myChar='A';
        System.out.println((int) myChar);
        System.out.println("Charctre min value: "+(int)Character.MIN_VALUE);
        System.out.println("Charctre max value: "+(int)Character.MAX_VALUE);

        //Unicode representation of character and hexadecimal number....
        // 0 1 2 3 4 5 6 7 8 9 A B C D E F
        char heartSymbol='\u2764';
        System.out.println(heartSymbol);

        //another way
        char numberAsCharcter=6580;
        System.out.println(numberAsCharcter);

        //ASCII -->A subset of unicode(0 to 127)
        //Total=128
         for(int i=0;i<=127;i++)
         {
             System.out.print((char)i);
         }

        //4.boolean
            boolean isEligible=true;
         //there are two type of conversion
         //1.Widing
        // 2.Narrowing
        //a float can contain a long due to scientific notation
        long j= 99904468242429409L;
        float f=j;
        System.out.println("\n"+f);


        //a long can hold value of a float or double?
        long x=(long)f;
        System.out.println(x);

        //a method for converting  decimal number to binary number
        //return a string
        int aNumber=(int)Long.MAX_VALUE;
        System.out.println(Integer.toBinaryString(aNumber));


        //compound assingnment operator
        //performs implicit conversion
        byte myByte=10;
        myByte=(byte)(myByte+20);

       //demo
        byte myByte2=10;
        myByte2+=10;
    }
}
