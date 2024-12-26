public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int i=0;
        for(int n: nums){

            if(i<1 || n>nums[i-1]){
                nums[i]=n;
                i++;
            }
        }
        System.out.println(i);
    }
}