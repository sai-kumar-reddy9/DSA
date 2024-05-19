public class facto{

    public static int factorial(int n){
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        int f=1;
        for(int i=1; i<=n; i++){
        f=f*i;
       }
        return f;
    }

    public static int binomialcof(int n, int r){
        if (n < 0 || r < 0 || r > n) throw new IllegalArgumentException("Invalid input values");
        int nfacto = factorial(n);
        int rfacto = factorial(r);
        int nmrfacto = factorial(n-r);
        int binocoff = nfacto/(rfacto*nmrfacto);
        return binocoff;
    }
    

    public static void main(String[] args) {
        try {
            System.out.println(factorial(4)); // Output: 24
            System.out.println(binomialcof(3, 2)); // Output: 3
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}   