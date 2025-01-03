package JavaPractice;

public class JaggedArray {
    public static void main(String[] args) {
        //an array where each element is an array, and the inner arrays can have different lengths.
        //all rows have not similar number of coulmn.

        String [][]s=new String[3][];

        //System.out.println(s[0][0]);

        s[0]=new String[]{"Python","Java"};
        s[1]=new String[]{"Js","Typescript","Php"};
        s[2]=new String[]{"GoLang","Ruby","HTML","Matlab"};

        String max="";
        for (String []Languagues:s)
        {
           for (String language:Languagues)
           {
             if (language.length()>max.length())
             {
                 max=language;
             }
           }
            System.out.println();
        }
        System.out.println("the longest element (length wise) : "+max);
    }
}