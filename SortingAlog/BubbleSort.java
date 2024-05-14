import java.util.Arrays;
public class BubbleSort{
    public static void bubble(int array[]){
        for (int round=0; round<array.length-1; round++){
            for(int j=0; j<array.length-1-round; j++){
                if(array[j]> array[j+1]){
                //swap
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
                }
                
            }
        }
    }
    public static void printarr(int array[]){
        for(int i=0; i<array.length; i++){
        System.out.print(array[i]+" ");
        }
    }



    public static void SelectionSort(int array[]){
        for(int i =0; i<array.length; i++){
            int minPos = i;
            for (int j=i+1; j<array.length; j++){
                if(array[minPos]>array[j])
                minPos = j;

            }
            //swap
            int temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;

        }
    }

    public static void InsertSort(int array[]){
        for(int i=1; i<array.length; i++){
            int curr = array[i];
            int prev = i-1;
            //to find where to insert
            while(prev>=0 && array[prev]>curr){
                array[prev+1] = array[prev];
                prev--;
            }
            //to insert
            array[prev+1] = curr;

        }
    }
    public static void main (String args[]){
        int array[] = {2, 5, 3, 1, 4};
        //bubble(array);
        //SelectionSort(array);
        //InsertSort(array);
        Arrays.sort(array);
        printarr(array);
    }
}