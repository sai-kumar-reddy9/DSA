import java.util.*;
public class Greatof3{
    public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    if ((A>=B) && (A>=C)){
        System.out.println(A+" is greater");
    } 
    else if (B>=C) {
        System.out.println( B +" is greater");

    }
    else{
        System.out.println(C +" is greater");
    }
    sc.close();
 }
}