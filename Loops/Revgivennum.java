public class Revgivennum{
    public static void main (String args[]){
        int n=80403;
        int rev=0;
        while(n>0){
            int lastd = n%10;
            rev = (rev*10)+lastd;
            n = n/10;
           
        }
        System.out.println(rev);
    }
}