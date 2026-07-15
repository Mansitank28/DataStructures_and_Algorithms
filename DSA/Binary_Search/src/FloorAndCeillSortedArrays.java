public class FloorAndCeillSortedArrays {

    public static void main(String[] args) {

        int[] nums = {10,20,30,40,50};
        int x = 25;

        int result = searchType(nums,x);
        System.out.println("i======="+result);
    }
    // Time complexity is - O(log2n) Big of logarithmic base two 2 n
    private static int searchType(int[] nums, int x) {

        int low=0, high = nums.length-1;
        int ans = -1;
        while(low <= high){

            int mid= (low+high) /2;
            if(nums[mid] <= x){
                ans = nums[mid];
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}
