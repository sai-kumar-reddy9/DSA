import java.util.*;
public class PrimeorNot{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==2){
            System.out.println("is a prime number");
        }else{
            boolean isPrime =true;
            for(int i=2;i<=Math.sqrt(n);i++){ //or i<=n-1
                if(n%i==0){
                    isPrime=false;
                }
            }
              if (isPrime==true){
                System.out.println("is prime number bruh");
                }else{
                System.out.println("is not a prime number bruh");
                }
        }
    }
}