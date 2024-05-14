import java.util.*;
public class Arrays2{
    public static void update(int marks[], int remain){
        remain= 11;
        for (int i=0; i<marks.length; i++){
            marks[i] = marks [i]+1;
        }
    }


    public static void main(String []args){

        int marks[] = {89, 90, 99};
        int remain = 69;
        update(marks, remain);
        // to print marks
        for (int i=0; i<marks.length; i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println(" marks which remain same: "+ remain);
    }
}