public class RevOfArray {

    public static void Reverse(int numbers[]){
        int first=0; int last=numbers.length-1;
        //swape
        while(first<last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int numbers[] = {3,5,7,4,8,2};
        Reverse(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
