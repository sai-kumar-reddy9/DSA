public class ArrayRev{
    public static void Rev(int numbers []){
        int first=0 , last=numbers.length-1;
        while(first<last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }

    }
    public static void main(String args[]){
        int numbers []= {2, 4, 5, 6, 8, 10};
       Rev(numbers);
        //print the array
        for (int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}