public class Patterns4{
    public static void hallow_rect(int totrows, int totcols){
        for ( int i=1; i<=totrows; i++){ //outerloop
           for (int j=1; j<=totcols ; j++){ //inner loop
            if (i==1 || i==totrows|| j==1 || j==totcols){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
           }
           System.out.println();
        }
        
    }
    public static void main(String args[]){
        hallow_rect(4, 5);
    }
}