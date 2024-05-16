public class Patterns6{
    public static void Inverted_halfprmd(int totrows) {
        for(int i=0; i<=totrows; i++){
            for (int j=1; j<=totrows-i; j++){
                System.out.print(j+" ");
            }
            /*for (int j=1; j<=i; j++){
                System.out.print(" ");
            }*/
            System.out.println();
        }
    }
    public static void main (String args[]){
        Inverted_halfprmd(5);
    }
}