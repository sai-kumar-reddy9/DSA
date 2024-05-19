public class BintoDeci{
    public static void convert(int biNum) {
        int mynum= biNum;
        int decnum=0;
        int pow=0;
        while(biNum>0){
            int lastdig = biNum%10;
            decnum= decnum+(lastdig * (int) Math.pow(2,pow));
            pow++;
            biNum= biNum/10;
        }
        System.out.println("the decimal num of "+ mynum +" is "+ decnum );
    }

    public static void main (String args[]){
       convert(101);

    }
}