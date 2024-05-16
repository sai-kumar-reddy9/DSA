public class Patterns1011{
    public static void Solid_Rhombus(int n){
        for (int i=1; i<=n; i++){
            //1st spaces- n-i
          for(int j=1; j<= n-i; j++){
            System.out.print(" ");
          }
          //stars - n
          for (int j=1; j<=n; j++){
            System.out.print("*");
          } 
          //2nd spaces- i-1
          for (int j=1; j<=i-1; j++) {
            System.out.print(" ");
          }
          System.out.println();   
        }
    }



    public static void Hollow_Rhombus(int n){
        
        for (int i=1; i<=n; i++){
          //1st spaces n-i
          for(int j=1; j<= n-i; j++){
            System.out.print(" ");
          }
          //hollow rectangle code
          for (int j=1; j<=n; j++){
            if (j==1 || j==n || i==1 || i==n){
              System.out.print("*");
            }else{
              System.out.print(" ");
            }
          }
          //2nd spaces i-1
          for (int j=1; j<=i-1; j++){
            System.out.print(" ");
          }
          System.out.println();

        }
    }




    //Diamond 
    public static void Diamond(int n){
      //for 1st half
      for(int i=1; i<=n; i++){
        //1st spaces = n-i
        for(int j=1; j<=n-i; j++){
          System.out.print(" ");
        }
        //stars = 2i-1
        for(int j=1; j<=2*i-1; j++){
          System.out.print("*");
        }
        //2nd spaces n-i
        /*for(int j=1; j<=n-i; j++){
          System.out.print(" ");
        }*/
        System.out.println();
      }
    
     //for 2nd half
    for(int i=n; i>=1; i--){
      //1st spaces = n-i
      for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }
      //stars = 2i-1
      for(int j=1; j<=2*i-1; j++){
        System.out.print("*");
      }
      //2nd spaces n-i
      /*for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }*/
      System.out.println();
    }
  }

    public static void main (String [] args){
        //Solid_Rhombus(5);
        //Hollow_Rhombus(5);
        Diamond(5);
    }
}