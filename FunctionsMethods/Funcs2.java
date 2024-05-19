import java.util.*;
public class Funcs2{
    public static int Calsum(int num1,int num2){
        int Sum =num1+num2;
       return Sum;

    }
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = Calsum(a,b);
        System.out.println("sum is: "+sum);
    }
}