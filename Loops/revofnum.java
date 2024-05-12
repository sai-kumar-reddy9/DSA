public class revofnum{
    public static void main (String []args){
        int n=29702;
        while(n>0){
            int lastdigit= n%10;
            System.out.print(lastdigit);
            n = n/10;
        }
    }
}