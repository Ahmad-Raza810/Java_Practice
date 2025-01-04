package JavaPractice;
import java.util.Arrays;
public class MyArrays {
    static int a[];
    public static void main(String[] args) {

        System.out.println("static refrence :"+a);

        char test[][]=new char[3][];
        //System.out.println(test[0].length);      ----> NullPointerException

        int numbers[]=new int[]{25,18,13,4,6};
        char letters[]=new char[]{'A','a','Z','z','x','g','O'};
        Arrays.sort(numbers);
        System.out.print("Sorted Number: ");

        for (int number:numbers) {
            System.out.print(number+" ");
        }

       //lexicographical sorting..............
        Arrays.sort(letters);
        System.out.print("\nSorted Charcter: ");
        for (char letter:letters) {
            System.out.print(letter+" ");
        }

        System.out.println("\n____________________________________________________________________________________________\n");

        Student Students[]=new Student[3];
        Student s3,s2,s1=new Student("Ahmad",20);
        s2=new Student("Raza",18);
        s3=new Student("Nasir",19);
        Students[0]=s1;
        Students[1]=s2;
        Students[2]=s3;

        System.out.println("Before Sorting: ");
        for (Student  student:Students) {
            System.out.print(student.Name+" "+student.Age+"\n");
        }
        Arrays.sort(Students);
        System.out.println("\nAfter Sorting: ");
        for (Student  student:Students) {
            System.out.print(student.Name+" "+student.Age+"\n");
        }

    }
}

class Student implements Comparable<Student>{
    String Name;
    int Age;
   Student(String Name,int Age)
   {
       this.Name=Name;
       this.Age=Age;
   }
    @Override
    public int compareTo(Student o) {
     return this.Age - o.Age;
   }
    // Natural order by roll number
    //When sorting, TimSort (or another algorithm) will start comparing the Student objects by their Age.
    //It calls compareTo() on the Student objects.
    //Ahmad (20) vs. Raza (18) --→ compareTo returns a positive value because 20 > 18, so Ahmad stays after Raza.
    //Ahmad (20) vs. Nasir (19) --→ compareTo returns a positive value because 20 > 19, so Ahmad stays after Nasir.
    //Raza (18) vs. Nasir (19) --→ compareTo returns a negative value because 18 < 19, so Raza stays before Nasir.

}
