public class ArrayPairs{
    public static void Pairs (int nums[])  {
        for(int i=0; i<nums.length; i++){
            int curr= nums[i];  //2,4,6,8,10
            for (int j=i+1; j<nums.length; j++){
                System.out.print("("+curr+","+nums[j]+")");
            }
            System.out.println();
        }
    }
    public static void main (String args[]){
        int nums[]= {2, 4, 6, 8, 10};

        Pairs(nums);

    }
}