public class facto{
    public static int factorial(int n){
        int f = 1;
        for (int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    }
    public static int binCoeff(int n, int r){
        int factn = factorial(n);
        int factr = factorial(r);
        int factnmr = factorial(n-r);
        int binCoeff = factn/(factr*factnmr);
        return binCoeff;
    }


    public static void main (String args[]) {
        System.out.println(binCoeff(5,2));
    }
}