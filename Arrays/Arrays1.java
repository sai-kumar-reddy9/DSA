import java.util.*;
public class Arrays1{
    public static void main (String [] args){
        int marks [] = new int [74];
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println(" maths: "+ marks[0]);
        System.out.println(" physics: "+ marks[1]);
        System.out.println("Telugu: "+ marks[2]);

        marks[1]= marks[1]+1;
        System.out.println(" updated phys marks: "+ marks[1]);
        System.out.println("length of array: "+ marks.length);
    }
}