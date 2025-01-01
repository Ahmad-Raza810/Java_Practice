package JavaPractice;

public class StringMethods {
    public static void main(String[] args) {
        String userName="Ajay mishra";
        String newUser=new String("Ajay Mishra");
        System.out.println("Charcter in String:"+userName.length());

        //if given index is not valid then it give exception StringIndexOutOfBoundsException
        char output=userName.charAt(5);
        System.out.println("output Charcter"+output);

        System.out.println("comparison with Cheking case:"+userName.equals(newUser));
        System.out.println("comparison without Cheking case:"+userName.equalsIgnoreCase(newUser));



    }
}
