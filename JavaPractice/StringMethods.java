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
        System.out.println("\n___________________________________________________________________________________\n");

        String s1="java";
        String s2="jav";

       //The compareTo method compares two strings lexicographically, based on their Unicode values.

       //The first three characters in both strings are the same: 'j', 'a', 'v'.
       // Since s2 has no more characters and s1 has one additional character 'a', the comparison is based on their lengths.
        //result = s1.length() - s2.length();
        //
        //In this case:
        //
        //s1.length() = 4
        //s2.length() = 3
        //result = 4 - 3 = 1
        int result=s1.compareTo(s2);
        System.out.println(result);

        //ignore case
         result="refrence".compareToIgnoreCase("ReFRence");
        System.out.println(result);

        System.out.println("\n_____________________________________________________________________________________________\n");

        String name="Ahmad Raza";
        System.out.println("Substring one:"+name.substring(6));

        //take 2nd index as a ending index with exclusive.
        System.out.println("Substring two:"+name.substring(0,name.length()));


        System.out.println("Name in Uppercase:"+name.toUpperCase());
        System.out.println("Name in Lowercase:"+name.toLowerCase());

        //below method remove spaces from begining and ending of a string.........
        // name.trim()

    }
}
