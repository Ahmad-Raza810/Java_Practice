package JavaPractice;

public class MyArray {
    public static void main(String[] args) {
        int [] a;
        a=new int[5];
        System.out.println(a.toString());

        // c and b both are refrence that can point  a integer array.
        int []c,b;
        b=a;
        c=null;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);

        //Default value is zero for int type.
        System.out.println("Default value:"+a[4]);

        //Default value is null for String.
        String s[]=new String[10];
        System.out.println(s[9]);

        int []compileTime={2,4,5,6};
        System.out.println("The Last value:"+compileTime[3]);

        float floatArray[]=new float[]{2,3,3.1f,6.77f};

        for(float f:floatArray)
        {
            System.out.print(f+"  ");
        }
        System.out.println("\n_____________________________________________________________________________________________\n");

    }
}
