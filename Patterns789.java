public class Patterns789{
    public static void FloydsTri(int n) {
        int counter=1;

        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }


  public static void zero1_Tri(int n){
    for (int i=1; i<=n; i++){
        for (int j=1; j<=i; j++){
            if ((i+j)%2 == 0){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
        }
        System.out.println();
    }

  }


  //Butterfly patterns

  public static void Butterfly(int n){
    //upper pattern
    for (int i=1 ; i<=n; i++){
           //stars i
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces 2*(n-i)
            for (int j=1 ; j<= 2*(n-i) ; j++){
                System.out.print(" ");
            }

            //starts i
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
    }

    //lower pattern
    for (int i=n ; i>=1; i--){
        //stars i
        for (int j=1; j<=i; j++){
            System.out.print("*");
        }
        //spaces 2*(n-i)
        for (int j=1 ; j<= 2*(n-i) ; j++){
            System.out.print(" ");
        }

        //starts i
        for (int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}


    public static void main(String []args){
        //FloydsTri(5);
        //zero1_Tri(5);
        Butterfly(4);
    }
}