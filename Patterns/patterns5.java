public class patterns5{
    public static void Half_pyramid(int totrows){
        //outer loop
        for (int i = 1 ; i<=totrows ; i++){
            //inner loop
            for (int j=1; j<=totrows-i ; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main ( String []args){
        Half_pyramid(4);
    }
}